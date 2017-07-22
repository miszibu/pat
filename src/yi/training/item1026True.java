package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/19.
 * 跟奥巴马一起编程 coding with
 */
public class item1026True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            String c = sc.next();
            String topAndBottom = "";
            String middle = "";
            for(int i =0;i<num;i++){
                topAndBottom+=c;
                middle+=(i==0 || i==num-1)?c:" ";
            }
            for(int i =0;i<Math.round(num/2.0);i++) {
                if(i==0 || i==(Math.round(num/2.0)-1))
                    System.out.println(topAndBottom);
                else
                    System.out.println(middle);
            }
        }
    }
}
