/*
Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.
 */

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Homework_17 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите \"stop\", и нажмите ENTER чтобы сразу прекратить ввод и завршить программу." + "\n" + "Если вы уже ввели текст и хотите завершить программу, то введите \"stop\" с новой строки и нажмите ENTER.");
        try {
            FileWriter writer = new FileWriter("src/Homework_17.txt", true);
            for (String text; true; writer.flush()){
                text = reader.readLine();
                if (text.compareTo("stop") == 0) break;
                writer.write(text + "\n");
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода: "+e);
        }
    }
}
