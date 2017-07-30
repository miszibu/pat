package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/30.
 * A+B in Hogwarts
 * 1/17/29 注意正则 \\
 */
public class item1018True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("\\.");
        String[] B = sc.next().split("\\.");
        int[] total = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            total[i] = Integer.parseInt(A[i]) + Integer.parseInt(B[i]);
        }
        total[1]+=total[2]/29;
        total[2]%=29;
        total[0]+=total[1]/17;
        total[1]%=17;
        System.out.println(total[0]+"."+total[1]+"."+total[2]);


    }
}
