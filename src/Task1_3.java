import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1_3 {
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
        if (myInt <= 0) {
            System.out.println("Перемножить не получится!");
        } else {
            int temp = myInt;
            List<Integer> digits = new ArrayList<>();
            while (temp > 0) {
                digits.add(temp % 10);
                temp /= 10;
            }
            Collections.reverse(digits);
            int result = 1;
            for (int i = 1; i < digits.size() + 1; i++) {
                result *= digits.get(i-1);
            }
            System.out.println("Result =" + result);
        }
    }

}
