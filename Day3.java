
package day3;

import java.util.Scanner;


public class Day3 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter size : ");
            int n=sc.nextInt();
            System.out.print("Enter elements : ");
            int[] arr=new int[n];
            for(int i=0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            int ele=DuplicateElement(arr);
            System.out.println("Duplicate Element : "+ele);
    }
    public static int DuplicateElement(int[] arr){
       int n=arr.length;
       int[] temp=new int[n];
       
       for(int i=0;i<n;i++)
       {
            if(temp[arr[i]]==1)
            {
                return arr[i];
                   
             }
            else
            {
                 temp[arr[i]]=1;
            }
       }
      return -1;
        
    }
    
    
    
}
