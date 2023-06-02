package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student jim = new Student("Jim");
        jim.addGrade(70);
        jim.addGrade(80);
        jim.addGrade(90);
        jim.addGrade(100);

        System.out.println(jim.getGradeAverage());
    }
}
