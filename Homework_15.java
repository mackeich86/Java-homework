/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива чисел");
        int size = Integer.parseInt(reader.readLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите %dй элемент массива\n", i + 1);
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = arr.length-1 ; i > 0 ; i--)
            for(int j = 0 ; j < i ; j++)
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
        System.out.println("Отсортированный массив:");
        for (int i:arr) System.out.printf("%d\t", i);
    }
}
