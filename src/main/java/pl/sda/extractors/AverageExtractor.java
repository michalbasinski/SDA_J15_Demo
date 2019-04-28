package pl.sda.extractors;

import pl.sda.files.FileReaderFactory;
import pl.sda.files.SDAFileReader;
import pl.sda.model.Person;

import java.io.IOException;
import java.util.List;

public class AverageExtractor {
    public int getAverage(String filePath) throws IOException {
        FileReaderFactory factory = new FileReaderFactory();
        SDAFileReader reader = factory.produce(filePath);
        List<Person> persons = reader.read(filePath);

        int sum = 0;
        for (Person person : persons) {
            sum += person.getAge();
        }

        return sum / persons.size();
    }
}
