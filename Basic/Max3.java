package 基本;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kana
 */

//3つの整数値を読み込んで最大値を求めて表示するプログラム

import java.util.Scanner; //型インポート宣言

public class Max3 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in); // 標準入力ストリーム
        
        System.out.println("3つの整数の最大値を求めます。");
        System.out.print("aの値:"); int a = stdIn.nextInt(); //int型の整数値を読み込む部分
        System.out.print("bの値:"); int b = stdIn.nextInt();
        System.out.print("cの値:"); int c = stdIn.nextInt();
        
////a,b,cの最大値を求めてmaxに代入////
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
////////////////////////////////////
        System.out.println("最大値は"+max+"です。");
     
    }
}
