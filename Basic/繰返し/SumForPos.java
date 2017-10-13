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

public class SumForPos {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;
        
        System.out.println("1からnまでの和を求めます。");
        
  /*nが0より大きくなるまで繰り返す.
   nの値として0以下を入力すると,再び[nの値:]と表示される*/
  
     do{
        System.out.print("nの値：");
        n = stdIn.nextInt();
     }while( n <= 0);
        
        int sum = 1;

        for(int i = 2; i <= n; i++)
            sum += i;
        
        System.out.println("1から"+n+"までの和は"+sum+"です。");
    }
}
