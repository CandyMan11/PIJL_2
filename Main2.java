/*
Name-> Saksham Sharma
PRN-> 23070126113
Branch-> AIML B2
 */

//package Assignment_2;

public class Main2 
{
    public static void main(String[] args) 
    {
        Array_functions obj = new Array_functions();
        
        obj.Distribute();
        System.out.println();

        int index = obj.minDistance();
        System.out.println("Index of the first number of the pair with minimum distance: " + index);

        // Close Scanner after all input is taken
        UserInput2 inputObj = new UserInput2();
        inputObj.closeScanner();
    }    
}
