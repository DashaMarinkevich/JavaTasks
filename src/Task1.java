import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello to Task Iterable!");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int beginIndex = 1000000;
        for (int i = 0; i < 1000000; i++) {
            list.add(beginIndex);
            beginIndex++;
        }
        System.out.println("Размер нового массива:" + list.size());
        System.out.println("1-й элемент нового массива:" + list.get(0));
        System.out.println("Последний элемент нового массива:" + list.get(list.size() - 1));

        System.out.println("Где элемент 1000000 нового массива имеет индекс:" + list.indexOf(1000000));
        System.out.println("Где элемент 1999999 нового массива имеет индекс:" + list.indexOf(1999999));

        int randomInt = (int) (Math.random() * 1_000_000) + 1_000_000;
        System.out.println("Получено рандомно значение: " + randomInt);

        int searchIndex = searchRandom(list, randomInt);
        System.out.println("Его индекс в массиве: " + searchIndex);
    }

    private static int searchRandom(ArrayList<Integer> list, int randomInt) {
        int low = 0;
        System.out.println("list = " + list.size() + ", randomInt = " + randomInt);
        int high = list.size() - 1;

        while (low <= high) {
            int index = (low + high) / 2;
            if (randomInt == list.get(index)) {
                return index;
            } else {
                if (randomInt > list.get(index)) {
                    low = index + 1;
                } else {
                    high = index - 1;
                }
            }

        }
        return -1;
    }
}

