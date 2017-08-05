package jia;


import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by zibu on 2017/7/29.
 * Public Bike Management
 * 这题 深搜来写 第一次写了俩个小时
 * 过程：邻接矩阵 是否访问变量 然后深搜开始 注意剪枝
 */
public class item1001True {
    static int capacity;    //标准容量 路过要设置为一半
    static int stationNum;  //节点个数
    static int errStaIndex;//pmbc is zero station form 1 to n
    static int roadNum;
    static int[] capSize;         //容量矩阵
    static int balance;
    static int[][] roadMap;        //邻接矩阵
    static boolean[] nodeStatus;  //访问状态矩阵
    static int curSend = 0;
    static int curBike = 0;
    static int curDistance = 0;
    static int minSend = Integer.MAX_VALUE;
    static int minTake = Integer.MAX_VALUE;
    static int minDistance = Integer.MAX_VALUE;
    static ArrayList<Integer> curPath = new ArrayList<Integer>();
    static ArrayList<Integer> minPath = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*数据读取*/
        capacity = sc.nextInt();
        balance = capacity / 2;
        stationNum = sc.nextInt();
        errStaIndex = sc.nextInt();
        roadNum = sc.nextInt();
        capSize = new int[stationNum + 1];
        nodeStatus = new boolean[stationNum + 1];
        capSize[0] = 0;
        for (int i = 0; i < stationNum; i++) {
            capSize[i + 1] = sc.nextInt();
        }
        roadMap = new int[roadNum + 1][roadNum + 1];//邻接矩阵
        for (int i = 0; i < roadNum; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            roadMap[a][b] = c;
            roadMap[b][a] = c;
        }
        dfs(0, errStaIndex);
        System.out.print(minSend + " 0");
        for (Integer i : minPath) {
            System.out.print("->" + i);
        }
        System.out.print(" " + minTake);
    }

    static public void changeValue() {
        minPath = new ArrayList<Integer>(curPath);//deep copy
        minDistance = curDistance;
        minSend = curSend;
        minTake = curBike;
    }

    static public void dfs(int begin, int end) {
        if (curDistance > minDistance) {//减枝
            return;
        }
        if (begin == end) {
            if (curDistance < minDistance) {
                changeValue();
            } else if (curDistance == minDistance) {
                if (curSend < minSend)
                    changeValue();
                else if (curSend == minSend) {
                    if (curBike < minTake)
                        changeValue();
                }
            }
        }
        for (int i = 1; i <= stationNum; i++) {
            if (!nodeStatus[i] && roadMap[i][begin] != 0) {//int未赋值为0 boolean未赋值为false
                nodeStatus[i] = true;
                curPath.add(i);

                int tempDistance = curDistance;
                int tempSend = curSend;
                int tempTake = curBike;
                curDistance += roadMap[i][begin];
                if (curBike + capSize[i] > balance) {//车多
                    curBike += capSize[i] - balance;
                } else {//车少
                    curSend += balance - capSize[i] - curBike;
                    curBike = 0;
                }
                dfs(i, end);
                curPath.remove(curPath.size() - 1);
                curDistance = tempDistance;
                curSend = tempSend;
                curBike = tempTake;
                nodeStatus[i] = false;
            }
        }
    }

}

