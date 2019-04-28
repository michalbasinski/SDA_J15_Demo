package pl.sda.files;

public class FileReaderFactory {
    public SDAFileReader produce(String filePath) {
        if (filePath.endsWith(".txt")) {
            return new CSVReaderSDA();
        }
        if (filePath.endsWith(".json")) {
            return new JSONReaderSDA();
        }
        return null;
    }
}
