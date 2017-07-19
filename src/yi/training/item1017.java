package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 外星人的语言 foreign language
 * 进制转换
 */
public class item1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int format = sc.nextInt();
            while(num/format>format){
                System.out.print(num%format);
            }
            System.out.println();
        }

    }
}
