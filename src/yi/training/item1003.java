package yi.training;
import java.util.Scanner;
/*raise habit 养兔子*/
public class item1003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Long[] mature = new Long[91];
        mature[0]=1l;
        mature[1]=2l;
        for(int i =1;i<90;i++){
            mature[i+1]=mature[i]+mature[i-1];
        }
        while (scanner.hasNext()) {
            System.out.println(mature[scanner.nextInt()-1]);
        }
        scanner.close();
    }
}
/*
* 这道题难度不大 就是个斐波那契数列 但是就是会超出int范围
* long 的长度是够的 先这样解决吧 以后遇到更长的数字的要求的话 就用string
* long 的话数字后面需要加上L;
* */