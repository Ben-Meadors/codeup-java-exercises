import java.util.Scanner;
public class MethodsExercise {
    // scanner for p2
    private static final Scanner input = new Scanner(System.in);
    private static final int MAX_INPUT_RANGE = 10;

    public static void main(String[] args) {
//        Scanner for P1
//        Scanner scn = new Scanner(System.in);

//        Problem 1

//        System.out.println("Enter the first number between 1 - 10:");
//        int num1 = scn.nextInt();
//
//        System.out.println("Enter the second number between 1 - 10:");
//        int num2 = scn.nextInt();

//        double add = addition(num1, num2);
//        System.out.println("Your numbers added are " + add);
//
//        double sub = subtraction(num1, num2);
//        System.out.println("Your numbers subtracted are " + sub);
//
//        double mul = multiplication(num1, num2);
//        System.out.println("Your numbers multiplied are " + mul);
//
//        double div = division(num1, num2);
//        System.out.println("Your numbers divided are " + div);
//
//        double mod = moduling(num1, num2);
//        System.out.println("Your numbers modulated are " + mod);
//        doFactorial();
        diceRoll();

    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
//            return num1 * num2;
//            double sum = 0;
//            for (int i = 0; i < num2; i++) {
//                sum += num1;
//            }
//            return sum;
        if (num2 == 0) {
            return 0;
        }
        if (num2 == 1) {
            return num1;
        }
        return num1 + multiplication(num1, num2 - 1);
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double moduling(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        int result = input.nextInt();
        if (result < min || result > max) {
            System.out.println("no");
            return getInteger(min, max);
        }
        return result;

    }

    public static void doFactorial() {
        while (true) {
            System.out.println("enter number from 1 to " + MAX_INPUT_RANGE + ": ");
            int factBase = getInteger(1, MAX_INPUT_RANGE);
            //dirty code
            input.nextLine();
            System.out.println(fact(factBase));

            System.out.println("continue? y/n");
            String continueString = input.nextLine();
            if (!promptToContinue()) {
                return;
            }
        }
    }

    public static long fact(int factBase) {
        long result = 1;
        for (int i = factBase; i > 2; i--) {
            result *= i;
        }
        return result;
    }

    //doc rob ex
    public static boolean promptToContinue() {
        System.out.println("continue? y/n");
        String continueString = input.nextLine();
        if (!continueString.equalsIgnoreCase("y")) {
            return false;
        }
        return true;

    }

    public static void diceRoll(){
        System.out.println("enter number of sides for die");
        int dieSides = getInteger(4, 20);
        input.nextLine();
        System.out.println("Hit enter and let's roll");
        input.nextLine();
        System.out.println(dieSides);
        int result = rollDie(dieSides);
        System.out.println("You rolled " + result);
    }
    public static int rollDie(int dieSides){
        int result = (int) (Math.random() * dieSides + 1);
        return result;
    }
}




