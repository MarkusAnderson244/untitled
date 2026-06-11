//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int age = 19;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Вы ещё не достигли совершеннолетия, нужно немного подождать!");
        }

        int temp = 7;
        if (temp < 5)  {
            System.out.println("На улице " + temp + " градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч можно ездить спокойно");
        }

        int howOld = 24;
        if (howOld > 2 && howOld < 7) {
            System.out.println("Если человеку " + howOld + " лет, то ему нужно ходить в детский сад");
        }
        if (howOld >= 7 && howOld < 18) {
            System.out.println("Если человеку " + howOld + " лет, то ему нужно ходить в школу");
        }
        if (howOld >= 18 && howOld <= 24) {
            System.out.println("Если человеку " + howOld + " лет, то ему нужно ходить в университет");
        }
        if (howOld > 24) {
            System.out.println("Если человеку " + howOld + " лет, то ему нужно ходить на работу");
        }

        int kidAge = 15;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то он не может кататься на аттракционе");
        }
        if (kidAge >= 5 &&  kidAge <= 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то он может кататься на аттракционе только в спопровождении взрослого");
        }
        if (kidAge > 14) {
            System.out.println("Если возраст ребенка равен " + kidAge + ", то он может кататься на аттракционе без сопровождения взрослого");
        }

        int numberOfPassengers = 61;
        int maxCapacity = 102;
        int seating = 60;
        int standing = maxCapacity - seating;
        int capacityLeft = maxCapacity - numberOfPassengers;
        if (numberOfPassengers <= seating) {
            System.out.println("Мест осталось " + capacityLeft + ". Из них сидячих " + (seating - numberOfPassengers ) + " и стоячих " + standing);
        } else if (numberOfPassengers < maxCapacity){
            System.out.println("Стоячих Мест осталось " + capacityLeft);
        } else {
            System.out.println("Мест не осталось!");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(" число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println(" число " + two + " самое большое");
        } else {
            System.out.println(" число " + three + " самое большое");
        }

    }
}