/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab5;

import java.util.Scanner;
import java.util.ArrayList;

public class Algorithms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int M=sc.nextInt();int N=sc.nextInt();int K=sc.nextInt();
        
        ArrayList<ArrayList<Long>> pref=new ArrayList<>(); //collect prefix sum
        
        for(int i=0;i<=M;i++){
            ArrayList<Long> row=new ArrayList<>();
            for(int j=0;j<=N;j++){
                row.add(0L);
            }
            pref.add(row);
        }
        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                long val=sc.nextLong();
                long top=pref.get(i-1).get(j);
                long left=pref.get(i).get(j-1);
                long topleft=pref.get(i-1).get(j-1);
                
                long currentpref=val+top+left-topleft;
                pref.get(i).set(j, currentpref);
            }
        }
        long maxPopulation=0;
        
        for(int i=K;i<=M;i++){
            for(int j=K;j<=N;j++){
                long currentSum=pref.get(i).get(j)-pref.get(i-K).get(j)-pref.get(i).get(j-K)+pref.get(i-K).get(j-K);
                if(currentSum>maxPopulation){
                    maxPopulation=currentSum;
                }
            }
        }
        System.out.println(maxPopulation);
        sc.close();
    }
}
