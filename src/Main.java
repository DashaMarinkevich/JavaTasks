import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Task2_1 task1 = new Task2_1();
        Task2_2 task2 = new Task2_2();
        System.out.println("Метод обработки исключения");
        Scanner scanner = new Scanner(System.in);
        String myStr;
        System.out.println("Введите строку для проверки:");
        myStr = scanner.nextLine();
        System.out.println("Строка = " + myStr);
        try {
            task1.methodCheckString (myStr);
            System.out.println("Введите строку для проверки:");
            myStr = scanner.nextLine();
            System.out.println("Строка = " + myStr);
            task2.methodCheckString (myStr);
        }
        catch (ExceptionMyClass2 e)
        {
            System.out.println("Строка содержит цифры: " + e.getMessage());
        }
        catch(ExceptionMyClass e){
            System.out.println("Некорректный ввод: " + e.getMessage());
        }

    }
}