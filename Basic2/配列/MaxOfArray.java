/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 配列;

/**
 *
 * @author kana
 */
//配列の要素の最大値を表示する(値を読み込む)

import java.util.Scanner;

public class MaxOfArray {
    
        //---配列aの最大値を求めて返却--//
    static int maxof(int[]a){
        int max = a[0];
    for(int i = 1; i <  a.length; i++)
        if(a[i]>max)
        max = a[i];
    //配列の要素を一つずつ順になぞっていく手続きのことを「走査」と呼ぶ
    return max;
}
    
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
    
        System.out.println("身長の最大値を求めます。");
        System.out.print("人数は：");
        int num = stdIn.nextInt(); //配列の要素数を読み込む
        
        int[] height = new int[num];//要素数numの配列を生成
        
        for(int i = 0; i < num; i++){
            System.out.print("height[" +i+ "]:");
            height[i] = stdIn.nextInt();         
        }
        
        System.out.println("最大値は" +maxof(height)+ "です");
    }
}
