package pl.sda.files;

import org.json.JSONArray;
import org.json.JSONObject;
import pl.sda.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONReaderSDA implements SDAFileReader {
    @Override
    public List<Person> read(String filePath) throws IOException {
        List<Person> result = new ArrayList<>();

        byte[] bytesFromFile = Files.readAllBytes(Paths.get(filePath));
        String content = new String(bytesFromFile);
        JSONArray fileContents = new JSONArray(content);

        for (Object entry : fileContents) {
            JSONObject entryParsed = new JSONObject(entry.toString());
            String name = entryParsed.getString("name");
            int personAge = entryParsed.getInt("age");
            Person person = new Person();
            person.setName(name);
            person.setAge(personAge);
            result.add(person);
        }

        return result;
    }
}
