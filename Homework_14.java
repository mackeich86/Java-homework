/*
Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
Все три числа разных типов необходимо в столбик вывести на экран
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifclass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число");
        String S = reader.readLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("S = " + S);
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
    }
}
