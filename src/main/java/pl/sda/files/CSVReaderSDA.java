package pl.sda.files;

import pl.sda.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderSDA implements SDAFileReader {

    @Override
    public List<Person> read(String filePath) throws IOException {
        List<Person> results = new ArrayList<>();

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(";");
            Person person = new Person();
            person.setName(tokens[0]);
            person.setAge(Integer.parseInt(tokens[1]));
            results.add(person);
        }
        return results;
    }

}
