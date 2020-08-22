/*
Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа x, y, z.");
        int x = Integer.parseInt(reader.readLine()),
                y = Integer.parseInt(reader.readLine()),
                z = Integer.parseInt(reader.readLine());
        double av = (double) (x + z + y) / 3;
        System.out.printf("Среднее арифмитическое - %.2f%n", av);
        if ((int) av / 2 > 3) System.out.print("Программа выполнена корректно");
    }
}
