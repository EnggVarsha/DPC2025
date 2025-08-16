/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day2;

import java.util.*;
public class Day2 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size : ");
        int n=sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int ele=MissingElement(arr);
        System.out.println("Missing element : "+ele);
       
    }
    
    public static int MissingElement(int[] arr){
        
        int i=0;
        int start=1;
        while(i< arr.length){
            if(arr[i]==start){
                i++;
                start++;
                
            }else{
                return start;
            }
        }
        return start;
    }
    
}
