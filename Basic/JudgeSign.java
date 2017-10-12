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

//読み込んだ整数値の正,負,0を判定するプログラム

import java.util.Scanner;
        
public class JudgeSign {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("整数を入力：");
        int n = stdIn.nextInt();
        
        if( n>0 )
            System.out.println("それは正です。");
        else if( n<0 )
            System.out.println("それは負です。");
        else
            System.out.println("それは0です。");  
    }
    
}
