package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/18.
 * 最难的问题 the most difficult question
 * 我觉得读懂题目才是最难的
 */
public class item1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String sentence = sc.nextLine();
            for(int i =0;i<sentence.length();i++){
                if((int)sentence.charAt(i)==32){//空格
                    System.out.print(" ");
                }else{
                    if(sentence.charAt(i)>=70){
                        System.out.print((char)(sentence.charAt(i)-5));
                    }else{
                        System.out.print((char)(sentence.charAt(i)%65+86));
                    }
                }
            }
            System.out.println();
        }
    }
}
