/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FinalTask_2 {
    // Выбрал сортировку Шелла
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = 0;
        System.out.println("Введите размер массива чисел");
        try {
            size = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите %dй элемент массива\n", i + 1);
            try {
                arr[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода: " + e);
            }
        }
        int step = arr.length / 2;
        while (step > 0) {
            for (int right = 0; right < arr.length; right++)
                for (int c = right - step; c >= 0; c -= step)
                    if (arr[c] > arr[c + step])
                        swap(arr, c, c + step);
            step = step / 2;
        }
        System.out.println("Отсортированный по возрастанию массив чисел: ");
        for (int i : arr) System.out.println(i);
    }

    private static void swap(int[] array, int c, int i) {
        int tmp;
        tmp = array[c];
        array[c] = array[i];
        array[i] = tmp;
    }
}
