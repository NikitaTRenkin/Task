import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int rows = 4; // количество строк
        int cols = 5; // количество столбцов
        int[][] matrix = new int[rows][cols];
        double[] averageVector = new double[rows];

        // Заполнение матрицы случайными значениями от -10 до 10
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // случайные значения от -10 до 10
            }
        }

        // Вычисление среднего арифметического положительных элементов в каждой строке
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > 0) {
                    sum += matrix[i][j];
                    count++;
                }
            }
            averageVector[i] = (count > 0) ? (double) sum / count : 0; // если нет положительных, то 0
        }

        // Вывод матрицы
        System.out.println("Сгенерированная матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Вывод вектора средних значений
        System.out.println("Вектор средних арифметических положительных элементов:");
        for (double avg : averageVector) {
            System.out.printf("%.2f\n", avg);
        }
    }
}
