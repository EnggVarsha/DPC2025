package day1;
import java.util.*;


public class Day1 {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
       sortElements(arr);
        
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    
    
   
    
    public static void sortElements(int[] arr){
        int start=0;
        int mid=0;
        int end=arr.length-1;
        
        while(mid <=end){
            if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else{
                swap(arr,mid,end);
                end--;
            }
        }
    }
     public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
