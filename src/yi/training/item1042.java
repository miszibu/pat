package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 一元多项式求导  题目很蠢 问题描述错误 空字符串 输出时 要输出0  0
 */
public class item1042 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;//系数
        int b;//指数
        boolean first = true;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            if(b!=0){
                if(first){
                    System.out.print(a*b+" "+(b-1));
                    first= ! first;
                }else{
                    System.out.print(" "+a*b+" "+(b-1));
                }
            }else if(b==0 && first){
                System.out.print(0+" "+0);
            }
        }
    }
}
