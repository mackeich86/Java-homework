/*
Произведите ввод данных с клавиатуры в массив,
а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2.
Размер массива задается пользователем.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива чисел");
        int size = Integer.parseInt(reader.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите %dй элемент массива\n", i + 1);
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Массив, умноженный на 2:");
        for (int i : arr) System.out.println(i * 2);
    }
}
