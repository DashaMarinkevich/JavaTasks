import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hello to Task Massive Bubble Sort!");
        int [] massive = new int[100000];
        Random random = new Random();
        int randomInt;
        for (int i = 0; i <massive.length ; i++) {
             randomInt = random.nextInt();
            massive[i]=randomInt;
        }
        ArrayList <Integer> a = new ArrayList<>(100);
//a.size();// почему размер 0 если обеем 100?
       // System.out.println("Массив: ");
        //  for (int i = 0; i <massive.length ; i++) {
         //   System.out.println(massive[i]);
       // }
        bubbleSort(massive);
        System.out.println("Массив отсортирован: ");
      //  for(int i = 0; i < massive.length; i++){
      //      System.out.print(massive[i] + "\n");
      //  }
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        int beginIndex;
        int endIndex;
        while (true) {
            System.out.println("Введите начальный и конечный индексы массива: ");
            try {
                beginIndex = Integer.parseInt(keyboard.next());
                endIndex = Integer.parseInt(keyboard.next());
                if (endIndex>beginIndex)
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }


            for (int i = beginIndex; i <= endIndex; i++) {
                System.out.println(massive[i]);
            }

    }
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
