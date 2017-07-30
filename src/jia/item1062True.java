package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/27.
 * to buy or not to buy
 */
public class item1062True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            int withoutNum = 0;
            boolean[] aChoose = new boolean[a.length()];
            for(int i = 0 ;i<a.length();i++){
                aChoose[i] = false;
            }
            for(int i = 0 ;i<b.length();i++){
                boolean isExist = false;
                for(int j = 0 ;j<a.length();j++){
                    if(a.charAt(j)==b.charAt(i) && !aChoose[j]){
                        aChoose[j] = true;
                        isExist = true;
                        break;
                    }
                }
                if(!isExist){
                    withoutNum++;
                }
            }
            if(withoutNum==0){
                System.out.println("Yes "+(a.length()-b.length()));
            }else{
                System.out.println("No "+withoutNum);
            }
        }
    }
}
