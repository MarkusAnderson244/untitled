//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача 1
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        // Задача 2
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println(a);
        }

        //Задача 3
        for (int b = 0; b < 17; b = b + 2) {
            System.out.println(b);
        }

        // Задача 4
        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }

        // Задача 5
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача 6
        for (int d = 7; d <= 98; d = d + 7) {
            System.out.println(d);
        }

        // Задача 7
        for (int e = 1; e <= 512; e = e * 2) {
            System.out.println(e);
        }

        // Задача 8
        int savings = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m = m + 1) {
            total = total + savings;
            System.out.println("Месяц " + m + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 9
        int total1 = 0;
        for (int f = 1; f <= 12; f++) {
            total1 = total1 + savings;
            total1 = total1 + (total1 / 100);
            System.out.println("Месяц " + f + " сумма накоплений равна " + total1 + " рублей");
        }

        // Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS поссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Ошибка!");

        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS поссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS поссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else System.out.println("Ошибка!");

        int year = 2021;
        if (year <= 1584) {
            System.out.println("Ошибка: год должен быть больше 1584.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год — високосный.");
            } else {
                System.out.println(year + " год — обычный.");
            }
        }

        int deliveryTime = 1;
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("К сожалению, на такое расстояние доставка не осуществляется");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней на доставку: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней на доставку: " + 2 * deliveryTime);
        } else {
            System.out.println("Потребуется дней на доставку: " + 3 * deliveryTime);
        }

        int monthNumber = 4;
        if (monthNumber > 12 || monthNumber <= 0) {
            System.out.println("Такого месяца не существует!");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Сейчас зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Сейчас весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Сейчас лето!");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Сейчас осень");
                    break;
            }
        }


    }
}