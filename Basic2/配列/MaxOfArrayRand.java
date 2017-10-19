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
//配列の要素の最大値を表示する(値は乱数！)  

import java.util.Random; //①Randomクラスを単純名で利用するための型インポート宣言
import java.util.Scanner;

public class MaxOfArrayRand {  
    
//---配列aの最大値を求めて返却--//
    static int maxof(int[]a){
        int max = a[0];
    for(int i = 1; i <  a.length; i++)
        if(a[i]>max)
        max = a[i];
    return max;
}
    
    
    public static void main(String[] args){
        Random rand = new Random(); //②Randomクラス型の変数を作るための宣言
                //Random rand = new Random(); または(n)でインスタンスの生成
        Scanner stdIn = new Scanner(System.in);
    
        System.out.println("身長の最大値を求めます。");
        System.out.print("人数は：");
        int num = stdIn.nextInt(); //配列の要素数を読み込む
        
        int[] height = new int[num];//要素数numの配列を生成
        
        System.out.println("身長は次のようになっています。");
        for(int i = 0; i < num; i++){
            //③変数randに対する,乱数を生成するメソッドnestIntの呼び出し  
            height[i] = 100+rand.nextInt(90);  // 0～n-1（89）までの乱数 
            //nextInt nextBoolean() nextLong() ...で,生成される乱数の範囲が決まる.
            
                   System.out.println("height[" +i+ "]:"+height[i]);
        }
        
        System.out.println("最大値は" +maxof(height)+ "です");
    }
}

