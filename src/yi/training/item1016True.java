package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/26.
 * 程序运行时间 procedure run time
 */
public class item1016True {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int runTime = (int)Math.round(-(sc.nextInt()-sc.nextInt())/100.0);
            int hours=0,mins=0,seconds=0;
            String out = "";
            seconds = runTime%60;
            runTime/=60;
            mins = runTime%60;
            runTime/=60;
            hours = runTime;
            out+=hours<10?"0"+hours:""+hours;
            out+=":";
            out+=mins<10?"0"+mins:""+mins;
            out+=":";
            out+=seconds<10?"0"+seconds:""+seconds;
            System.out.print(out);
        }
    }
}
