package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        IntegerListImpl integerList = new IntegerListImpl();

        // реализация случайного массива
        int length = 100_000; // длина массива
        Integer[] nums = new Integer[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // заполняем каждый элемент случайным числом от 0 до 99
            nums[i] = random.nextInt(200_000);
        }
        // выводим массив на экран
        System.out.println(Arrays.toString(nums));

        long start;
        long finish;

        start = System.currentTimeMillis();
        integerList.sortInsertion(nums);
        finish = System.currentTimeMillis() - start;
        System.out.println("Время сортировки вставкой - " + finish + " millis");

        Integer[] nums2 = Arrays.copyOf(nums, length);

        start = System.currentTimeMillis();
        integerList.sortBubble(nums2);
        finish = System.currentTimeMillis() - start;
        System.out.println("Время пузырьковой сортировки - " + finish + " millis");

        Integer[] nums3 = Arrays.copyOf(nums, length);

        start = System.currentTimeMillis();
        integerList.sortSelection(nums3);
        finish = System.currentTimeMillis() - start;
        System.out.println("Время сортировки выбором - " + finish + " millis");

    }

}
