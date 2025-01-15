package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList<Integer> intMyArrayList;

    @BeforeEach
    public void init() {
        intMyArrayList = new MyArrayList<Integer>();
        intMyArrayList.add(5);
        intMyArrayList.add(2);
        intMyArrayList.add(8);
        intMyArrayList.add(1);
        intMyArrayList.add(7);

    }

    @Disabled
    @org.junit.jupiter.api.Test
    void add() {
        int initSize = intMyArrayList.size();
        System.out.println("size = " + initSize);
        intMyArrayList.add(2);
        Assertions.assertThat(initSize + 1).isEqualTo(intMyArrayList.size());
    }


    @org.junit.jupiter.api.Test
    void addAll() {
        int initSize = intMyArrayList.size();
        System.out.println("size = " + initSize);
        List<Integer> nums = Arrays.asList(9, 10, 11);
        intMyArrayList.addAll(nums);
        Assertions.assertThat(initSize + 3).isEqualTo(initSize + nums.size());
    }


    @org.junit.jupiter.api.Test
        //@Disabled
    void clear() {
        int initSize = intMyArrayList.size();
        intMyArrayList.clear();
        int newSize = intMyArrayList.size();
        Assertions.assertThat(newSize).isEqualTo(0);
    }


    @ParameterizedTest
    @MethodSource("integerProviderFactory")
    void removeWithDifferentIndex(int index, int size) {
        intMyArrayList.remove(index);
        int actual = intMyArrayList.size();
        Assertions.assertThat(actual).isEqualTo(size);
    }

    static Stream<Arguments> integerProviderFactory() {
        return Stream.of(Arguments.of(1, 4),
                Arguments.of(2, 4),
                Arguments.of(3, 4));
    }

    @ParameterizedTest
    @MethodSource("integerProviderFactory2")
    void addWithDifferentIndex(int a, int index, int size) {
        int actual = intMyArrayList.size();
        intMyArrayList.addForIndex(a, index);

        System.out.println("actual = " + actual);
        Assertions.assertThat(actual + 1).isEqualTo(size);
    }

    static Stream<Arguments> integerProviderFactory2() {
        return Stream.of(Arguments.of(5, 1, 6),
                Arguments.of(4, 1, 6),
                Arguments.of(5, 1, 6)
        );
    }

}