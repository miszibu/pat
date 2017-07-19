package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 有假币counterfeit currency
 * 三分制 没想到啊 脑子里都二分的 思维太局狭了
 */
public class item1022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a == 0) {
                return;
            } else {
                System.out.println(times(a));
            }

        }
    }

    public static int times(int amount) {
        if (amount == 1) {
            return 0;
        } else if (amount <= 3) {
            return 1;
        } else {
            return 1 + times((int) Math.ceil(amount / 3.0));
        }
    }
}
