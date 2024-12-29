package org.example;

import org.example.model.Animal;
import org.example.util.Util;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws IOException {
        example1();
    }

    private static void example1() throws IOException {
        //int count= (int) Stream.iterate(2, x-> x< 25, x-> x+6).count();
//        System.out.println(count);
        List<Animal> animals = Util.getAnimals();
        Comparator<Animal> comparator = Comparator.comparingInt(Animal::getAge);
        animals.stream().sorted(comparator).limit(10).forEach(System.out::println);
    }
}
