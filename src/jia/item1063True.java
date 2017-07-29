package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/27.
 */
public class item1063True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String oriString = sc.next();
            int t=0,at=0,pat=0;
            for(int i = oriString.length()-1;i>=0;i--){
                if(oriString.charAt(i)=='T'){
                    t++;
                }else if(oriString.charAt(i)=='A'){
                    at+=t;
                    at%=1000000007;
                }else{
                    pat+=at;
                    pat%=1000000007;
                }
            }
            System.out.println(pat);
        }
    }
}
