//package jia;
//
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
///**
// * Created by zibu on 2017/8/2.
// * 三个正确 其余超时
// * 深搜 一次剪枝
// */
//public class item1003A {
//    static int N ;// the total number of the members in the supply chain
//    static double P;// the price given by the root supplier
//    static double r;//the percentage rate of price increment for each distributor or retailer
//    static int[] suppliers ;
//    static int[] height ;
//    static int maxNum=0;
//    static int maxStep=0;
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        N = sc.nextInt();
//        P = sc.nextDouble();
//        r = sc.nextDouble();
//        int root=0;
//        suppliers = new int[N];
//        height = new int[N];
//        for (int i =0;i<N;i++){
//            height[i]=-1;
//            suppliers[i]=sc.nextInt();
//            if (suppliers[i]==-1){
//                root=i;
//                height[i]=0;
//            }
//        }
//        DecimalFormat decimalFormat=(DecimalFormat) DecimalFormat.getInstance();
//        String pattern="#.00";
//        decimalFormat.applyPattern(pattern);
//        search(root,0);
//        //out:highest price:the number of retailers that sell at the highest price
//        for (int i =0;i<N;i++) {
//            if(height[i]>maxStep){
//                maxStep=height[i];
//                maxNum=1;
//            }else if(height[i]==maxStep){
//                maxNum++;
//            }
//        }
//         for (int i =0;i<maxStep;i++){
//            P*=(100+r)/100;
//        }
//        System.out.println(decimalFormat.format(P)+" "+maxNum);
//    }
//    public static void search(int father,int length){
//        for(int i =0;i<N;i++){
//            if(suppliers[i]==father){
//                height[i]=length+1;
//                search(i,length+1);
//            }
//        }
//
//    }
//}
