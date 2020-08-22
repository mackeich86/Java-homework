/*
Произведите ввод данных с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
Размерность матрицы задается пользователем.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность m матрицы чисел");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите размерность n матрицы чисел");
        int n = Integer.parseInt(reader.readLine());
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.printf("Введите a[%d][%d]й элемент массива\n", i + 1, j + 1);
                arr[i][j] = Integer.parseInt(reader.readLine());
            }
        System.out.println("Первая строка массива, умноженная на 3:");
        for (int[] i : arr) {
            for (int j : i) System.out.printf("%d\t", j * 3);
            break;
        }
    }
}
