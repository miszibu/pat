package jia;

import java.util.Scanner;

/**
 * Created by zibu on 2017/7/28.
 * Graduate Admission
 * 排序->候选人->补漏->输出重新排序
 */
public class item1015True {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int studentNum = sc.nextInt();
            int schoolNum = sc.nextInt();
            int candidateSchoolNum = sc.nextInt();
            int[] schoolAdmit = new int[schoolNum];
            String[] schoolAdmitOut = new String[schoolNum];
            for (int i = 0; i < schoolNum; i++) {
                schoolAdmit[i] = sc.nextInt();
                schoolAdmitOut[i] = "";
            }
            int[][] student = new int[studentNum][];
            int[][] oriStudent = new int[studentNum][];
            for (int i = 0; i < studentNum; i++) {
                int[] temp = new int[2 + candidateSchoolNum + 2];
                for (int j = 0; j < 2 + candidateSchoolNum; j++) {
                    temp[j] = sc.nextInt();
                }
                temp[2 + candidateSchoolNum] = i;//原顺序位
                temp[2 + candidateSchoolNum + 1] = 0;//录取标志位
                student[i] = temp;
                oriStudent[i]=temp;
            }
            //pop sort
            for (int i = 0; i < studentNum - 1; i++) {
                for (int j = 0; j < studentNum - i - 1; j++) {
                    if ((student[j][0] + student[j][1]) < (student[j + 1][0] + student[j + 1][1])) {
                        int[] temp;
                        temp = student[j + 1];
                        student[j + 1] = student[j];
                        student[j] = temp;
                    }else if(((student[j][0] + student[j][1]) == (student[j + 1][0] + student[j + 1][1])) && student[j + 1][0]>student[j][0]){
                        int[] temp;
                        temp = student[j + 1];
                        student[j + 1] = student[j];
                        student[j] = temp;
                    }
                }
            }

            //admit candidate
            for (int i = 0; i < studentNum; i++) {
                for (int j = 2; j < 2 + candidateSchoolNum; j++) {
                    if (schoolAdmit[student[i][j]] > 0) {//判断是否还有余额
                        if (schoolAdmitOut[student[i][j]].equals("")) {//the first one
                            schoolAdmitOut[student[i][j]] += student[i][2 + candidateSchoolNum];
                        } else {
                            schoolAdmitOut[student[i][j]] += " " + student[i][2 + candidateSchoolNum];
                        }
                        student[i][2 + candidateSchoolNum + 1] = 1;
                        schoolAdmit[student[i][j]]--;
                        break;
                    }
                }
            }
//            for (int i = 0; i < schoolNum; i++) {//output resort cautious empty int array
//                System.out.println(schoolAdmitOut[i]);
//            }
            for (int i = 0; i < schoolNum; i++) {//同分学员补漏
                String[] schoolStudent = schoolAdmitOut[i].split(" ");
                for (int j = 0; j < schoolStudent.length; j++) {
                    if (schoolStudent[j].equals("")) {
                        continue;
                    } else {
                        int temp = Integer.parseInt(schoolStudent[j]);
                        for (int k = 0; k < studentNum; k++) {
                            if (student[k][0] == oriStudent[temp][0] && student[k][1] == oriStudent[temp][1] && student[k][2 + candidateSchoolNum + 1] == 0) {
                                Boolean isSameSchool = false;
                                for(int z=0;z<candidateSchoolNum;z++){
                                    if(student[k][2+z]==i){
                                        isSameSchool=true;
                                        break;
                                    }
                                }
                                if (isSameSchool){
                                    schoolAdmitOut[i] += " " +student[k][2+candidateSchoolNum] ;
                                }
                            }
                        }
                    }
                }
            }
            /*for(int i =0;i<studentNum;i++) {
                for(int j=0;j<2+candidateSchoolNum+2;j++){
                    System.out.print(student[i][j]+" ");
                }
                System.out.println();
            }
            for (int i = 0; i < schoolNum; i++) {//output resort cautious empty int array
               System.out.println(schoolAdmitOut[i]);
            }*/
            for (int i = 0; i < schoolNum; i++) {//output resort cautious empty int array
                String[] temp = schoolAdmitOut[i].split(" ");
                int[] tempInt = new int[temp.length];
                for (int j = 0; j < temp.length; j++) {
                    if (temp[j].equals("")) {
                        tempInt[j] = -1;
                        continue;
                    } else {
                        tempInt[j] = Integer.parseInt(temp[j]);
                        //System.out.print(tempInt[j]);
                    }
                }
                for (int j = 0; j < tempInt.length - 1; j++) {//pop sort
                    for (int k = 0; k < tempInt.length - j - 1; k++) {
                        if (tempInt[k] > tempInt[k + 1]) {
                            int a = tempInt[k + 1];
                            tempInt[k + 1] = tempInt[k];
                            tempInt[k] = a;
                        }
                    }
                }
                if (tempInt[0] == -1) {
                    schoolAdmitOut[i] = "";
                } else {
                    schoolAdmitOut[i] = "" + tempInt[0];
                    for (int j = 1; j < tempInt.length; j++) {
                        schoolAdmitOut[i] += " " + tempInt[j];
                    }
                }

            }
            for (int i = 0; i < schoolNum; i++) {
                System.out.println(schoolAdmitOut[i]);
            }
        }
    }
}
