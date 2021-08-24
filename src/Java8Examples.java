import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Person> people = Sample.createPeople();

//        numbers.forEach(System.out::println);

//        numbers.stream()
//                .map(String::valueOf)
//                .forEach(System.out::println);

//        System.out.println(
//                numbers.stream()
//                        .reduce(0, Integer::sum)
//        );

//        System.out.println(
//                numbers.stream()
//                        .map(String::valueOf)
//                        .reduce("", String::concat)
//        );

//        System.out.println(
//                numbers.stream()
//                        .filter(e -> e > 3)
//                        .filter(e -> e % 2 == 0)
//                        .map(e -> e * 2)
//                        .findFirst()
//        );

//        System.out.println(
//                numbers.stream()
//                        .filter(e -> e % 2 == 0)
////                        .map(e -> e * 2)
////                        .reduce(0, Integer::sum)
////                        .mapToInt(e -> e * 2)
////                        .sum()
//                .mapToInt(Java8Examples::compute)
//                .sum()
//
//        );

//        TimeIt.code(() ->
//            System.out.println(
//                    numbers.stream()
////                    numbers.parallelStream()
//                            .filter(e -> e % 2 == 0)
//                            .mapToInt(Java8Examples::compute)
//                            .sum()
//
//            ));

//        System.out.println(
//                numbers.stream()
//                        .filter(e -> e % 2 == 0)
////                        .map(e -> e * 2.0)
////                        .reduce(0.0, (carry, e) -> carry + e)
//                        .mapToDouble(e -> e * 2.0)
//                        .sum()
//        );

//        List<Integer> integerList = numbers.stream()
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 2)
//                .collect(Collectors.toList());
//
//        System.out.println(integerList);

//        Set<Integer> integerSet = numbers.stream()
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 2)
//                .collect(Collectors.toSet());
//
//        System.out.println(integerSet);

//        System.out.println(
//          people.stream()
//                .collect(Collectors.toMap(
//                        person -> person.getName() +" "+ person.getAge(),
//                        person -> person
//                )));
//        System.out.println(
//                people.stream()
//                .collect(Collectors.groupingBy(Person::getName))
//        );

//        System.out.println(
//                people.stream()
//                        .collect(Collectors.groupingBy(Person::getName,
//                                Collectors.mapping(Person::getAge, Collectors.toList())))
//        );

//        System.out.println(
//                Stream.iterate(100, e -> e +1)
//                .filter(e -> e % 2 == 0)
//                .filter(e -> Math.sqrt(e) > 20)
//                .mapToInt(e -> e * 2)
//                .limit(51)
//                .sum()
//        );

        System.out.println(totalValues(numbers, value -> true));
        System.out.println(totalValues(numbers, value -> value % 2 == 0));
        System.out.println(totalValues(numbers, value -> value % 2 != 0));


    }

    public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
        return numbers.stream()
                .filter(selector)
                .mapToInt(value -> value)
                .sum();
    }

    public static int compute(int number) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        return number * 2;
    }


}
