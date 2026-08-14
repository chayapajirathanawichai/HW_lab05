/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab501 {
    //method
    public static double CalAVG(ArrayList<Integer>arr){
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum/arr.size();
    }
    public static int FindMin(ArrayList<Integer>arr){
        int min=9999;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min=arr.get(i);
            }
        }
        return min;
    }
    public static int FindMax(ArrayList<Integer>arr){
        int max=-1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
    public static void PrintOdd(ArrayList<Integer>arr){
        for(int i=0;i<arr.size();i++){
            int c=arr.get(i);
            if(c%2!=0){
                System.out.print(c+" ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        //input
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        if(arr.isEmpty()){
            sc.close();
            return;
        }
        
        //calculated&print
        System.out.printf("%.2f\n",CalAVG(arr));
        System.out.println(FindMin(arr));
        System.out.println(FindMax(arr));
        PrintOdd(arr);
    }
}
