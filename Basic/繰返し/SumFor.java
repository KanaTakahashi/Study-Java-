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

public class SumFor {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("1からnまでの和を求めます。");
        System.out.print("nの値：");
        int n = stdIn.nextInt();
        
        int sum = 1;
/*For文は初期化部で,最初に(繰り返しが行われる前に)1度だけ評価,実行される
  文を実行した直後に,更新部(i++)が評価,実行される.
  */
        for(int i = 2; i <= n; i++)
            sum += i;
        
        System.out.println("1から"+n+"までの和は"+sum+"です。");
    }
}
