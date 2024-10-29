import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("What type of item should fill the jar? ");
        String itemInput = scanner.nextLine();
        System.out.printf("What is the maximum amount of %s: %n", itemInput);
        int maximumNumberInput = scanner.nextInt();

        Jar jar = new Jar(itemInput,maximumNumberInput);
    }
}
