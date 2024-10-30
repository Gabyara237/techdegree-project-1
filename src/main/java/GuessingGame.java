public class GuessingGame {
    public static void main(String[] args) {

        // New instance of the Prompter class to handle user prompts and input.
        Prompter prompter = new Prompter();

        int guessAttemptCounter = 0;
        
        String itemInput = prompter.itemInput();
        int maximumNumberInput = prompter.maximumNumberInput();
        
        // New instance of the Jar class.
        Jar jar = new Jar(itemInput,maximumNumberInput);
        
        // The method is called to fill the jar with a random number of items.
        jar.fill();

        int userGuessedNumber=0;
        
        // The current number of elements in the jar is obtained.
        int currentNumberItems = jar.getCurrentNumberItems();

        // While allowing the player to enter his guess until he guesses the correct number of items in the jar.
        while( userGuessedNumber != currentNumberItems ){
            
            try{
                userGuessedNumber = prompter.userGuessedNumber(currentNumberItems);
                if( userGuessedNumber == currentNumberItems){
                    break;
                }
                // Feedback is provided based on the number entered by the user.
                prompter.feedback(userGuessedNumber < currentNumberItems);
                guessAttemptCounter++;

            }catch(IllegalArgumentException iae){
                prompter.displayIaeMessage(iae.getMessage());
            }
            
        }
        // Display results once the player guesses the number of items in the jar.
        prompter.displayScore(guessAttemptCounter);
        
    }
}
