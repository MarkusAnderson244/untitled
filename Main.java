//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Задача 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] decimals = {1.57, 7.654, 9.986};

        String[] fruits = {"apple", "banana", "cherry"};

        // Задача 2
        System.out.println(arrayToString(numbers));
        System.out.println(arrayToString(decimals));
        System.out.println(arrayToString(fruits));

        // Задача 3
        System.out.println(arrayToStringReverse(numbers));
        System.out.println(arrayToStringReverse(decimals));
        System.out.println(arrayToStringReverse(fruits));

        // Задача 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }

        System.out.println("Преобразованный массив: " + arrayToString(numbers));
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static String arrayToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static String arrayToStringReverse(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static String arrayToStringReverse(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static String arrayToStringReverse(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}