package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/27.
 * Hello World for U
 */
public class item1045True {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String oriChar = sc.next();
            int sideLength,bottomLength ;
            sideLength=bottomLength = (oriChar.length()-2)/3;
            if((oriChar.length()-2)%3==1){
                bottomLength+=1;
            }else if((oriChar.length()-2)%3==2){
                sideLength+=1;
            }
            for(int i=0;i<sideLength;i++){
                System.out.print(oriChar.charAt(i));
                for(int j =0;j<bottomLength;j++){
                    System.out.print(" ");
                }
                System.out.println(oriChar.charAt(oriChar.length()-1-i));
            }
            System.out.println(oriChar.substring(sideLength,sideLength+bottomLength+2));
        }
    }
}
