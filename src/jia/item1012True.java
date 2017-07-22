package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/22.
 * Kuchiguse 字符串尾巴的判断
 */
public class item1012True {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            sc.nextLine();
            StringBuilder[] senList=new StringBuilder[num];
            StringBuilder Kuchiguse =new StringBuilder("");
            System.out.println(1);
            for (int i=0;i<num;i++){
                senList[i]=new StringBuilder(sc.nextLine());
                System.out.println(i);
            }
            boolean isEnd = true;
            int index = senList[0].length()-1;
            while(isEnd){
                Kuchiguse.insert(0,senList[0].charAt(index));
                for(int i =0;i<num;i++){
                    if(senList[i].lastIndexOf(Kuchiguse.toString())==-1) {
                        isEnd=false;
                        break;
                    }
                }
                index--;
                if(index==-1){
                    break;
                }
            }
            Kuchiguse.deleteCharAt(0);
            if(Kuchiguse.length()==0){
                System.out.print("nai");
            }else{
                System.out.print(Kuchiguse.toString());
            }
        }
    }
}
