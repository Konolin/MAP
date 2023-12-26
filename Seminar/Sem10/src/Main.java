import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Car> cars1 = List.of(
                new Car("Toyota", "Camry", 2018),
                new Car("Honda", "Accord", 2018),
                new Car("Toyota", "Corolla", 2018),
                new Car("Honda", "Civic", 2018),
                new Car("Honda", "Civic", 2019)
        );
        System.out.println("Ex 1 a: " + groupByYear(cars1));

        List<Car> cars2 = List.of(
                new Car("Dacia", "Papuc", 1995),
                new Car("Kia", "None", 1908),
                new Car("Ford", "Fiesta", 1997),
                new Car("VW", "Lupo", 1999)
        );
        System.out.println("Ex 1 b: " + filterCarModel(cars2));

        String text = "This is a Sample Text with Some Capitalized Words like Java Sql MySql and JavaScript";
        System.out.println("Ex 2: ");
        mapWithoutMap(text);

        System.out.println("Ex 3: " + filterUppercase(text));

        System.out.println("Ex 4: " + wordsFromFile("src/input.txt"));

        System.out.println("Ex 5 a: " + filterE(text));
        System.out.println("Ex 5 b: ");
        filterQ(text);

        System.out.println("Ex 6 si 7: " + concatTab(text));

        System.out.println("Ex 8: " + Arrays.toString(convertToArray(concatTab(text))));

        List<String> passwords = List.of("password", "paSSword", "p@SSword", "pasS!", "p@ssword!");
        System.out.println("Ex 9: " + passwordCheck(passwords));

        System.out.println("Ex 10: " + shoppingCalc("src/shoppinglist.csv"));
    }

    public static Map<Integer, List<String>> groupByYear(List<Car> cars) {
        return cars
                .stream()
                .filter(car -> car.getMake().equals("Honda"))
                .collect(Collectors.groupingBy(
                        Car::getYear, Collectors.mapping(Car::getModel, Collectors.toList())));
    }

    public static List<String> filterCarModel(List<Car> cars) {
        return cars
                .stream()
                .map(Car::getModel)
                .filter(model -> !model.equals("None"))
                .toList();
    }

    public static void mapWithoutMap(String text) {
        Arrays.stream(text.split("\\s+"))
                .forEach(word -> System.out.println("  " + word));
    }

    public static List<String> filterUppercase(String text) {
        return Arrays.stream(text.split("\\s+"))
                .filter(word -> Character.isUpperCase(word.charAt(0)))
                .toList();
    }

    public static List<String> wordsFromFile(String path) throws IOException {
        return Files.lines(Paths.get(path))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> word.contains("ete") || word.contains("ar"))
                .sorted()
                .map(word -> word + '!')
                .toList();
    }

    public static List<String> filterE(String text) {
        return Arrays.stream(text.split(" "))
                .filter(word -> word.length() <= 4)
                .map(String::toUpperCase)
                .filter(word -> word.contains("E"))
                .toList();
    }

    public static void filterQ(String text) {
        Arrays.stream(text.split("\\s+"))
                .filter(word -> word.length() <= 4)
                .map(String::toUpperCase)
                .forEach(word -> System.out.print(
                        word.contains("Q") ? word + '\n' : ""));
    }

    public static String concatTab(String text) {
        return Arrays.stream(text.split("\\s+"))
                .map(String::toUpperCase)
                .collect(Collectors.joining("\t", "Start:\t", "\t: End"));
    }

    public static String[] convertToArray(String text) {
        return text.split("\\s+");
    }

    public static List<String> passwordCheck(List<String> passwords) {
        return passwords
                .stream()
                .filter(password -> password.length() >= 8
                        && password.matches(".*[!@#$%^&*()].*")
                        && password.matches(".*[A-Z].*"))
                .toList();
    }

    public static Map<String, Integer> shoppingCalc(String path) throws IOException {
        return Files.lines(Paths.get(path))
                .skip(1)
                .map(line -> line.split(","))
                .collect(Collectors.groupingBy(
                        columns -> columns[0],
                        Collectors.summingInt(columns -> {
                            int quantity = Integer.parseInt(columns[1]);
                            int price = Integer.parseInt(columns[2]);
                            return quantity * price;
                        })
                ));
    }
}