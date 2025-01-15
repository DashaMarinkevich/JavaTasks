package org.example;

import java.util.Collection;

public class MyArrayList<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    /*Добавление в конец */
    public void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2); //  в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    /*Добавление по индексу */
    public void addForIndex(T item, int index) {
        // System.out.println("array.length = " + array.length);
        //System.out.println("pointer.length = " + pointer);
        if (pointer == array.length - 1) {
            resize(array.length + 1);
        }
        Object[] newArray = array.clone();
        for (int i = 0; i < index; i++) {
            array[i] = newArray[i];

        }
        array[index] = item;

        for (int i = index; i < array.length - index; i++) {

            array[i + 1] = newArray[i];

        }


        pointer = pointer + 1;
    }

    /*Добавление массива элементов */
    public void addAll(Collection<? extends T> c) {
        Object[] newArray = c.toArray();
        int numNew = newArray.length;
        if (numNew != 0) {
            Object[] elementData;
            int s;
            if (numNew > (elementData = this.array).length - (s = pointer))
                resize(s + numNew);
            for (int i = pointer, j = 0; j < numNew; i++, j++) {
                array[i] = newArray[j];
                System.out.println("array = " + array[i].toString());
                System.out.println("i = " + i);
            }
            pointer = s + numNew;


        }
    }

    /* Получить элемент списка по индексу.*/
    public T get(int index) {
        return (T) array[index];
    }

    /* Удалить элемент списка по индексу.*/
    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2); // если элементов в 4 раза меньше чем длина массива, то изменить размер в два раза
    }

    /*Возвращает количество элементов в списке*/
    public int size() {
        return pointer;
    }

    /* Изменение размера ArrayList.*/
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }
        array = newArray.clone();
    }

    /* Полная чистка ArrayList.*/
    public void clear() {
        //Object[] es = array;
        for (int to = array.length, i = 0; i < to; i++)
            array[i] = null;
        pointer = 0;
    }
}
