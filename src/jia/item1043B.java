package jia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/7.
 * The Dominant Color
 * 没注意题目要素里面有一个 dominant 占据一半
 * 知道这个信息就其实很好做了
 */
public class item1043B {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt() * sc.nextInt();
        int[] num = new int[maxNum];
        for (int i=0;i<maxNum;i++)
            num[i] = sc.nextInt();
        Arrays.sort(num);
        System.out.println(num[(maxNum-1)/2]);
    }
}
