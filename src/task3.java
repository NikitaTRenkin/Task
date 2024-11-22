import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int n = 10; // Размер массива
        int[] x = new int[n]; // Исходный массив
        Random random = new Random();

        // Заполнение массива случайными значениями от -10 до 10
        for (int i = 0; i < n; i++) {
            x[i] = random.nextInt(21) - 10; // Случайное число от -10 до 10
        }

        // Печать исходного массива
        System.out.println("Исходный массив x:");
        for (int value : x) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Сжатие массива для хранения отрицательных элементов, деленных на 2
        ArrayList<Integer> tempY = new ArrayList<>(); // Временный список для хранения элементов
        for (int value : x) {
            if (value < 0) {
                tempY.add(value / 2); // Делим отрицательный элемент на 2
            }
        }

        // Преобразование списка в массив
        int[] y = new int[tempY.size()];
        for (int i = 0; i < tempY.size(); i++) {
            y[i] = tempY.get(i);
        }

        // Печать нового массива
        System.out.println("Массив y (отрицательные элементы, деленные на 2):");
        for (int value : y) {
            System.out.print(value + " ");
        }
    }
}