package 配列;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kana
 */
//構成要素型がint型の配列(構成要素数は5：newによって本体を生成)

public class IntArray {
    public static void main(String[] args){
        int[]a = new int[5]; //配列の宣言
        //配列初期化　int[a] = {0,37,51,0,74}; によって生成もできる.
        //int[]b = a.clone(); を使い,配列の複製ができる.
        
        a[1] = 37; //a[1]に37を代入
        a[2] = 51; //a[2]に51を代入
        a[4] = a[1] * 2; //a[4]に74を代入
        
        for (int i = 0; i < a.length; i++) //各要素の値を表示　.lengthは配列の要素数
            System.out.println("a[" + i + "] =" + a[i] );
                    
    }
}
