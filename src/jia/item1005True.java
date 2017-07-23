package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/23.
 */
public class item1005True {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int totalNum = sc.nextInt();
        int withChildNum = sc.nextInt();
        int[] nodeGeneration = new int[totalNum];
        int[][] tree = new int[withChildNum][];

        for(int i =0;i<withChildNum;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] temp = new int[b+2];
            temp[0]=a;
            temp[1]=b;
            for(int j =2;j<b+2;j++){
                temp[j]=sc.nextInt();
            }
            tree[i]=temp;
        }
        for(int i = 0;i<totalNum;i++){
            nodeGeneration[i]=findGeneration(i+1,0,tree);
        }
        int[] temp=new int[100];
        for(int j=0;j<100;j++){
            temp[j]=0;
            for (int i=0;i<totalNum;i++){
                if(nodeGeneration[i]==j){
                    temp[j]++;
                }
            }
        }
        int max = 0;
        int index=0;
        for(int j=0;j<100;j++){
            if(temp[j]>max){
                max = temp[j];
                index=j;
            }
        }
        System.out.println(max+" "+index);

    }
    public static int findGeneration(int node,int gengeration,int[][] tree){
        for (int i=0;i<tree.length;i++){
            for (int j=2;j<tree[i].length;j++){
                if(tree[i][j]==node){
                    return findGeneration(tree[i][0],gengeration+1,tree);
                }
            }
        }
        return gengeration+1;
    }
}
