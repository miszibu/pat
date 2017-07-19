package yi.training;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/17.
 * 星际密码 interplanetary password
 * 矩阵 花头很多 最后还是个斐波那契数列 连着四题 真的hin逗
 * 推理过程：
 * | A B | * | E F |    A(n)=1*A(N-1)+1*C(N-1)
 * | C D |   | G H |    c(n-1)=A(n-2) 所以A(n)=A(n-1)+A(n-2)
 */
public class item1006 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        int[] fibonacci = new int[10001];
        int length ;
        fibonacci[1]=1;
        fibonacci[2]=2;
        for(int i =3;i<10001;i++)
            fibonacci[i]=(fibonacci[i-1]+fibonacci[i-2])%10000;
        while(keyBoard.hasNext()){
            length = keyBoard.nextInt();
            for(int j=0;j<length;j++){
                int number = fibonacci[keyBoard.nextInt()];
                int zero = 4-String.valueOf(number).length();
                while(zero-->0){
                    System.out.print("0");
                }
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
