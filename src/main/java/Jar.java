public class Jar{

    //Private instance variables
    private String itemName;
    private int maximumNumberItems;

    //Constructor that takes these two parameters and initializes the instance variables.
    public Jar(String itemName, int maximumNumberItems){
        this.itemName = itemName;
        this.maximumNumberItems = maximumNumberItems;
    }

    //Getter methods for both instance variables.
    public String getItemName(){
        return  itemName;
    }
    
    public int getMaximumNumberItems(){
        return maximumNumberItems;
    }
}