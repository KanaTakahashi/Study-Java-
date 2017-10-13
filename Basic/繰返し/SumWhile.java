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
import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("1からnまでの和を求めます。");
        System.out.print("nの値：");
        int n = stdIn.nextInt();
        
        int sum = 0;
        int i = 1;
/*While文は繰り返しを続けるかどうかを処理実行の前に判断する
  前判定繰返し*/
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("1から"+n+"までの和は"+sum+"です。");
    }
    
}
