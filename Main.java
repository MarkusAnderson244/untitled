//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание 1
        int firstFriday = 7;
        int day = 1;
        for (; day <= 31; day++) {
            if (day > 31 || day <= 0 || firstFriday > 7 || firstFriday <= 0) {
                System.out.println("Неверно указана дата");
                break;
            }
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");

            }
        }
        // Задание 2
        int distance = 0;
        int goal = 42195;
        do {
            distance = distance + 500;
            System.out.println("Держитесь, осталось " + (goal - distance) + " метров");
        } while (distance < goal && goal - distance > 500);

        int distance2 = 0;
        for (int i = 0; distance2 < goal && goal - distance2 > 500; i++) {
            distance2 = distance2 + 500;
            System.out.println("Держитесь, осталось " + (goal - distance2) + " метров");

        }
        // Задание 3

        int budget = 1000;
        int currentDay = 1;
        int dailyRate = 100;
        while (budget > 0) {
            if (currentDay % 5 == 0) {
                currentDay++;
                continue;
            }
            budget -= dailyRate;
            currentDay++;
        }
        System.out.println("Количество дней, на которые хватит бюджета (while): " + (currentDay - 1));

        int budget1 = 1000;
        int daysCount = 0;
        for (int currentDayFor = 1; budget1 > 0; currentDayFor++) {
            daysCount++;
            if (currentDayFor % 5 == 0) {
                continue;
            }
            budget1 -= dailyRate;

        }
        System.out.println("Количество дней, на которые хватит бюджета (for): " + daysCount);

        // Задание 4
        int month = 0;
        int total = 0;
        int deposit = 15000;
        do {
            month++;
            total += deposit;
            if (month % 6 == 0) {
                total += ((total / 100) * 7);
            }
            System.out.println(month + " Месяц" + " накоплено " + total);
            if (total >= 12000000) {
                break;
            }
        } while (true);

        // Задание 5
        int charge =50;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats < 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев! Зарядка прерывается на 2 минуты.");
                minute += 2;
                continue;
            }
            charge += 2;
            if (overheats > 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут.");


    }
}