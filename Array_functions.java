import java.util.ArrayList;

public class Array_functions
{
    //method to print out arrays
    public void DisplayArray(ArrayList<Integer> arr){
        System.out.println(arr);
    }
    

    //method to distribute even/odd numbers
    public void Distribute()
    {
        UserInput2 obj = new UserInput2();

        int arr[] = obj.arrayInput();

        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2 == 0){
                evenList.add(arr[i]);            
            }

            else{
                oddList.add(arr[i]);
            }
        }
        
        System.out.print("Even array: ");
        DisplayArray(evenList);
        System.out.print("Odd array: ");
        DisplayArray(oddList);
    }


    //method to calculate the minimum distance between two adjacent numbers
    public int minDistance()
    {
        UserInput2 obj = new UserInput2();

        int arr[] = obj.arrayInput();

        ArrayList<Integer> list = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for(int i = 0; i < arr.length - 1; i++) 
        {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            list.add(diff);

            if(diff < minDiff){
                minDiff = diff;
                minIndex = i;
            }
        }

        //DisplayArray(list);
        return minIndex;
    }
}
