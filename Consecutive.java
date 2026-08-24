/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab5;

import java.util.Scanner;
import java.util.ArrayList;

public class Consecutive {
    public boolean isConsecutiveFour(int[][] values){
        int rows=values.length;
        if(rows==0) return false;
        int cols=values[0].length;
        
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                int val=values[r][c];
                if(c+3<cols){
                    if(val==values[r][c+1]&&val==values[r][c+2]&&val==values[r][c+3]) return true;
                }
                if(r+3<rows){
                    if(val==values[r+1][c]&&val==values[r+2][c]&&val==values[r+3][c]) return true;
                }
                if(r+3<rows&&c+3<cols){
                    if(val==values[r+1][c+1]&&val==values[r+2][c+2]&&val==values[r+3][c+3]) return true;
                }
                if(r+3<rows&&c-3>=0){
                    if(val==values[r+1][c-1]&&val==values[r+2][c-2]&&val==values[r+3][c-3]) return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Consecutive cc=new Consecutive();
        if(cc.isConsecutiveFour(arr)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
