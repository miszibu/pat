package jia;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/30.
 * Complete Binary Search Tree 完全二叉搜索树 数组存放实现
 * */
public class item1022True {
    static int n;
    static int[] vals;
    static int[] out;
    static int index = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        vals =  new int[n];
        out = new int[n];
        for(int i =0;i<n;i++){
            vals[i]=sc.nextInt();
        }
        Arrays.sort(vals);
        BST(0);
        System.out.print(out[0]);
        for(int i =1;i<n;i++){
            System.out.print(" "+out[i]);
        }
    }
    public static void BST(int i){
        if(i>=n)
            return;
        BST(i*2+1);
        out[i]=vals[index++];
        BST(i*2+2);
    }
}
