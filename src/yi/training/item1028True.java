package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/19.
 * 统计同成绩学生(20) 逻辑题目
 */
public class item1028True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int gradeNum = sc.nextInt();
            int[] gradeList = new int[gradeNum];
            for(int i =0;i<gradeNum;i++){
                gradeList[i]=sc.nextInt();
            }
            int searchNum = sc.nextInt();
            int[] searchList = new int[searchNum];
            for (int i = 0;i<searchNum;i++){
                searchList[i]=sc.nextInt();
            }
           String out ="";
            for (int i = 0;i<searchNum;i++){
                int num = 0;
                for (int j = 0;j<gradeNum;j++) {
                    if(gradeList[j]==searchList[i]){
                        num++;
                    }
                }
                if(i==searchNum-1){
                    out+=num;
                }else{
                    out+=num+" ";
                }
            }
            System.out.println(out);
        }

    }
}
