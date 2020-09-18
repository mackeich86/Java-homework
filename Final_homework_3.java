/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FinalTask_3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double rate = 0, amountRub = 0;
        while (true) {
            System.out.printf("Введите курс доллара сумму в рублях.\nКурс доллара = ");
            try {
                rate = Double.parseDouble(reader.readLine());
                System.out.print("Количество рублей: ");
                amountRub = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода: " + e);
            }
            if (rate > 0 && amountRub > 0) break;
            else System.out.println("Значения должны быть больше 0");
        }
        System.out.printf("Итого: %.2f долларов", amountRub/rate);
    }
}
