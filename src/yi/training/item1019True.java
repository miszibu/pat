package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/22.
 * 旧键盘 old keyboard
 * 注意字符串超限 问题 应该小的去匹配大的 会更好
 */
public class item1019True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder wantedString = new StringBuilder(sc.next());
            StringBuilder realityString = new StringBuilder(sc.next());
            StringBuilder outputString = new StringBuilder();
            int j=0;
            for(int index=0;index<wantedString.length();index++){
                if(j<realityString.length()){//超限 不存在
                    if(wantedString.charAt(index)==realityString.charAt(j)){//若存在
                        j++;
                    }else{
                        outputString.append(Character.toUpperCase(wantedString.charAt(index)));
                    }
                }else{
                    outputString.append(Character.toUpperCase(wantedString.charAt(index)));
                }

            }
            for(int i = 0;i<outputString.length();i++){
                for(int k = i+1;k<outputString.length();k++){
                    if(outputString.charAt(i)==outputString.charAt(k)){
                        outputString.deleteCharAt(k--);
                    }
                }
            }
            System.out.println(outputString);
        }
    }
}
