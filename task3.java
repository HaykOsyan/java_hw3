package homework3;

public class task3 {

    // Задача 3. Длина слов
    // Реализуйте метод, который принимает на вход массив строк и возвращает
    // новый массив, содержащий только строки, длина которых больше 3 символов.
    // Пример:
    public static void main(String[] args) {
        String[] animals = { "cat", "elephant", "dog", "giraffe" };

        for (int i = 0; i < moreThanThreeSimbols(animals).length; i++) {
            System.err.println(moreThanThreeSimbols(animals)[i]);
        }
    }

    public static String[] moreThanThreeSimbols(String[] arr) {
        String[] temp = new String[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3) {
                temp[k] = arr[i];
                k++;
            }
        }
        String[] moreThanThreeSimbols = new String[k];
        System.arraycopy(temp, 0, moreThanThreeSimbols, 0, k);
        return moreThanThreeSimbols;
    }
}
