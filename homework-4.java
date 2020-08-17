/*
 Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
*/

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class homework4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число в двоичном виде");
        String binary = reader.readLine();
        boolean correct = true;
        int decimal = 0;
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