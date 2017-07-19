package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/17.
 * 斐波那契凤尾Fibonacci
 * long 不够100000的fibonacci
 * 本来想直接写个string 加的后来 忽然一想 不是只要后6位吗 就直接这样解了
 */
public class item1005 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        long[] fibonacci = new long[1000001];
        fibonacci[1]=1;
        fibonacci[2]=2;
        for(int i =3;i<100001;i++){
            fibonacci[i]=(fibonacci[i-1]+fibonacci[i-2])%1000000;
        }
        while(keyBoard.hasNext()){
            int index = keyBoard.nextInt();
            if (index > 25) {
                int zero = 6 - String.valueOf(fibonacci[index]).length();
                while (zero-- > 0){
                    System.out.print("0");
                }
            }
            System.out.println(fibonacci[index]);
        }
    }
}

