import java.util.Scanner;

public class Prompter{

    private String itemInput;
    private int maximumNumberInput;
    private int userGuessedNumber;
    Scanner scanner =  new Scanner(System.in);

    // Method requesting type of items
    public String itemInput(){
        
        System.out.println("What type of item should fill the jar? ");
        itemInput = scanner.nextLine();
        return itemInput;
    }
    
    // Method requesting item quantity
    public int maximumNumberInput(){
        System.out.printf("What is the maximum amount of %s: %n", itemInput);
        maximumNumberInput = scanner.nextInt();
        return maximumNumberInput;
    }
    
    // Method that prompts the user to enter the amount of items he/she believes are in the jar.
    public int userGuessedNumber(int currentNumberItems){
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", itemInput ,maximumNumberInput);
        userGuessedNumber = scanner.nextInt();
        if(userGuessedNumber > maximumNumberInput){
            throw new IllegalArgumentException("Your guess must be less than maximum fill amount");
        }
        return userGuessedNumber;
    }

    // Method that offers the user a feeback according to the number entered and the number to guess.
    public void feedback(boolean lessThan){

        if (lessThan){
            System.out.println("Your guess is too low.");
        }else{
            System.out.println("Your guess is too high.");
        }
    }

    // Method that display result after user wins the game
    public void displayScore(int count){
        System.out.printf("You got it in %d attempt(s)! ", count + 1);
    }
    
    // Method that displays the error message
    public void displayIaeMessage(String message){
        System.out.printf("%s please try again. %n", message);
    }
}