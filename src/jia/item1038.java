package jia;

import sun.nio.cs.ext.MacHebrew;

import java.util.Scanner;

/**
 * Created by zibu on 2017/8/5.
 * Counting Ones (30) 这道题目主要考的不是数据结构而是问题的分析解决能力
 * 分析了很久 勉强总结出来
 * 假设数字为abcde，对于abcde中的每一个数字，可以根据该数字与1的关系，求在该数字对应位置上1出现的次数。
 具体来说：
 假设我们要求百位出现1的次数，此时我们可以根据c与1的关系，求出百位1出现的次数。
 （1）如果c = 0，则1出现的次数等于ab * 100，即 c前面的数 * c对应的基数
 在该情况下，百位出现1的次数只与c前面的数有关。
 （2）如果c = 1，则1出现的次数等于（ab * 100） + （de + 1），即（c前面的数 * c对应的基数） +（ c后面的数 + 1）
 在该情况下，百位出现1的次数与c前面和c后面的数有关。
 （3）如果c = 2，则1出现的次数等于（ab + 1）*100，即（c前面的数 +1）* c对应的基数
  这是别人的总结 拿过来用了
  题目说的数字是小于2的30次方 我理解成为了30个数字 结果写的很是复杂其实就这样
 */
public class item1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NString = sc.nextLine();
        long num = 0;
        for (int i=0;i<NString.length();i++){
            int temp = NString.charAt(i)-48;
            int prefix = i==0?0:Integer.parseInt(NString.substring(0,i));
            int suffix = i+1==NString.length()?0:Integer.parseInt(NString.substring(i+1,NString.length()));
            int level = NString.length()-i-1;
            if (temp<1){
                num+=prefix* Math.pow(10,level);
            }else if (temp==1){
                num+=prefix* Math.pow(10,level)+suffix+1;
            }else {
                num+=(prefix+1)* Math.pow(10,level);
            }
        }
        System.out.println(num);
    }
}
