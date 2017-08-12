package jia;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zibu on 2017/8/4.
 * Pop Sequence 主要是考对栈的理解吧
 * 第一次直接push进数组 后面如果小于index就pop 否则继续push直到结束
 * 然后注意为了剪枝 而做的 break需要读取剩余的int //这BUG找了好久
 */
public class item1040 {
    static int stackMax;
    static int numMax;
    static int lineNum;
    static int index = 0 ;
    static Stack<Integer> sta = new Stack();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackMax = sc.nextInt();
        numMax = sc.nextInt();
        lineNum = sc.nextInt();
        for (int i=0;i<lineNum;i++){
            int first = sc.nextInt();
            for (int a=1;a<=first-1;a++)
                sta.push(a);
            index=first;
            if(sta.size()<stackMax){
                boolean isRight = true;
                for (int j=1;j<numMax;j++){
                    int temp =sc.nextInt();
                    if(temp>index){
                        //push(temp-1,index);
                        for (int a=index+1;a<=temp-1;a++)
                            sta.push(a);
                        if(sta.size()>=stackMax){
                            isRight = false;
                            for (int remain =j+1;remain<numMax;remain++)//读取剩下的字符 然后跳出（减枝）
                                sc.nextInt();
                            break;
                        }
                        index=temp;
                    }else{
                       // System.out.println(sta.toString());
                       // System.out.println(temp);
                        if (sta.pop()!=temp){
                            isRight = false;
                            for (int remain =j+1;remain<numMax;remain++)//读取剩下的字符 然后跳出（减枝）
                                sc.nextInt();
                            break;
                        }
                    }
                }
                if (isRight)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }else{
                for (int remain =1;remain<numMax;remain++)//读取剩下的字符 然后跳出（减枝）
                    sc.nextInt();
                System.out.println("NO");
            }
            sta.clear();
        }
    }

}
