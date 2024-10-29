import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter an item: ");
        String itemInput = scanner.nextLine();
        System.out.printf("Your answer was: %s", itemInput);
    }
}
