package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 蟠桃记 peach record
 */
public class item1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int day = sc.nextInt();
            int amount=1;
            for(int i =0;i<day-1;i++){
                amount=(amount+1)*2;
            }
            if(day!=0)
             System.out.println(amount);
        }
    }
}