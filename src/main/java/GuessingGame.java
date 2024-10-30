import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int guessAttemptCounter = 0;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("What type of item should fill the jar? ");
        String itemInput = scanner.nextLine();

        System.out.printf("What is the maximum amount of %s: %n", itemInput);
        int maximumNumberInput = scanner.nextInt();

        Jar jar = new Jar(itemInput,maximumNumberInput);

        jar.fill();

        int userGuessedNumber=0;
        int currentNumberItems = jar.getCurrentNumberItems();

        while( userGuessedNumber != currentNumberItems ){
            System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", itemInput ,maximumNumberInput);
            userGuessedNumber = scanner.nextInt();
            if( userGuessedNumber == currentNumberItems){
                break;
            }
            if( userGuessedNumber < currentNumberItems){
                System.out.printf("Your number is lower than the actual number of %s %n", itemInput);
            }else{
                System.out.printf("Your number is higher than the actual number of %s %n", itemInput);
            }

            guessAttemptCounter++;

        }
        
    }
}
