/*Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в
переменную number. В программе должны присутствовать константы X, Y, Z.
Программа должна сравнивать введенное значение с клавиатуры со значением
констант и вывести на экран сообщение "Данное значение имеется в константах"
если number=X или Y или Z. Если переменная отличается от констант, нужно вывести
оповещение "Такой константы нет!"*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework_7 {
    static final int X = 34,
            Y = 22,
            Z = 8;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number == Y || number == X || number == Z ? "Данное значение имеется в константах" : "Такой константы нет!");
    }
}
