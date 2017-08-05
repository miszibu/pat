package yi.training;

import java.util.*;

public class Main{
    public static int getMax(String str,int nowAt){
        int max=1;
        if(nowAt-1>=0){
            int low=nowAt-1,high=nowAt+1;
            while(low>=0&&high<str.length()&&str.charAt(low)==str.charAt(high)){
                low--;
                high++;
            }
            int temp=high-low+1-2;
            if(temp>max)
                max=temp;

            if(str.charAt(nowAt-1)==str.charAt(nowAt)){
                low=nowAt-1;
                high=nowAt;
                while(low>=0&&high<str.length()&&str.charAt(low)==str.charAt(high)){
                    low--;
                    high++;
                }
                temp=high-low+1-2;
                if(temp>max)
                    max=temp;
            }
        }
        if(nowAt+1<str.length()){
            int low=nowAt,high=nowAt+1;
            while(low>=0&&high<str.length()&&str.charAt(low)==str.charAt(high)){
                low--;
                high++;
            }
            int temp=high-low+1-2;
            if(temp>max)
                max=temp;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String check=sc.nextLine();
            int max=Integer.MIN_VALUE;
            for(int idx=0;idx<check.length();idx++){
                int temp=getMax(check,idx);
                if(temp>max){
                    max=temp;
                    int a = (max-1)/2;
                    for (int j =idx-a;j<idx+a;j++)
                        System.out.print(check.charAt(j));
                    System.out.println();
                }
            }
            System.out.println(max);
        }
    }
}
