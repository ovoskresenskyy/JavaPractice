package Practice_05112022;

public class Main {
    public static void main(String[] args) {

        //tryingTasksWithIntegerAndString();

        streamWithObjects();
    }

    private static void streamWithObjects() {

        StreamDemo streamDemo = new StreamDemo();
        //streamDemo.showAll();
        //streamDemo.showByColor();
        //streamDemo.showByPrice();
        streamDemo.sortByPrice();
    }

    private static void tryingTasksWithIntegerAndString() {
        StreamDemo streamDemo = new StreamDemo();
        System.out.println("Count of pairs: " + streamDemo.countOfPairedValues());
        System.out.println("Count of even numbers: " + streamDemo.countOfEvenNumbers());

        streamDemo.showWordsStaredWithChar('A');
        streamDemo.sortStrings();
    }
}
