import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        MyArrayList<Fruits> fruitsMyArrayList = new MyArrayList<Fruits>();
        Fruits fruit1 = new Fruits("Apple", "Red", 5);
        Fruits fruit2 = new Fruits("Apple", "Green", 3);
        Fruits fruit3 = new Fruits("Pear", "Yellow", 3);
        Fruits fruit4 = new Fruits("Plum ", "Blue", 10);
        Fruits fruit5 = new Fruits("Peach", "Orange", 2);

        printMyList(fruitsMyArrayList);
        System.out.println("Добавление в ArrayList");
        fruitsMyArrayList.add(fruit1);
        System.out.println("args = " + fruitsMyArrayList.get(0).toString());
        fruitsMyArrayList.add(fruit2);
        fruitsMyArrayList.add(fruit3);
        System.out.println("ArrayList после добавления:");
        printMyList(fruitsMyArrayList);
        System.out.println("Добавление массива ArrayList");
        ArrayList<Fruits> frMassiv = new ArrayList<Fruits>(Arrays.asList(fruit4, fruit5));
        fruitsMyArrayList.addAll(frMassiv);
        printMyList(fruitsMyArrayList);
        System.out.println("ArrayList после добавления:");
        printMyList(fruitsMyArrayList);
        System.out.println("Добавление в ArrayList по индексу");
        Fruits fruit6 = new Fruits("Apple Gold", "Orange", 1);
        fruitsMyArrayList.addForIndex(fruit6, 2);
        printMyList(fruitsMyArrayList);
        System.out.println("Удаление в ArrayList по индексу");
        fruitsMyArrayList.remove(2);
        printMyList(fruitsMyArrayList);
        System.out.println("Удаление всего ArrayList");
        fruitsMyArrayList.clear();
        printMyList(fruitsMyArrayList);
    }

    private static void printMyList(MyArrayList<Fruits> fruitsMyArrayList) {
        System.out.println("fruitsMyArrayList.size() = " + fruitsMyArrayList.size());
        if (fruitsMyArrayList.size() == 0) {
            System.out.println("Пустой ArrayList");
        } else {
            for (int i = 0; i < fruitsMyArrayList.size(); i++)
                System.out.println("Элемент " + (i + 1) + " = " + fruitsMyArrayList.get(i).toString());
        }
    }
}
