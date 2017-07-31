package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/30.
 * Shortest Distance (20)
 * just a circle so the negative value = totalValue - positiveOrdered value
 */
public class item1035True {
    static int[] circle ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int circleNum = sc.nextInt();
        int totalVal = 0;
        circle = new int[circleNum];
        for (int i =0;i<circleNum;i++){
            circle[i]=sc.nextInt();
            totalVal+=circle[i];
        }
        int dataNum = sc.nextInt();
        for (int i =0;i<dataNum;i++){
            int temp = positiveOrder(sc.nextInt(),sc.nextInt());
            System.out.println(temp*2>totalVal?totalVal-temp:temp);
        }
    }
    public static int positiveOrder(int begin,int end){
        if(begin>end){
            begin = begin ^ end;
            end = begin ^ end;
            begin = begin ^ end;
        }
        int val=0;
        for(int i =begin;i<end;i++){
            val+=circle[i-1];
        }
        return val;
    }
}
