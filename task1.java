package homework3;

// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.

public class task1 {
    public static void main(String[] args) {
        int[] arr= {-1, 2, -3, 4, -5, 6};
        int[] positiveArr = positivArray(arr);
        for (int i = 0; i < positiveArr.length; i++) {
            System.err.println(positiveArr[i]);
        }
    }

    public static int[] positivArray(int[] array) {
        int k = 0;
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                temp[k] = array[i];
                k++;
            }
        }
        int[] positivArray = new int[k];
        System.arraycopy(temp, 0, positivArray, 0, k);
        return positivArray;
    }
}
