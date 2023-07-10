package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

    public class FileReadWriteExample {
        public static void main(String[] args) {
            String fileName = "data.txt"; // Ім'я файлу

            // Запис даних до файлу
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write("Це довільні дані для прикладу.");
                writer.newLine();
                writer.write("Це ще один рядок.");
                writer.newLine();
                writer.write("І це третій рядок.");
                System.out.println("Дані успішно записані до файлу.");
            } catch (IOException e) {
                System.err.println("Помилка запису до файлу: " + e.getMessage());
            }

            // Читання даних з файлу та виведення їх на консоль
            try {
                String data = new String(Files.readAllBytes(Paths.get(fileName)));
                System.out.println("Прочитані дані з файлу:");
                System.out.println(data);
            } catch (IOException e) {
                System.err.println("Помилка читання з файлу: " + e.getMessage());
            }
        }
}


