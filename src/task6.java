import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Chair {
    private String nameChair;
    private String room;
    private String corps;
    private String telephone;
    private String nameZavKaf;
    private int kolTeacher;

    public Chair(String nameChair, String room, String corps, String telephone, String nameZavKaf, int kolTeacher) {
        this.nameChair = nameChair;
        this.room = room;
        this.corps = corps;
        this.telephone = telephone;
        this.nameZavKaf = nameZavKaf;
        this.kolTeacher = kolTeacher;
    }

    public String getNameChair() {
        return nameChair;
    }

    @Override
    public String toString() {
        return String.format("Кафедра: %s, Аудитория: %s, Корпус: %s, Телефон: %s, Заведующий: %s, Количество преподавателей: %d",
                nameChair, room, corps, telephone, nameZavKaf, kolTeacher);
    }
}

public class task6 {
    private static List<Chair> chairs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Добавить кафедру");
            System.out.println("2. Вывести все кафедры (отсортированные по названию)");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    addChair(scanner);
                    break;
                case 2:
                    displayChairs();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        } while (choice != 0);
    }

    private static void addChair(Scanner scanner) {
        System.out.print("Введите название кафедры: ");
        String nameChair = scanner.nextLine();
        System.out.print("Введите аудиторию: ");
        String room = scanner.nextLine();
        System.out.print("Введите корпус: ");
        String corps = scanner.nextLine();
        System.out.print("Введите телефон: ");
        String telephone = scanner.nextLine();
        System.out.print("Введите фамилию заведующего: ");
        String nameZavKaf = scanner.nextLine();
        System.out.print("Введите количество преподавателей: ");
        int kolTeacher = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        Chair chair = new Chair(nameChair, room, corps, telephone, nameZavKaf, kolTeacher);
        chairs.add(chair);
        System.out.println("Кафедра добавлена.");
    }

    private static void displayChairs() {
        if (chairs.isEmpty()) {
            System.out.println("Список кафедр пуст.");
            return;
        }

        // Сортировка по названию кафедры
        Collections.sort(chairs, Comparator.comparing(Chair::getNameChair));

        System.out.println("Список кафедр:");
        for (Chair chair : chairs) {
            System.out.println(chair);
        }
    }
}