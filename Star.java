/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw5;

import java.util.ArrayList;
import java.util.Scanner;

public class Star {
    //method
    public static void addStars(ArrayList<String> arr){
        System.out.print("[");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+",* ");
        }
        System.out.println("]");
    }
    public static void removeStars(ArrayList<String> arr){
        System.out.print("[");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+", ");
        }
        System.out.println("]");
    }
    
    //main
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<String>();
        while(sc.hasNext()&&!sc.hasNextInt()){
            arr.add(sc.next());
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int ins=sc.nextInt();
            if(ins==1){
                addStars(arr);
            }
            else if(ins==2){
                removeStars(arr);
            }
        }
    }
}
