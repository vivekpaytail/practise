import java.util.Arrays;
import java.util.List;

public class Sample{
    public static List<Person> createPeople(){
        return Arrays.asList(
                new Person("Sara",Gender.Female, 20),
                new Person("Sara",Gender.Female, 22),
                new Person("Bob",Gender.Male, 20),
                new Person("Paula",Gender.Female, 32),
                new Person("Paul",Gender.Male, 32),
                new Person("Jack",Gender.Male, 2),
                new Person("Jack",Gender.Male, 72),
                new Person("Jill",Gender.Male, 12)
        );
    }
}