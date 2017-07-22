package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/22.
 * 旧键盘打字(20) old keyboard typing
 * 注意：deletecharat的时候 每次for循环都会减少length
 */
public class item1023True {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            StringBuilder brokenKeys = new StringBuilder(sc.next());
            StringBuilder deleteString = new StringBuilder();
            StringBuilder outputString = new StringBuilder(sc.next());
            for(int i =0;i<brokenKeys.length();i++){
                if (brokenKeys.charAt(i)=='+'){//删除大写字母
                    deleteString.append("QWERTYUIOPLKJHGFDSAZXCVBNM");
                }else {
                    if(Character.isLowerCase(brokenKeys.charAt(i))){
                        deleteString.append((char)(brokenKeys.charAt(i)-32));
                    }else if(Character.isUpperCase(brokenKeys.charAt(i))){
                        deleteString.append((char)(brokenKeys.charAt(i)+32));
                    }
                    deleteString.append(brokenKeys.charAt(i));
                }
            }
            for(int i =0;i<deleteString.length();i++){
                for(int j =0;j<outputString.length();j++){
                    if(deleteString.charAt(i)==outputString.charAt(j)){
                        outputString.deleteCharAt(j--);
                    }
                }
            }System.out.println(outputString);
        }
    }
}
