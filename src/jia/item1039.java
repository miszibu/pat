package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/8/4.
 * String Subtraction 额 随便写了下 觉得肯定超时 结果过了
 * 那可能20分的题目都是送的吧
 */
public class item1039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        StringBuilder b = new StringBuilder(sc.nextLine());
        for (int i=0;i<b.length();i++){
            for (int j=0;j<a.length();j++){
                if (a.charAt(j)==b.charAt(i)){
                    a.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(a.toString());
    }
}
