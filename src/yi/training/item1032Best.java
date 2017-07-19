package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 一个减治法的思想 约瑟夫问题 f[i]=(f[i-1]+m)/n
 */
public class item1032Best {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int monNum = sc.nextInt();
            int num = sc.nextInt();
            int r=0;
            for(int i =2;i<=monNum;i++){
                r=(r+num)%i;
            }
            System.out.println(r+1);
        }
    }
}
