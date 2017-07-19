package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 *  换个格式输出整数  耗时最短的吧 目前1分钟
 *  234输出例子:BBSSS1234
 */
public class item1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            for(int i=0;i<num/100;i++){
                System.out.print("B");
            }
            num%=100;
            for(int i=0;i<num/10;i++){
                System.out.print("S");
            }
            num%=10;
            for(int i=0;i<num;i++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
