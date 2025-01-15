import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_2 extends Task2_1  {

    public static void methodCheckString (String str) throws ExceptionMyClass2 {
        Pattern pattern = Pattern.compile("\\d", Pattern.MULTILINE);
        System.out.println("methodCheckString2 = " + str);
        if (str.matches(str)) {
            throw new ExceptionMyClass2("Некорректный ввод");
        }
    }

}