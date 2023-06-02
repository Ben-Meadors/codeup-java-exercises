package grades;

import util.Input;

import java.util.HashMap;

public class GradeApplication {

    private static HashMap<String, Student> students;

    public static void main(String[] args) {
        students = makeStudents();
        printWelcome();
        printChoice();
    }

    public static HashMap<String, Student> makeStudents() {
        HashMap<String, Student> students = new HashMap<>();
        Student ben = new Student("Ben");
        Student jon = new Student("Jon");
        Student tim = new Student("Tim");
        Student michael = new Student("Michael");
        ben.addGrade(80);
        ben.addGrade(90);
        ben.addGrade(100);
        jon.addGrade(50);
        jon.addGrade(60);
        jon.addGrade(70);
        tim.addGrade(75);
        tim.addGrade(85);
        tim.addGrade(95);
        michael.addGrade(87);
        michael.addGrade(77);
        michael.addGrade(97);

        students.put("Ben", ben);
        students.put("Jon", jon);
        students.put("Tim", tim);
        students.put("Mihcael", michael);

        return students;
    }

    private static void printWelcome() {
        System.out.println("""
                Welcome!
                                
                Here's some GitHub usernames of Students
                """);
        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }
        System.out.println();
    }

    private static void printChoice() {
        String userInput = "";
        do {
            System.out.println("Which student do you want to see?");
            Input in = new Input();
            String userChoice = in.getString();

            if (students.containsKey(userChoice)) {
                System.out.println("Name: " + students.get(userChoice).getName() + " - GitHubUsername: " + userChoice);
                System.out.println("Current average: " + students.get(userChoice).getGradeAverage());
                System.out.println("Do you want to continue? y/n ");
                userInput = in.getString();
            } else {
                System.out.println("That name does not exist");
            }
        } while (userInput.equalsIgnoreCase("y"));
        System.out.println("bye");
    }
}
