package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 写出这个数  write this number
 *  字符串转化吧 没什么难度
 */
public class item1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chineseNum = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        while (sc.hasNext()) {
            int totalNum = 0 ;
            String num = sc.nextLine();
            for (int i =0;i<num.length();i++){
                totalNum += Integer.parseInt(""+num.charAt(i));
            }
            String totalNumSting = totalNum+"";
            for (int i = 0 ;i<totalNumSting.length()-1;i++){
                System.out.print(chineseNum[Integer.parseInt(""+totalNumSting.charAt(i))] + " ");
            }
            System.out.print(chineseNum[Integer.parseInt(""+totalNumSting.charAt(totalNumSting.length()-1))]);
        }
    }
}
