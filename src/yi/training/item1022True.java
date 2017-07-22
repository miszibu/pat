package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/22.
 * 挖掘机技术哪家强 Which school is proficient in excavator Technology
 */
public class item1022True {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int claimerNum = sc.nextInt();
            int index = 0;
            int[] schoolTotalScore = new  int[100001];
            for (int i =1;i<100001;i++){
                schoolTotalScore[i]=0;
            }
            for (int i =1;i<claimerNum+1;i++){
                schoolTotalScore[sc.nextInt()]+=sc.nextInt();
            }
            index = 1;
            int maxValue = schoolTotalScore[1];
            for (int i =2;i<100001;i++){
                if(schoolTotalScore[i]>maxValue){
                    maxValue=schoolTotalScore[i];
                    index = i;
                }
            }
            System.out.println(index+" "+schoolTotalScore[index]);

        }
    }
}
