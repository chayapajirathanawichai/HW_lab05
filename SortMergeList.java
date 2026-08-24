/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab5;
import java.util.ArrayList;
import java.util.Scanner;

public class SortMergeList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1=AddList();
        ArrayList<Integer> list2=AddList();
        ArrayList<Integer> result=new ArrayList<Integer>();
        
        result=intersect(list1, list2);
        
        for(int i=0;i<result.size();i++){
            int c=result.get(i);
            System.out.print(c+" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> AddList(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
         while(true){
            int b=sc.nextInt();
            if(b==0) break;
            list.add(b);
        }
         return list;
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;
        while(i<list1.size()&&j<list2.size()){
            int val1=list1.get(i);
            int val2=list2.get(j);
            
            if(val1==val2){
                result.add(val1);
                i++;j++;
            }
            else if(val1<val2){
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
}
