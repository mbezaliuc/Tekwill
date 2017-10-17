package com.tekwill.tests;

public class ArraysTest {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = {1, 2};

        System.out.println(arr1.length + arr2.length);

        System.out.println(arr1.length + " and " + arr2.length);

        System.out.println(arr2);

        System.out.println(arr1[0]);

        System.out.println(arr2[2]);

        int[] array = {5,8,7,2,3};
        for(int i=1; i<array.length-1; ++i) {
            System.out.println(array[i] + " ");
        }
    }
}
