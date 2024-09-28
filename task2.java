package homework3;

import java.util.ArrayList;

public class task2 {

    // Задача 2. Уникальные числа
    // Напишите метод, который принимает целочисленный массив и возвращает
    // новый массив, содержащий только уникальные элементы из исходного
    // массива.

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        System.err.println(uniqueArrElements(arr));
        ;
    }

    public static ArrayList<Integer> uniqueArrElements(int[] array) {
        ArrayList<Integer> arr = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {

            if (!arr.contains(array[i])) {
                arr.add(array[i]);
            }
        }
        return arr;
    }
}
