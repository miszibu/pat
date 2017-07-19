package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 乒乓球筐 直接暴力了
 */
public class item1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        int[] aList = new int[26];
        int[] bList = new int[26];
        while (sc.hasNext()) {
            String status = "Yes";
            a = sc.next();
            b = sc.next();
            for(int i =0;i<26;i++){//数组初始化
                aList[i] = 0;
                bList[i] = 0;
            }
            for(int i =0;i<a.length();i++){
                aList[a.charAt(i)-65]++;
            }
            for(int i =0;i<b.length();i++){
                bList[b.charAt(i)-65]++;
            }
            for(int i =0;i<26;i++){
                if(bList[i]>aList[i]){
                    status="No";
                    break;
                }
            }
            System.out.println(status);
        }
    }
}
