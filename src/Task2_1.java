import java.util.Arrays;
import java.util.Scanner;

public class Task2_1 {
    public static void methodCheckString (String str) throws  ExceptionMyClass {

        if (str == null || str.isEmpty()) {
            throw new ExceptionMyClass("Input cannot be null or empty");
        }
        else{
            System.out.println("methodCheckString1 = " + str);
        }
    }
}

