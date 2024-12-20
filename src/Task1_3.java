import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Вводите строки: ");
        do {
            stringBuilder.append(sc.nextLine()).append("/ ");
            System.out.println("Для выхода введите число");
        } while (!sc.hasNextInt());
        System.out.println("stringBuilder = " + stringBuilder);
    }
}
