import java.util.Scanner;

public class Prompter{
    private String itemInput;
    private int maximumNumberInput;
    private int userGuessedNumber;
    Scanner scanner =  new Scanner(System.in);

    public String itemInput(){
        
        System.out.println("What type of item should fill the jar? ");
        itemInput = scanner.nextLine();
        return itemInput;
    }

    public int maximumNumberInput(){
        System.out.printf("What is the maximum amount of %s: %n", itemInput);
        maximumNumberInput = scanner.nextInt();
        return maximumNumberInput;
    }

    public int userGuessedNumber(){
        System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", itemInput ,maximumNumberInput);
        userGuessedNumber = scanner.nextInt();
        return userGuessedNumber;
    }

    public void feedback(boolean lessThan){

        if (lessThan){
            System.out.printf("Your number is lower than the actual number of %s %n", itemInput);
        }else{
            System.out.printf("Your number is higher than the actual number of %s %n", itemInput);
        }
    }

    public void displayScore(int count){
        System.out.printf("You got it in %d attempt(s)! ", count + 1);
    }
}