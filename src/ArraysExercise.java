import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person ben = new Person("Ben");
        Person tobi = new Person("Tobi");
        Person john = new Person("John");

        Person addPerson = new Person("New Dude");

        Person [] people = new Person[3];

        people[0] = ben;
        people[1] = tobi;
        people[2] = john;

        Person[] people1 = addPerson(people, addPerson);

//        for (int i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }

        for (int i = 0; i < people1.length; i++) {
            System.out.println(people1[i].getName());
        }
    }

    public static Person[] addPerson(Person[] personArray, Person person){
        Person[] addPeople = Arrays.copyOf(personArray, personArray.length + 1);
        addPeople[addPeople.length - 1] = person;
        return addPeople;
    }
}
