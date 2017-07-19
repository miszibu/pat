package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/17.
 * NowCoder数列 直接用数组内存超限 我换一种思路做
 */
public class item1002 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int[] F = new int[1000001];
        F[0]=7;
        F[1]=1;
        for (int i =2;i<1000001;i++){
            F[i]=(F[i-1]+F[i-2])%10;
        }
        while(keyBoard.hasNext()){
            int index = keyBoard.nextInt();
            if(index==0){
                System.out.println("No");
            }else{
                if(F[index]%3==2){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }

    }
}
