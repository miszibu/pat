package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/30.
 * 这个太精彩了 理论上切到同一个点 那就会相同之后的  就记录这个点就可以了
 */
public class item1046Best {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        sc.next();
        int[] isExisted = new int[100000];
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            sc.next();
            sc.next();
            int temp = sc.nextInt();
            if (temp == -1) {
                continue;
            } else {
                if (isExisted[temp] == 1) {
                    System.out.println(temp);
                    return;
                } else {
                    isExisted[temp]++;
                }
            }

        }
        System.out.println(-1);

    }
}
