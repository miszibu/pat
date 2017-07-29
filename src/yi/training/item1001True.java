package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/27.
 * A+B>C
 */
public class item1001True {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            long[] a = new  long[length];
            long[] b = new  long[length];
            long[] c = new  long[length];
            for(int i =0;i<length;i++){
                a[i]=sc.nextLong();
                b[i]=sc.nextLong();
                c[i]=sc.nextLong();
                boolean isTrue =a[i]+b[i]>c[i]?true:false;
                System.out.println("Case #"+(i+1)+": "+isTrue);
            }

        }
    }

}
