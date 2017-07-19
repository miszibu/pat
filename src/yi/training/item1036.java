package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.3
 * HH 一遍过很开心 没什么难度 都是些业务逻辑
 Joe Math990112 89
 Mike CS991301 100
 Mary EE990830 95
 输出例子:
 Mike CS991301
 Joe Math990112
 */
public class item1036 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int length = sc.nextInt();
            int highestScore;
            int lowestScore;
            int highestIndex=0;
            int lowestIndex=0;
            String[] nameList = new String [length];
            String[] codeList = new String [length];
            int[] scoreList = new int [length];
            for(int i =0;i<length;i++){
                nameList[i] = sc.next();
                codeList[i] = sc.next();
                scoreList[i] = sc.nextInt();
            }
            highestScore = lowestScore =scoreList[0];
            for(int i =1;i<length;i++) {
                if(scoreList[i]>highestScore){
                    highestIndex = i;
                    highestScore = scoreList[i];
                }else if(scoreList[i]<lowestScore){
                    lowestIndex = i;
                    lowestScore = scoreList[i];
                }
            }
            System.out.println(nameList[highestIndex]+" "+codeList[highestIndex]);
            System.out.println(nameList[lowestIndex]+" "+codeList[lowestIndex]);
        }
    }
}
