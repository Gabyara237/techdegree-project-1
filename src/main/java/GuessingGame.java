import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("What type of item should fill the jar? ");
        String itemInput = scanner.nextLine();

        System.out.printf("What is the maximum amount of %s: %n", itemInput);
        int maximumNumberInput = scanner.nextInt();

        Jar jar = new Jar(itemInput,maximumNumberInput);
        
        jar.fill();
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", itemInput ,maximumNumberInput);
        int userGuessedNumber = scanner.nextInt();
    }
}
