
package day5;
import java.util.*;


public class Day5 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int size=sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> leaders=new ArrayList<>();
       
        if(arr.length >1)
        {
            int maxFromRight=arr[size-1];
            leaders.add(maxFromRight); //last element is always leader
            for(int i=size-2;i>=0;i--)
            {
                if(arr[i] >= maxFromRight)
                {
                    maxFromRight=arr[i];   //here updating max element
                    leaders.add(maxFromRight);   //adding into array
                }
            }
            
            Collections.reverse(leaders);
          
        }
        else if(size==1){
            leaders.add(arr[0]);
        }
        System.out.print(leaders+ " ");
        System.out.println();
        
    }
    
}
