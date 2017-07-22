package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/29.
 * 在霍格沃茨找零钱 17 和 29 审题不清 看成了 17 和 19
 * 需记住 仔细审题
 */
public class item1027True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] P;
        String[] A;
        while(sc.hasNext()) {
            int PMoneyAmount = 0;
            int AMoneyAmount = 0;
            int moneyBackAmount = 0;
            int[] moneyBackList=new int[3];
            P=sc.next().split("\\.");
            A=sc.next().split("\\.");
            PMoneyAmount+=Integer.parseInt(P[0])*17*29;
            AMoneyAmount+=Integer.parseInt(A[0])*17*29;
            PMoneyAmount+=Integer.parseInt(P[1])*29;
            AMoneyAmount+=Integer.parseInt(A[1])*29;
            PMoneyAmount+=Integer.parseInt(P[2]);
            AMoneyAmount+=Integer.parseInt(A[2]);
            moneyBackAmount = AMoneyAmount - PMoneyAmount;
            boolean isPositive = moneyBackAmount>0?true:false;
            moneyBackAmount= Math.abs(moneyBackAmount);
            moneyBackList[2]=moneyBackAmount%29;
            moneyBackAmount/=29;
            moneyBackList[1]=moneyBackAmount%17;
            moneyBackAmount/=17;
            moneyBackList[0]=moneyBackAmount;
            if(!isPositive){
                System.out.print("-");
            }
            System.out.println(moneyBackList[0]+"."+moneyBackList[1]+"."+moneyBackList[2]);
        }
    }
}
