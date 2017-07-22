package yi.training;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by zibu on 2017/7/22.
 */
public class item1010True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        while (sc.hasNext()) {
            double revenue=0;
            int cakeTypeNum = sc.nextInt();
            int marketWanted = sc.nextInt();
            moonCake[] moonCakes = new moonCake[cakeTypeNum];
            for(int i =0;i<cakeTypeNum;i++){
                moonCakes[i] = new moonCake();
                moonCakes[i].weight=sc.nextInt() ;
            }
            for(int i =0;i<cakeTypeNum;i++){
                moonCakes[i].price = sc.nextInt();
            }
            for(int i =0;i<cakeTypeNum;i++){
                moonCakes[i].averagePrice= (float)moonCakes[i].price/moonCakes[i].weight;
            }
            for(int i =0;i<cakeTypeNum-1;i++){
                for(int j =i;j<cakeTypeNum-1;j++){
                    if(moonCakes[j].averagePrice<moonCakes[j+1].averagePrice){
                        moonCake temp ;
                        temp = moonCakes[j+1];
                        moonCakes[j+1] =moonCakes[j];
                        moonCakes[j] = temp;
                    }
                }
            }
//            for(int i =0;i<cakeTypeNum;i++){
//                System.out.println(moonCakes[i].weight + " "+moonCakes[i].price+" "+moonCakes[i].averagePrice);
//            }
            int i =0;
            while(marketWanted>0){
                if(marketWanted>moonCakes[i].weight){
                    revenue+=moonCakes[i].price;
                    marketWanted-=moonCakes[i].weight;
                    i++;
                }else{
                    revenue+=marketWanted*moonCakes[i].averagePrice;
                    break;
                }
            }
            System.out.println(df.format(revenue));
        }
    }

}
class moonCake{
    public int weight;
    public int price;
    public double averagePrice;
}

