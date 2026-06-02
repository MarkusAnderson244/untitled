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


        byte a = 127;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 32767;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 2147483647;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 9223372036854775807L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.4E+38f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.7E+308;
        System.out.println("Значение переменной f с типом double равно " + f);

        float flo = 27.12f;
        long lo = 987678965549l;
        double dou = 2.786;
        short sh = 569;
        short sho = -159;
        int in = 27897;
        byte by = 67;

        byte pavlovna = 23;
        byte sergeevna = 27;
        byte andreevna = 30;
        int kids = pavlovna + sergeevna + andreevna;
        int sheets = 480;
        int sheetsPerKid = sheets / kids;
        System.out.println("На каждого ученика рассчитано " + sheetsPerKid + " листов бумаги");

        int bpm = 8;
        int tweentyMinutes = 20;
        int bottlePerTweentyMinutes = tweentyMinutes * bpm;
        System.out.println("За 20 минут машина произвела " + bottlePerTweentyMinutes + " штук бутылок");
        int day = 1440;
        int bottlePerDay = day * bpm;
        System.out.println("За день машина произвела " + bottlePerDay + " штук бутылок");
        int threeDay = 4320;
        int bottlePerthreeDay = threeDay * bpm;
        System.out.println("За три дня машина произвела " + bottlePerthreeDay + " штук бутылок");
        int month = 43200;
        int bottlePerMonth = month * bpm;
        System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок");

        int cans = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalCansPerClass = whitePaintPerClass + brownPaintPerClass;
        int totalClass = cans / totalCansPerClass;
        int totalWhitePaint = totalClass * whitePaintPerClass;
        int totalBrownPaint = totalClass * brownPaintPerClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        int banan = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;
        int totalWeight = 5 * banan + 2 * milk + 2 * icecream + 4 * egg;
        System.out.println("итоговый вес в граммах " + totalWeight);
        float totalKg = totalWeight / 1000f;
        System.out.println("итого килограмм " + totalKg);

        int targetWeigt = 7;
        float diet1 = 0.25f;
        float daysToLoseWeight1 = targetWeigt / diet1;
        System.out.println(daysToLoseWeight1);
        float diet2 = 0.5f;
        float daysToLoseWeight2 = targetWeigt / diet2;
        System.out.println(daysToLoseWeight2);
        float diet3 = (diet1 + diet2) / 2;
        float daysToLoseWeight3 = targetWeigt / diet3;
        System.out.println(daysToLoseWeight3);

        int masha = 67760;
        int riseMasha = masha + (masha / 10);
        int mashaPayDay = (riseMasha - masha) * 12;
        System.out.println("Маша теперь получает " + riseMasha + " рублей. Годовой доход вырос на " + mashaPayDay + " рублей.");
        int denis = 83690;
        int riseDenis = denis + (denis / 10);
        int denisPayDay = (riseDenis - denis) * 12;
        System.out.println("Денис теперь получает " + riseDenis + " рублей. Годовой доход вырос на " + denisPayDay + " рублей.");
        int kristina = 76230;
        int riseKristina = kristina + (kristina / 10);
        int kristinaPayDay = (riseKristina - kristina) * 12;
        System.out.println("Кристина теперь получает " + riseKristina + " рублей. Годовой доход вырос на " + kristinaPayDay + " рублей.");
    }
}