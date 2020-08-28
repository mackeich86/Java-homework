/*
Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и
записаны в соответствующие переменные. Вывести на экран строку с наибольшей длиной.
Если длины равны, вывести соответствтующее сообщение.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifclass {
    public static void main(String[] args) throws IOException {
        String answer;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую строку");
        String text1 = reader.readLine();
        System.out.println("Введите вторую строку");
        String text2 = reader.readLine();
        if (text1.length()!=text2.length())
            answer = text1.length()>text2.length() ? text1 : text2 ;
        else
            answer = "Строки одинаковой длины";
        System.out.println(answer);
    }
}

