package jia;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/27.
 * A+B and C 取巧用了BigInteger
 */
public class item1023True {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            for(int i =0;i<length;i++){
                boolean isTrue =BigInteger.valueOf(sc.nextLong()).add(BigInteger.valueOf(sc.nextLong())).compareTo(BigInteger.valueOf(sc.nextLong()))>0?true:false;
                System.out.println("Case #"+(i+1)+": "+isTrue);
            }

        }
    }

}
