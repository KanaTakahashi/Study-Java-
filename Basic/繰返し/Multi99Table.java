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
//九九の表を表示

public class Multi99Table {
    public static void main(String[] args){
        System.out.println("----- 九九の表 -----");
        
        for( int i = 1; i <= 9; i++){  //多重ループ
           for( int j = 1; j <= 9; j++)
               System.out.printf("%3d", i * j );
            System.out.println();
        }
    }
    
}
