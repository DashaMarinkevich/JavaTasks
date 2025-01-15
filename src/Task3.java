import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<Integer> massivInt = new ArrayList<>();
        int myInt;
        int countError = 3;
        do {
            System.out.println("Введите число или Enter для прекращения ввода: ");
            try {
                String a = keyboard.nextLine();
                if (a.isEmpty() || a == null)
                    break;
                else {
                    myInt = Integer.parseInt(a);
                    massivInt.add(myInt);
                    countError = 3;
                }

            } catch (NumberFormatException e) {
                countError--;
                System.out.println("Неверный ввод!");
            }
        } while (countError > 0);
        System.out.println("Массив =");
        for (int i = 0; i < massivInt.size(); i++) {
            System.out.println(massivInt.get(i));
        }
        System.out.println("Массив отсортирован =");
        massivInt.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
