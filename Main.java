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
            total1 = total1 + (total1 / 100) * 12;
            total1 = total1 + savings;
            System.out.println("Месяц " + f + " сумма накоплений равна " + total1 + " рублей");
        }

        // Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }



    }
}