import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        first question
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        second question
//        (1)
//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);
//        (2)
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);
//        (3)
//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1000000);
//        (4)
//        for(long i = 100; i >= -10; i-= 5){
//            System.out.println(i);
//        }
//        (5)
//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }
//        FizzBuzz
//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("fizzbuzz");
//            }else if(i % 5 == 0){
//                System.out.println("buzz");
//            }else if(i % 3 == 0){
//                System.out.println(i);
//            }else{
//                System.out.println(i);
//            }
//        }
//        ToP
        Scanner scanner = new Scanner(System.in);
//
//        boolean confirm = true;
//
//        do {
//            System.out.println("what number do you want to go to");
//            int userInput = scanner.nextInt();
//
//            System.out.println("Table");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userInput; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//
//                //left align
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cube);
//                //right align
//                //System.out.printf("%-7s|%-9s|%-6s\n", i, square, cube);
//            }
//            System.out.println("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        }while(confirm);
//        System.out.println("bye bye");
        //Grades to Letters

        boolean confirm = true;

        do {
            System.out.println("Enter a number from 0 - 100");
            int userGrade = scanner.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Continue? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        }while(confirm);
        System.out.println("bye bye");
    }
}
