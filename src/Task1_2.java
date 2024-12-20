import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_2 {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Строка целиком: "+ s);
        char [] charArrays= s.toCharArray();
        System.out.println("Строка посимвольно: ");
        for (char c:charArrays)
            System.out.println(c);
    }
}
