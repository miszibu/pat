package jia;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/8.
 */
public class item1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0000");
        int curNum = sc.nextInt();
        int a = sort(curNum,true);
        int b = sort(curNum,false);
        int curAnswer = a-b;
        int newAnswer;
       do{
           System.out.println(df.format(a)+" - "+df.format(b)+" = "+df.format(curAnswer));
           a = sort(curAnswer,true);
           b = sort(curAnswer,false);
           newAnswer = a -b;
           if (newAnswer == curAnswer){
               break;
           }else{
               curAnswer =newAnswer;
           }
       }while (true);
    }

    public static int sort(int temp, boolean order) {
        int[] num = new int[4];
        for (int i = 3; i >= 0; i--) {
            num[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (3 - i); j++) {
                if (order && num[j] < num[j + 1]) {//从大到小
                        num[j] ^= num[j + 1];
                        num[j + 1] ^= num[j];
                        num[j] ^= num[j + 1];
                }else if(!order && num[j] > num[j + 1]){
                    num[j] ^= num[j + 1];
                    num[j + 1] ^= num[j];
                    num[j] ^= num[j + 1];
                }
            }
        }
        for (int i = 0; i <3; i++) {
            temp += num[i];
            temp *= 10;
        }
        return temp+=num[3];
    }
}
