package yi.training;
import java.util.Scanner;
/**
 * Created by zibu on 2017/7/17.
 * cow's story 母牛的故事
 * 跟1004差不多 稍微变化一下
 */
public class item1007 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        long[] quantity= new long[56];
        quantity[1] = 1 ;
        quantity[2] = 2 ;
        quantity[3] = 3 ;
        quantity[4] = 4 ;
        for(int i=5;i<56;i++){
            quantity[i]=quantity[i-1]+quantity[i-3];
        }
        while(keyBoard.hasNext()){
            System.out.println(quantity[keyBoard.nextInt()]);
        }
        keyBoard.close();
    }
}
