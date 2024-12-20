import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_1 {
    public static void main(String[] args) {
        final String regex1 = "([+]375)(-29-|-33-|-44-)([0-9]*)";
        final String regex2 = "(@)(\\w*)";
        final String string = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather.";

        final Pattern pattern1 = Pattern.compile(regex1, Pattern.MULTILINE);
        final Matcher matcher1 = pattern1.matcher(string);
        final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
        final Matcher matcher2 = pattern2.matcher(string);

        if (matcher1.find()&&matcher2.find()) {
            System.out.println("Full match: " + matcher1.group(0)+" and "+matcher2.group(0));
            System.out.println("Mobile without code: " + matcher1.group(matcher1.groupCount()));
            System.out.println("Nik without @: " + matcher2.group(matcher2.groupCount()));
        }

    }
}
