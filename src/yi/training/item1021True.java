package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/19.
 */
public class item1021True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] weight = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        while(sc.hasNext()) {
            boolean isAllPass = true;
            int index=sc.nextInt();
            String[] IDCard = new String[index];
            boolean[] IDCardPass = new boolean[index];
            for(int i =0;i<index;i++){
                IDCard[i]=sc.next();
                IDCardPass[i]=true;
            }
            for(int i =0;i<index;i++){
                for(int j =0;j<17;j++){
                    if('9'<IDCard[i].charAt(j) || IDCard[i].charAt(j)<'0'){//非数字
                        isAllPass =false;
                        break;
                    }
                }
            }
            }
    }
}
