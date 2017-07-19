package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 选大王 choose king
 * 利用人类的思维 来写了个判断逻辑 然而 运行超时
 * 百度后 发现公式法 约瑟夫问题
 */
public class item1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int monNum = sc.nextInt();
            int num = sc.nextInt();
            int restMonNum = monNum;//还剩下的猴子数量
            int index = 1;
            int currentNum = 1;
            boolean[] monChoose = new boolean[monNum+1];
            for (int i =1;i<=monNum;i++){//猴子数组初始化 默认都在
                monChoose[i] = true;
            }
            while(restMonNum>1){
                if(monChoose[index]){//猴子还在吗
                    if(currentNum==num ){
                        monChoose[index]=false;
                        restMonNum--;
                        currentNum=1;
                    }else{
                        currentNum++;
                    }
                }
                if(++index>monNum){
                    index =1;
                }
            }
            for(int i=0;i<monNum;i++){
                if(monChoose[i+1]){
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}
