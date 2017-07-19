
package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/17.
 * 题目很简单 但是因为一些小问题 反而花了几十分钟 很尴尬
 */
public class item1011 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int x, y;
        while (keyBoard.hasNext()) {
            String out = "OK";
            x = keyBoard.nextInt();
            y = keyBoard.nextInt();
            if (x == 0 && y == 0)
                return;
            for (int index = x; index <= y; index++) {
                if (!isPrime(index * index + index + 41)) {
                    out = "Sorry";
                    break;
                }
            }
            System.out.println(out);
        }

    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}