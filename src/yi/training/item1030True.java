package yi.training;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/19.
 * 有几个PAT（25） how many pat
 * 写了个３层ｆｏｒ循环　ｎ３次方
 * 效率太低 倒叙的n好太多
 */
public class item1030True {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence ;
        while(sc.hasNext()){
            sentence =sc.next();
            int mod=1000000007;
            int t=0;
            int at=0;
            int pat=0;
            for(int i =sentence.length()-1;i>=0;i--){
                if(sentence.charAt(i)=='T'){
                    t++;
                }else if(sentence.charAt(i)=='A'){
                    at+=t;
                }else{
                    pat=(pat+at)%mod;
                }
            }
            System.out.println(pat%mod);
        }
    }
}
