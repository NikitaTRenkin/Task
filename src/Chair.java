public class Chair {
    // Свойства класса
    private String nameChair;      // Название кафедры
    private String room;           // Аудитория
    private String corps;          // Корпус
    private String telephone;      // Контактный телефон
    private String nameZavKaf;     // Фамилия заведующего
    private int kolTeacher;         // Количество преподавателей

    // Конструктор
    public Chair(String nameChair, String room, String corps, String telephone, String nameZavKaf, int kolTeacher) {
        this.nameChair = nameChair;
        this.room = room;
        this.corps = corps;
        this.telephone = telephone;
        this.nameZavKaf = nameZavKaf;
        this.kolTeacher = kolTeacher;
    }

    // Геттеры и сеттеры
    public String getNameChair() {
        return nameChair;
    }

    public void setNameChair(String nameChair) {
        this.nameChair = nameChair;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNameZavKaf() {
        return nameZavKaf;
    }

    public void setNameZavKaf(String nameZavKaf) {
        this.nameZavKaf = nameZavKaf;
    }

    public int getKolTeacher() {
        return kolTeacher;
    }

    public void setKolTeacher(int kolTeacher) {
        this.kolTeacher = kolTeacher;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return String.format("Кафедра: %s\nАудитория: %s\nКорпус: %s\nКонтактный телефон: %s\nЗаведующий кафедрой: %s\nКоличество преподавателей: %d",
                nameChair, room, corps, telephone, nameZavKaf, kolTeacher);
    }

    // Тестирование класса
    public static void main(String[] args) {
        Chair chair = new Chair("Кафедра программирования", "101", "A", "123-45-67", "Иванов И.И.", 15);
        System.out.println(chair.toString());
    }
}