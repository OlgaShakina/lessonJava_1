public class Main {

    public static void main(String[] args) {
        printThreeWords();
        CheckSumSign();
        printColor();
        compareNumbers();
        boolean result = checkSumRange(5, 15);
        System.out.println("Сумма в пределах от 10 до 20: " + result);
        checkNumberSign(5);
        System.out.println(isNegative(-5));
        System.out.println(isNegative(10));
        printString("Hi There!", 3);
        isLeapYear(2024);
        processArray1();
        processArray2();
        processArray3();
        process2DArray();
        processInitializedArray();

    }

    private static void processArray1() {
        int[] array = createArray1();
        printArray("Исходный массив:", array);
        ArraySwitch(array);
        printArray("Измененный массив:", array);
    }

    private static void processArray2() {
        int[] array = createArray2();
        printArray("Массив:", array);
    }

    private static void processArray3() {
        int[] array = createArray3();
        ArrayMultiply(array);
        printArray("Измененный массив:", array);
    }

    private static void process2DArray() {
        int[][] array = create2DArray(5);
        DiagonalArray(array);
        print2DArray(array);
    }

    private static void processInitializedArray() {
        int[] array = initializeArray(5, 7);
        printArray("Массив:", array);
    }

    public static int[] createArray1() {
        return new int[]{1, 1, 0, 6, 3, 1, 0, 0, 9, 3, 5};
    }


    public static int[] createArray2() {
        int[] array = new int[100];
        FillArray(array);
        return array;
    }

    public static int[] createArray3() {
        return new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    }

    public static int[][] create2DArray(int n) {
        return new int[n][n];
    }

    public static int[] initializeArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void ArraySwitch(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

    public static void ArrayMultiply(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void DiagonalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    public static void FillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }


    private static void printArray(String message, int[] array) {
        System.out.print(message + " ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    public static void CheckSumSign() {
        int a = -3;
        int b = -1;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

}