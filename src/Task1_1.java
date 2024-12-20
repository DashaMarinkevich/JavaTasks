public class Task1_1 {
    public static void main(String[] args) {

        String str1 = new String("Мама мыла раму");
        String str2 = new String("Мама" + " мыла " + "раму");
        extracted(str1==str2);
        extracted(str1.equals(str2));
        str1 = "Мама мыла раму";
        str2 = "Мама" + " мыла " + "раму";
        extracted(str1==str2);
    }

    private static void extracted(boolean result) {
        if (result) {
            System.out.println("Строки равны. True");
        } else {
            System.out.println("Строки НЕ равны. False");
        }
    }
}
