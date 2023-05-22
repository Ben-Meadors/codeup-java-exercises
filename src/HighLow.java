import java.util.Scanner;
public class HighLow {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int answer = rollDie(100);

        System.out.println("guess a number from 1-100: ");
        int guess = getInteger(1, 100);

        System.out.println(guess + " " + answer);

        if(guess == answer){
            System.out.println("good guess");
        } else if (guess > answer) {
            System.out.println("Too high");
        }   else{
            System.out.println("too low");
        }
    }

    public static int rollDie(int dieSides){
        int result = (int) (Math.random() * dieSides + 1);
        return result;
    }
    public static int getInteger(int min, int max) {
        int result = input.nextInt();
        if (result < min || result > max) {
            System.out.println("no");
            return getInteger(min, max);
        }
        return result;

    }
}
