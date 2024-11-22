import java.util.Scanner;
import java.lang.Math;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем значение a
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        // Запрашиваем значение b
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        // Вычисляем результат в зависимости от условия
        double result = (a * b > 50) ? Math.cos(Math.toRadians(a)) * 2 : b * 3;

        // Выводим результат
        System.out.println("Result: " + result);

        // Закрываем сканер
        scanner.close();
    }
}