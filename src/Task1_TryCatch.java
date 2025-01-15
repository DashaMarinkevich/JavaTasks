import java.util.Scanner;

public class Task1_TryCatch {
    public static void main(String[] args) {
        System.out.println("Попытки деления на нуль try-catch");
        Scanner scanner = new Scanner(System.in);
        int myNumber = 0;
        System.out.println("Введите число для деления:");
        if (scanner.hasNextInt()) {
            myNumber = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не число");
        }
        method1(myNumber, 0);

        System.out.println("Try-Finally =" + method2(myNumber, 0));
        System.out.println("Try-Catch-Finally =" + method3(myNumber, 0));

    }

    private static int method2(int myNumber, int i) {
        int result;
        System.out.println("Метод try-finally");
        try {
            System.out.println("Находимся в try");
            if (i == 0) {
                return 0;
            } else {
                result = myNumber / i;
                System.out.println("result = " + result);
            }
        } finally {
            System.out.println("Находимся в finally");
            System.out.println("Нельзя делить на ноль!");
            //System.exit(0);
            result = 1;
        }
        return result;
    }

    private static void method1(int a, int b) {
        int result;
        System.out.println("Метод try-catch");
        try {
            System.out.println("Находимся в try");
            result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Находимся в catch");
            System.out.println("Нельзя делить на ноль!");
            result = 0;
        }
    }

    private static int method3(int myNumber, int i) {
        int result;
        System.out.println("Метод try-catch-finally");
        try {
            System.out.println("Находимся в try");
            result = myNumber / i;
            System.out.println("result = " + result);
            result = myNumber;
        } catch (ArithmeticException e) {
            System.out.println("Находимся в catch");
            System.out.println("Нельзя делить на ноль!");
            result = -1;
        } finally {
            System.out.println("Находимся в finally");
            result = 0;
        }
        return result;
    }
}
