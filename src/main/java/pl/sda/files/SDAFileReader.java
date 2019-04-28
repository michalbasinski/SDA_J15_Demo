package pl.sda.files;

import pl.sda.model.Person;

import java.io.IOException;
import java.util.List;

public interface SDAFileReader {
    List<Person> read(String filePath) throws IOException;
}
