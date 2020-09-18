/*
Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int
и вывести на экран. Необходимо использовать циклы, нельзя использования готовые методы языка Java,
для перевода числа из одной системы счисления в другую.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Final_homework_1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в двоичном виде");
        String binary = null;
        boolean correct = true;
        int decimal = 0;
        try {
            binary = reader.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: "+e);
        }
        for (int i = 0; i < binary.length(); i++) {
            decimal *= 2;
            if (binary.charAt(i) == '1') decimal++;
            else  if (binary.charAt(i) != '0') {
                correct = false;
                break;
            }
        }
        System.out.println(correct ? decimal : "Двоичное число введено некорректно");
    }
}
