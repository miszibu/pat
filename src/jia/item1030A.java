package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/8/5.
 * 老方法了 创建一个数组存放个数 直接一遍过 方法很重要
 */
public class item1030A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//<=100000
        int[] arr= new int[N];
        int[] existNum= new int[10001];
        for (int i=0;i<N;i++){
            int temp = sc.nextInt();
            arr[i]=temp;
            existNum[temp]++;

        }
        boolean isExist =false;
        for (int i=0;i<N;i++){
            if (existNum[arr[i]]==1){
                System.out.println(arr[i]);
                isExist=true;
                break;
            }
        }
        if (!isExist)
            System.out.println("None");
    }
}
