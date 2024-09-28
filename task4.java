package homework3;

public class task4 {
    // Задача 4*. Среднее значение массива
    // Напишите метод, который принимает массив целых чисел и возвращает
    // среднее значение элементов массива, округленное до ближайшего целого
    // числа.
    public static void main(String[] args) {
        int[] arr = { 44, 11, 22, 33, 6 };
        System.err.println(average(arr));
    }

    public static int average(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        return count / array.length;
    }

}
