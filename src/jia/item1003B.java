package jia;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/2.
 * 一个正确 一个错误 其余超时
 * 深搜 我真是日了狗了 我都这样剪枝了 还tm超时 傻逼吧
 */
public class item1003B {
    static int N ;// the total number of the members in the supply chain
    static double P;// the price given by the root supplier
    static double r;//the percentage rate of price increment for each distributor or retailer
    static ArrayList<node> suppliers =new ArrayList<node>();
    static int[] height ;
    static int maxNum=0;
    static int maxStep=0;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        P = sc.nextDouble();
        r = sc.nextDouble();
        int root=0;
        height = new int[N];
        for (int i =0;i<N;i++){
            height[i]=-1;
            int temp =sc.nextInt();
            suppliers.add(new node(i,temp));
            if (temp==-1){
                root=i;
                height[i]=0;
            }

        }
        DecimalFormat decimalFormat=(DecimalFormat) DecimalFormat.getInstance();
        String pattern="#.00";
        decimalFormat.applyPattern(pattern);
        search(root,0);
        //out:highest price:the number of retailers that sell at the highest price
        for (int i =0;i<N;i++) {
            if(height[i]>maxStep){
                maxStep=height[i];
                maxNum=1;
            }else if(height[i]==maxStep){
                maxNum++;
            }
        }
        for (int i =0;i<maxStep;i++){
            P*=(100+r)/100;
        }
        System.out.println(decimalFormat.format(P)+" "+maxNum);
    }
    public static void search(int father,int length){
        for(int i =0;i<suppliers.size();i++){
            if(suppliers.get(i).father==father &&suppliers.get(i).father!=-1 ){
                int curIndex=suppliers.get(i).index;
                height[curIndex]=length+1;
                search(curIndex,length+1);
                for (int j =0;j<suppliers.size();j++) {
                    if(suppliers.get(j).index==curIndex){
                        suppliers.remove(j);
                        break;
                    }
                }
              /*  for (int j =0;j<suppliers.size();j++)
                    System.out.print(suppliers.get(j).index);
                System.out.println();*/
                i--;
            }
        }

    }
    public static class node{
        int index;
        int father;
        node(int index,int father){
            this.index = index;
            this.father = father;
        }
    }
}
