/*
 Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        Double number = Double.parseDouble(reader.readLine());
        int i = 1;
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
        System.out.printf("%f * %d = %f%n\n", number, i, number*i++);
    }
}
