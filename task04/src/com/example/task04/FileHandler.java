package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {

    private final String fileName;

    public FileHandler(String filePath) {
        this.fileName = filePath;
    }

    @Override
    public void handleMessage(String message) {
        // Пример использования FileWriter брал с METANIT.
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(message + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
