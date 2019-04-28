package pl.sda;

import pl.sda.extractors.AverageExtractor;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            String filepath = "/home/michal/SDA/Java15/Projekty/demo/src/main/resources/persons.json";

            AverageExtractor extractor = new AverageExtractor();

            int average = extractor.getAverage(filepath);

            System.out.println("Średni wiek osób to: " + average);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}