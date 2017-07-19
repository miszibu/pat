package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/19.
 * 到底买不买 to buy or not to buy .it's a question
 * 训练题里面也有一个类似的字符串你比较的题目
 * 那道题我是直接创建数组来做的 但考虑到数组内容过大 我这边就创建了一个数组来做
 * 我这边n2次方 复杂度 空间也更小
 * 妈个鸡 直接删除被用过的不就好了吗！ 还要个屁数组
 */
public class item1029True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            int withoutNum = 0;
            boolean[] aChoose = new boolean[a.length()];
            for(int i = 0 ;i<a.length();i++){
                aChoose[i] = false;
            }
            for(int i = 0 ;i<b.length();i++){
                boolean isExist = false;
                for(int j = 0 ;j<a.length();j++){
                    if(a.charAt(j)==b.charAt(i) && !aChoose[j]){
                        aChoose[j] = true;
                        isExist = true;
                        break;
                    }
                }
                if(!isExist){
                    withoutNum++;
                }
            }
            if(withoutNum==0){
                System.out.println("Yes "+(a.length()-b.length()));
            }else{
                System.out.println("No "+withoutNum);
            }
        }
    }
}
