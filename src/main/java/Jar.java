import java.util.Random;

public class Jar{

    //Private instance variables
    private String itemName;
    private int maximumItems;
    private int currentNumberItems;

    //Constructor that takes these two parameters and initializes the instance variables.
    public Jar(String itemName, int maximumItems){
        this.itemName = itemName;
        this.maximumItems = maximumItems;
    }

    //Getter methods for both instance variables.
    public String getItemName(){
        return  itemName;
    }
    
    public int getMaximumItems(){
        return maximumItems;
    }

public void fill(){
    // Random class to generate a random number of items between 1 and the maximum number of items set by the administrator.
    Random random = new Random();
    int randomNumberItems = random.nextInt( maximumItems) + 1;
    
    //Current number of items to this random number.
    currentNumberItems = randomNumberItems;
    
}

// Getter method for the current number of items.
public int getCurrentNumberItems(){

    return currentNumberItems;
}


}