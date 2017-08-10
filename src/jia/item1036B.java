package jia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/5.
 * Student List for Course 傻逼题目 把别人通过的放进去也超时 玩个皮皮？
 */
public class item1036B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//<=40000
        int K = sc.nextInt();//<=2500
        ArrayList<String> studends = new ArrayList<String>();
        String[] courseStudents = new String[K + 1];
//        for (int i = 1; i < K + 1; i++) {
//            courseStudents[i] = "";
//        }
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            studends.add(name);
            int temp = sc.nextInt();
            for (int j = 0; j < temp; j++) {
                courseStudents[sc.nextInt()]+=name;
            }
        }
        Collections.sort(studends);

        for (int i = 1; i < K + 1; i++) {
            int length =courseStudents[i].length()/4;
            System.out.println(i + " " + (length-1));
            //System.out.println(courseStudents[i]);
            for(int k=0;k<studends.size();k++){
                for (int j = 1; j < length; j++) {
                    //System.out.println(courseStudents[i].substring(j*4,4*(j+1)));
                    if(studends.get(k).toString().equals(courseStudents[i].substring(j*4,4*(j+1)))){
                        System.out.println(studends.get(k));
                        break;
                    }
                }
            }

        }
    }

}
