package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 */
public class item1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            long sum = 0;
            for(int i = 0;i<str.length();i++){
                sum += (str.charAt(i)-'0')*(Math.pow(2,str.length()-i)-1);
            }
            System.out.println(sum);
        }
    }
}
