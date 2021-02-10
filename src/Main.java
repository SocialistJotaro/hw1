public class Main {
    public static void main(String[] args) {
        byte byteVar = -128;
        short shortVar =  -32768;
        int intVar = (int) 2e9;
        long longVar = (long) 1e18;
        float floatVar = 123.44554f;
        double doubleVar = 1.5;
        char symbol = '*';
        boolean boolVar = true;
    }

    static float Expression(float a, float b, float c, float d){
        return a * (b +(c / d));
    }

    static boolean NumChecker(int x, int y) {
        return (x + y) >= 10 && (x + y) <= 20;
    }

    static void PosOrNeg(int n){
        if (n>=0) System.out.println("Positive");
        else System.out.println("Negative");
    }

    static boolean isNeg(int k){
        return k < 0;
    }

    static void Hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void LeapYear(int year){
        if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0)) {
            System.out.println(year +" is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
