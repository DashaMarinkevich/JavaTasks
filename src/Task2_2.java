import java.util.ArrayList;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;
        while (true) {
            System.out.println("Введите размер массива: ");
            try {
                size = Integer.parseInt(keyboard.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        int arrayNew[] = new int[size];
        System.out.println("ВВедите массив:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    arrayNew[i] = Integer.parseInt(keyboard.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод!");
                }
            }
        }

        System.out.println("\nВывод каждого 2-го элемента массива");
        for (int k=1;k<arrayNew.length;k++) {
            System.out.print(arrayNew[k]+ " ");
            k++;
        }
    }
}
