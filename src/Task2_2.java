import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {

        WarWorldClass warText = new WarWorldClass();
        StringBuilder textBuilder = new StringBuilder();
        textBuilder = warText.readFile();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {

            System.out.println("Выберите слово: ");
            sc = new Scanner(System.in);
// displaying the menu
            System.out.println("1: война");
            System.out.println("2: мир");
            System.out.println("3: союз 'и'");
            System.out.println("4: Вывести весь текст и завершить программу");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    final String regex1 = "[Вв]ойна";
                    final String warWord = "война";
                    System.out.println("Количество слов 'война' (регулярка) = " + warText.countWord(textBuilder, regex1));
                    System.out.println("Количество слов 'война' (поиск по строке) = " + warText.countWordMethodSecond(textBuilder, warWord));
                    break;
                case 2:
                    final String regex2 = "[Мм]ир";
                    final String worldWord = "мир";
                    System.out.println("Количество слов 'мир'  (регулярка) = " + warText.countWord(textBuilder, regex2));
                    System.out.println("Количество слов 'мир' (поиск по строке) = " + warText.countWordMethodSecond(textBuilder, worldWord));
                    break;
                case 3:
                    final String regex3 = "\\sи\\s";
                    System.out.println("Количество союза ' и ' = " + warText.countWord(textBuilder, regex3));
                    break;
                case 4:
                    System.out.println(textBuilder.toString());
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод. Введите правильный пункт \n\n");
            }
        }
        while (ch < '1' || ch > '4');
    }
}

