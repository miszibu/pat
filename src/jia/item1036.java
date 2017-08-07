/*
package jia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

*/
/**
 * Created by zibu on 2017/8/5.
 * Student List for Course 第一遍 3个内存超出限制 第一个遇到 数据结构开太多了
 * A中用新的结构来完成
 *//*

public class item1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//<=40000
        int K = sc.nextInt();//<=2500
        //String[] studends = new String[N];
        ArrayList<String> studends = new ArrayList<String>();
        String[] courseStudents = new String[K + 1];
        for (int i = 1; i < K + 1; i++) {
            courseStudents[i] = "";
        }
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int temp = sc.nextInt();
            for (int j = 0; j < temp; j++) {
                courseStudents[sc.nextInt()] += " " + name;
            }
        }
        for (int i = 1; i < K + 1; i++) {
            String[] students = courseStudents[i].split(" ");
            System.out.println(i + " " + (students.length-1));
            //System.out.print(students[0]+" ");
            //System.out.println(courseStudents[i]);
            ArrayList<String> sortedStudent = new ArrayList<String>();
            for (int j = 1; j < students.length; j++) {
                sortedStudent.add(students[j]);
                //System.out.print(students[j]+" ");
            }
            Collections.sort(sortedStudent,new myComparator());
            for (int j = 0; j < sortedStudent.size(); j++) {
                System.out.println(sortedStudent.get(j));
            }
        }
    }
    public static class myComparator implements Comparator{
        public int compare(Object o1, Object o2) {
            for (int i=0;i<4;i++){
                if (o1.toString().charAt(i)>o2.toString().charAt(i))
                    return 1;
                else if (o1.toString().charAt(i)<o2.toString().charAt(i))
                    return -1;
            }
            return 0;
        }
    }
}
*/
