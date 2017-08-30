package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/30.
 * Scientific Notation 科学计数转换
 * 细心读题 多种情况分析
 */
public class item1056True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sciNotation = new StringBuffer(sc.next());
        StringBuffer val = new StringBuffer(sciNotation.substring(1,sciNotation.indexOf("E")));

        //val.deleteCharAt(1);// the point may be changed
        int suffix  = Integer.parseInt(sciNotation.substring(sciNotation.indexOf("E")+1));

        if(sciNotation.charAt(0)!='+'){//judge positive prefix
            System.out.print('-');
        }
        val.deleteCharAt(1);
        if(suffix>0){
            if(val.length()-2>=suffix){//move point position
                val.insert(suffix+1,".");
            }else{//append zero
                while(suffix-val.length()>-1){
                    val.append("0");
                }
            }
        }else{
            String temp = "0.";
            for (int i =0;i<Math.abs(suffix)-1;i++)
                temp+="0";
            val.insert(0,temp);
        }
        System.out.println(val);
        System.out.println(suffix);
    }
}
