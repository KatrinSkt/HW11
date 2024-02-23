public class Main {
    public static void main(String[] args) {
        checkYear(2024);
        checkAppVersion(1, 2003);
        checkDistance(95);
    }

    public static void checkYear(int yearToCheck) {
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println(yearToCheck + " год - високосный год");
        } else {
            System.out.println(yearToCheck + " год - не високосный год");
        }
    }

    public static void checkAppVersion(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }

    public static int checkDistance(int distance) {
        int days = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
        return days;
    }
}
