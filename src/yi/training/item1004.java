package yi.training;
import java.util.Scanner;
/**
 * Created by zibu on 2017/7/17.
 */
/*
客似云来 many guests gatherd
同1003吧 难度不大 就第三天新增的客人 是前两天的就餐人数
* */
public class item1004 {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        long[] guest= new long[81];
        int beginDay;
        int endDay;
        long breakfastSales;
        guest[1] = 1 ;
        guest[2] = 1 ;
        for(int i=3;i<81;i++){
            guest[i]=guest[i-1]+guest[i-2];
        }
        while(keyBoard.hasNext()){
            breakfastSales = 0;
            beginDay = keyBoard.nextInt();
            endDay = keyBoard.nextInt();
            for(int i =beginDay;i<=endDay;i++){
                breakfastSales+=guest[i];
            }
            System.out.println(breakfastSales);
        }
        keyBoard.close();
    }
}
