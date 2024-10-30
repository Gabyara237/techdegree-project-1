public class GuessingGame {
    public static void main(String[] args) {

        Prompter prompter = new Prompter();

        int guessAttemptCounter = 0;
        
        String itemInput = prompter.itemInput();

        int maximumNumberInput = prompter.maximumNumberInput();

        Jar jar = new Jar(itemInput,maximumNumberInput);

        jar.fill();

        int userGuessedNumber=0;
        int currentNumberItems = jar.getCurrentNumberItems();

        while( userGuessedNumber != currentNumberItems ){

            try{
                userGuessedNumber = prompter.userGuessedNumber(currentNumberItems);
                if( userGuessedNumber == currentNumberItems){
                    break;
                }

                prompter.feedback(userGuessedNumber < currentNumberItems);
                guessAttemptCounter++;

            }catch(IllegalArgumentException iae){
                prompter.displayIaeMessage(iae.getMessage());
            }
            
        }
        prompter.displayScore(guessAttemptCounter);
        
    }
}
