import java.util.Scanner;

public class Task2_3 {
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
        Birds[] bird = new Birds[size];
        keyboard = new Scanner(System.in);
        for (int i = 0; i < bird.length; i++) {
            System.out.print("\nВВод элемента " + (i + 1) + " :");
            String name = keyboard.nextLine();
            bird[i] = new Birds(name);
        }
        System.out.print("\nВывод каждого 2-го элемента:");
        for (int i = 1; i < bird.length; i++) {
            if (bird[i].kind.isEmpty()) {
                break;
            } else {
                System.out.println(" " + bird[i]); // Выводим на экран, полученный массив
                i++;
            }

        }
        System.out.println();
    }
}
