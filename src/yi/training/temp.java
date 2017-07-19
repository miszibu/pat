package yi.training;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/17.
 */
public class temp {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        //char[] chars = sc.nextLine().toCharArray();
        while(keyBoard.hasNextLine()){
            String fraction1 = keyBoard.next();
            String fraction2 = keyBoard.next();
            String operation = keyBoard.next();
            int x1=0,y1=0,x2=0,y2=0;
            System.out.println(fraction1);
            String temp="";
            for(int i =0;i<fraction1.length();i++){
                char tempChar = fraction1.charAt(i);
                if(tempChar=='/'){
                    System.out.println(temp);

                    x1= Integer.parseInt(temp);
                    y1= Integer.parseInt(temp.substring(i,fraction1.length()));
                    break;
                }else{
                    temp+=tempChar;
                }
            }
            System.out.println(x1+" "+y1);
        }

    }
    /*减法运算*/
    public static void subraction(){

    }
    /*加法运算*/
    public static void addition(){

    }
    /*乘法运算*/
    public static void multiplication(){

    }
    /*除法运算*/
    public static void division(){

    }
}