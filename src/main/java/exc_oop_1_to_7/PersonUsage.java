package exc_oop_1_to_7;

public class PersonUsage {
    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Person("Regular User", "Saint John Street"),
                new Student(
                        "Erasmus of Nevermore",
                        "Nevermore Road 5 floor 13 suite 666",
                        "The Dark Arts",
                        150,
                        1000000000.5
                ),
                new Lecturer("Bob Longbow", "Flinch Road 55 room 1", "Botany", 100000.5),
        };

        for(Person person: persons) {
            System.out.println(person);
        }
    }
}
