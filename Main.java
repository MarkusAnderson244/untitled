//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var mass1 = 78.2;
        var mass2 = 82.7;
        var massTotal = mass1 + mass2;
        System.out.println("Общая масса двух боксеров " + massTotal + " кг");
        var massDiff = mass2 - mass1;
        System.out.println("Разница веса двух боксеров составляет " + massDiff + " кг");
        var massRemainder = mass2 % mass1;
        System.out.println("Остаток от деления " + massRemainder);

        var y = 640;
        var z = 8;
        var x = y / z;
        System.out.println("Всего работников в компании - " + x + " человек");
        var x1 = 94;
        var x2 = x + x1;
        var y1 = x2 * z;
        System.out.println("Если в компании работает " + x2 + " человек, то всего " + y1 + " часов работы может быть поделено между сотрудниками");

    }
}