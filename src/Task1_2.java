import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int myInt;
        while (true) {
            System.out.println("Введите число: ");
            try {
                myInt = Integer.parseInt(keyboard.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
        System.out.println("Вы ввели =" + myInt);
        int result = 1;
        if (myInt <= 0) {
            System.out.println("На 0 умножаешь - 0 получаешь)");
        } else {

            for (int i = 2; i <= myInt; i++) {
                result *= i;
            }
            System.out.println("Полученный результат =" + result);
        }
    }
}
