import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // Создаем Scanner для получения входных данных от пользователя
        Scanner scanner = new Scanner(System.in);
        
        // Запрашиваем у пользователя ввод значений a и b
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        
        // Находим максимальное и минимальное значение
        double max = Math.max(a, b);
        double min = Math.min(a, b);
        
        // Вычисляем d по заданной формуле
        double d = Math.pow(max, 5) - (3.2 * min) / (1 + min);
        
        // Выводим результаты
        System.out.println("max(a, b) = " + max);
        System.out.println("min(a, b) = " + min);
        System.out.println("d = " + d);
        
        // Закрываем Scanner
        scanner.close();
    }
}