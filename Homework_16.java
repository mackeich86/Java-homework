/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Homework_16 {
    public static void main(String[] args) {
        String text;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Homework_16.txt"));
            while ((text = reader.readLine())!= null)
                System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: "+e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: "+e);
        }
    }
}
