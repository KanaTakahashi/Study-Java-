/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繰返し;

/**
 *
 * @author kana
 */
//左下側が直角の二等辺三角形を表示

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;
        
        System.out.println("左下直角の二等辺三角形を表示します。");
        
        do{
            System.out.print("階段は：");
            n = stdIn.nextInt();
        }while( n<= 0);
        
        for( int i = 1; i <= n; i++){ //縦方向の繰り返し
            for( int j = 1; j <= i; j++) //横方向の繰り返し
                System.out.println();
        }
    }  
}
