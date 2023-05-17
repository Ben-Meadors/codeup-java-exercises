import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer;
        do{
            System.out.println("say something");
            String userInput = sc.nextLine();

            if(userInput.endsWith("?")){
                System.out.println("Sure..");
            }else if (userInput.endsWith("!")){
                System.out.println("Bro chill");
            }else if (userInput.isEmpty()){
                System.out.println("Fine, be that way!");
            }else{
                System.out.println("Whatever dude");
            }
            System.out.println("wanna keep going? [y/n]");
            answer = sc.next();
            sc.nextLine();
        }while(answer.equalsIgnoreCase("y"));
    }
}
