package yi.training;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/22.
 * 人口普查 census
 * 因为每年多少天不重要 所以直接把日期换成天 来比较
 */
public class item1018True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int maxDay=0, maxIndex=1, minDay=0, minIndex=1 , vaildNum = 0;
            man[] mans = new man[num];
            for (int i = 0; i < num; i++) {
                mans[i] = new man();
                mans[i].name = sc.next();
                String[] birthday = sc.next().split("/");
                mans[i].year = Integer.parseInt(birthday[0]);
                mans[i].month = Integer.parseInt(birthday[1]);
                mans[i].day = Integer.parseInt(birthday[2]);
                mans[i].setTotalDay();
            }
            for (int i = 0; i < num; i++) {
                if(mans[i].isVaild==true && vaildNum==0) {
                    maxDay=minDay=mans[i].totalDay;
                    maxIndex=minIndex=i;
                }
                if(mans[i].isVaild==true){
                    vaildNum++;
                }
            }

            for (int j =minIndex+1;j<num;j++){
                if(mans[j].isVaild){
                    if(mans[j].totalDay<minDay ){
                        minIndex=j;
                        minDay=mans[j].totalDay;
                    }else if(mans[j].totalDay>maxDay){
                        maxIndex=j;
                        maxDay=mans[j].totalDay;
                    }
                }

            }
            System.out.println(vaildNum+" "+mans[maxIndex].name+" "+mans[minIndex].name);
        }
    }
}
class man{
    String name;
    int year;
    int month;
    int day;
    int totalDay;
    boolean isVaild;
    void setTotalDay(){
        this.totalDay=(2014-year)*360 + (9-month)*30+(6-day);
        if(totalDay>72000||totalDay<0){
            isVaild=false;
        }else{
            isVaild=true;
        }
    }
}
