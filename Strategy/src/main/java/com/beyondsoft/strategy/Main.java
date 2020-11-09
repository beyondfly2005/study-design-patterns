package com.beyondsoft.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] a = {9,2,3,5,7,1,4,6};
//
//        Dog[] a = {new Dog(3),new Dog(1),new Dog(5)};
//        Sorter<Dog> sorter = new Sorter();
//        sorter.sort(a, new DogComparetor());
//        System.out.println(Arrays.toString(a));

        Cat[] c1 = {new Cat(3,3),new Cat(1,1),new Cat(5,5)};
        Sorter<Cat> sorter1 = new Sorter();
//        sorter1.sort(c1, new CatWeightComparator());
        sorter1.sort(c1, new CatHeightComparator());
        System.out.println(Arrays.toString(c1));

        //如果在Sorter类中 对Long类型排序 对Dobble排序 对Fload排序
        //写多个排序方法，入参不同
    }
}
