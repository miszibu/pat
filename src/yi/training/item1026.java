package yi.training;

import java.util.Scanner;
import java.math.BigDecimal;


/**
 * Created by zibu on 2017/7/18.
 * 圆周率 circumference ratio
 * 利用BigDecimal的方法直接计算
 * 和自制除法运算
 */
public class item1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*while (sc.hasNext()){
            BigDecimal dividend = new BigDecimal(sc.nextInt());
            BigDecimal divisor = new BigDecimal(sc.nextInt());
            BigDecimal result = dividend.divide(divisor, sc.nextInt(), BigDecimal.ROUND_DOWN);
            System.out.println(result);
        }*/
        while (sc.hasNext()){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int scale =sc.nextInt();
            StringBuffer out = new StringBuffer("0.");
            while(scale-->0){
                out.append(a*10/b);
                a = a*10 %b;
            }
            System.out.println(out);

        }
    }
}
