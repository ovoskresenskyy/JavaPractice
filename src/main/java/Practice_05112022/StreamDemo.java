package Practice_05112022;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    private List<Integer> randomIntegers;
    private List<String> randomWords;

    StreamDemo() {
        generateRandomIntegers();
        generateRandomStrings();
    }

    private void generateRandomIntegers() {
        randomIntegers = new ArrayList<>();
        Random randomizer = new Random();

        for (int i = 0; i < 50; i++) {
            randomIntegers.add(randomizer.nextInt(0, 100));
        }
    }

    private void generateRandomStrings() {

        randomWords = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            randomWords.add(generateString());
        }

        System.out.println(randomWords);
    }

    private String generateString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        StringBuilder sb = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            sb.append((char) randomLimitedInt);
        }
        return sb.toString();
    }

    public int countOfPairedValues() {
        return (int) randomIntegers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(mapEntry -> mapEntry.getValue() == 2)
                .peek(System.out::println)
                .count();
    }

    public int countOfEvenNumbers() {
        return (int) randomIntegers.stream()
                .filter(n -> n % 2 == 0)
                .peek(System.out::println)
                .count();
    }

    public void showWordsStaredWithChar(char ch) {
        randomWords.stream()
                .filter(s -> s.toLowerCase().charAt(0) == Character.toLowerCase(ch))
                .forEach(System.out::println);
    }

    public void sortStrings() {
        randomWords.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void showAll() {
        ArrayList<Car> cars = Car.carFactory();
        cars.forEach(System.out::println);
    }

    public void showByColor() {
        ArrayList<Car> cars = Car.carFactory();
        cars.stream()
                .filter(car -> car.getColor().equals("black"))
                .forEach(System.out::println);
    }

    public void showByPrice() {
        ArrayList<Car> cars = Car.carFactory();
        cars.stream()
                .filter(car -> car.getPrice() > 1000)
                .forEach(System.out::println);
    }

    public void sortByPrice() {
        ArrayList<Car> cars = Car.carFactory();
        cars.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .forEach(System.out::println);
    }
}
