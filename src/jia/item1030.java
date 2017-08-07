package jia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/5.
 * Be Unique   创建ArrayList然后删除重复节点
 * 时间复杂度log(n2) 一个超出时间
 *
 */
public class item1030 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//<=100000
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        for (int i=0;i<arr.size();i++){
            boolean isExist= false;
            for (int j =i+1;j<arr.size();j++){
                if (arr.get(i).intValue()==arr.get(j).intValue()){
                    isExist=true;
                    arr.remove(j);
                    j--;
                }
            }
            if (isExist){
                arr.remove(i);
                i--;
            }
        }
        if (arr.size()==0)
            System.out.println("None");
        else
            System.out.println(arr.get(0));

    }
}
