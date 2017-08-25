package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/8/4.
 * Longest Symmetric String
 * 一开始错了三个 不是很懂 原因：理解错了对称的意义 题目给的案例是 aba的对称 其实 aa也是对称
 * 所以增加一个判断就直接过了 只要不超时间 题目都很简单
 */
public class item1051 {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       StringBuilder s = new StringBuilder(sc.nextLine());
       int maxWidth = 0;
       int curWidth=1;
       int len = s.length();
        for (int i =1;i<len-1;i++){
           while(s.charAt(i-curWidth)==s.charAt(i+curWidth)){
               curWidth++;
               if (i-curWidth<0 || i+curWidth>len-1)
                   break;
           }
//           if(k>1){
//               for (int j =i-k;j<i+k;j++)
//                   System.out.print(s.charAt(j));
//               System.out.println();
//           }
           if ((curWidth-1)*2+1>maxWidth && curWidth>1){
               maxWidth=(curWidth-1)*2+1;
           }
           curWidth=1;
       }
        for (int i =1;i<len-1;i++){
            while(s.charAt(i+1-curWidth)==s.charAt(i+curWidth)){
                curWidth++;
                if (i+1-curWidth<0 || i+curWidth>len-1)
                    break;
            }
            if ((curWidth-1)*2>maxWidth && curWidth>1){
                maxWidth=(curWidth-1)*2;
            }
            curWidth=1;
        }
       System.out.println(maxWidth);
    }
}
