import java.util.ArrayList;
import java.util.Scanner;

public class Task2_1 {
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
        System.out.println("Вывод массива методом do ...while");
        int i = 0;
        do {
            System.out.print(arrayNew[i] + " ");
            i++;

        } while (i < arrayNew.length);
        System.out.println("\nВывод массива методом while");
         i = 0;
        while (i < arrayNew.length) {
            System.out.print(arrayNew[i] + " ");
            i++;
        }
        System.out.println("\nВывод массива методом for");
        for (int j = 0; j < size; j++) {
            System.out.print(arrayNew[j]+ " ");
        }
        System.out.println("\nВывод массива методом for each");
        for (int k: arrayNew) {
            System.out.print(k+" ");
        }

    }
}
