import java.util.Scanner;

public class UserInput2 
{
    private Scanner sc = new Scanner(System.in);

    //method to take input of array
    public int[] arrayInput() 
    {
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    //method to close scanner when all input is done
    public void closeScanner(){
        sc.close();
    }
}
