package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner ;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userNum = Integer.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Try again");
        return getInt(min, max, prompt);
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        double userNum = Double.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Try again");
        return getDouble(min, max, prompt);
    }

    public static void main(String[] args) {
        Input inputOne = new Input();
//        System.out.println("Get String: ");
//        System.out.println(inputOne.getString());
//        System.out.println("yesNo: ");
//        System.out.println(inputOne.yesNo());
//        System.out.println("give a number between 1-10");
//        System.out.println(inputOne.getInt(1,10));
    }

}
