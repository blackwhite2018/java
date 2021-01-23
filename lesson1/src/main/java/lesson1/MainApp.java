package lesson1;

public class MainApp {

    public static void main (String args[]) {

        primitiveVariables();
        calculate(1.2f, 3.1f, 0.7f, 2.1f);
        isRangeSumNbr(4, 7);
        showPositiveNbr(-7);
        isPositiveNbr(0);
        showName("Victor");
        showLeapYear(2021);

    }

    public static void primitiveVariables() {
        boolean varBoolean = true;

        char varChar = ' ';

        byte varByte = 64;

        short varShort = 128;
        int varInt = 256;
        long varLong = 512;

        float varFloat = 1024f;
        double varDouble = 2048;
    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isRangeSumNbr(int a, int b) {
        final int SUM = a + b;
        return SUM >= 10 && SUM <= 20;
    }

    public static void showPositiveNbr(int nbr) {
        System.out.println(isPositiveNbr(nbr) ? "positive" : "negative");
    }

    public static boolean isPositiveNbr(int nbr) {
        return nbr >= 0;
    }

    public static void showName(String name) {
        System.out.println("Привет,  " + name + '!');
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void showLeapYear(int year) {
        System.out.println(isLeapYear(year) ? "високосный" : "не високосный");
    }
}
