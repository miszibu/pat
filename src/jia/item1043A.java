package jia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/7.
 * The Dominant Color 一个运行超时
 */
public class item1043A {
    public static void main(String [] args){
        ArrayList<node> num = new ArrayList<node>();
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt() * sc.nextInt();
        int max = 0;
        int index=0;
        for (int i=0;i<maxNum;i++){
            int temp = sc.nextInt();
            boolean isExist =false;
            for (int j=0;j<num.size();j++){
                if (num.get(j).value==temp){
                    num.get(j).num+=1;
                    if (num.get(j).num>max)
                    {
                        max = num.get(j).num;
                        index = j;
                    }
                    isExist = true;
                    break;
                }
            }
            if (!isExist)
                num.add(new node(temp));
        }
        System.out.println(num.get(index).value);
    }
    static class node{
        int num;
        int value;
        node(int value){
            this.value=value;
            this.num =1;
        }
    }
}
