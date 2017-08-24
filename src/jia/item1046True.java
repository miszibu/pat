package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/30.
 * Sharing (25) to  find the same suffix
 * 这个暴力写的比较复杂 而且有两个案例没通过
 */
public class item1046True {
    static  int num ;
    static int[] begin ;
    static String[] value ;
    static int[] end ;
    static int temp = 0;
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String aSen;
        String bSen;
        num = sc.nextInt();
        begin = new int[num];
        value = new String[num];
        end = new int[num];
        for (int i = 0; i < num; i++) {
            begin[i] = sc.nextInt();
            value[i] = sc.next();
            end[i] = sc.nextInt();
        }
        aSen = generateString(a, "");
        bSen = generateString(b, "");
        int shorterLen = aSen.length() > bSen.length() ? bSen.length() : aSen.length();
        int differIndex = -1;
        for (int i = 1; i < shorterLen + 1; i++) {
            if (aSen.charAt(aSen.length() - i) != bSen.charAt(bSen.length() - i)) {
                differIndex = i;
                break;
            }
        }
//        System.out.println(aSen);
//        System.out.println(bSen);
//        System.out.println(differIndex);
        if(differIndex==-1){
            System.out.println(-1);
        }else {
            ourcomePrient(a,aSen.length()-differIndex);

//            for (int i = 0; i < num; i++) {
//                if (value[i].equals(""+aSen.charAt(aSen.length()-differIndex+1))) {
//                    System.out.println(begin[i]);
//                    break;
//                }
//            }
        }

    }
    public static void ourcomePrient(int first,int index){
        for(int i =0;i<num;i++){
            if(begin[i]==first){
               if(index == temp-1){
                   System.out.println(begin[i]);
                    break;
               }else{
                   temp++;
                   ourcomePrient(end[i],index);
               }
            }
        }
    }
    public static String generateString(int first,String temp){
        String a ="";
        for(int i =0;i<num;i++){
            if(begin[i]==first){
                temp+=value[i];
                if(end[i]==-1)
                    return temp;
                else
                    a=generateString(end[i],temp);
                break;
            }
        }
        return a;
    }
}
