package jia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zibu on 2017/8/2.
 * All Roads Lead to Rome 条条大路通罗马
 * 最小cost的路径数量 cost happiness average happiness()
 */
public class item1002True {
    /*输入数据*/
    static int N;//city num
    static int K;//route num
    static String startCity;
    static String[] citys;
    static int[] happiness;
    /*自定义变量*/
    static int routeNum = 0;
    static int curCost = 0;
    static int minCost = Integer.MAX_VALUE;
    static int curHappiness = 0;
    static int minHappiness = Integer.MIN_VALUE;
    public static ArrayList<Integer> curPath = new ArrayList<Integer>();
    public static ArrayList<Integer> minPath = new ArrayList<Integer>();
    static int[][] map;
    static boolean[] cityStatus;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        startCity = sc.next();
        citys = new String[N];
        citys[0] = startCity;
        happiness = new int[N];
        happiness[0] = 0;
        cityStatus = new boolean[N];
        for (int i = 1; i < N; i++) {
            citys[i] = sc.next();
            happiness[i] = sc.nextInt();
        }
        map = new int[N][N];
        for (int i = 0; i < K; i++) {//创建邻接矩阵
            int a = findIndex(sc.next());
            int b = findIndex(sc.next());
            int c = sc.nextInt();
            map[a][b] = c;
            map[b][a] = c;
        }
        dfs(0, findIndex("ROM"));
        /*数据输出*/
        System.out.println(routeNum+" "+minCost+" "+minHappiness+" "+minHappiness/minPath.size());
        System.out.print(startCity);
        for (int i : minPath){
            System.out.print("->"+findName(i));
        }
    }

    public static int findIndex(String temp) {
        for (int i = 0; i < N; i++)
            if (citys[i].equals(temp))
                return i;
        return 0;
    }

    public static String findName(int index) {
        for (int i = 1; i < N; i++)
            if (i==index)
                return citys[i];
        return "";
    }

    public static void dfs(int begin, int end) {
        if (begin == end) {//到达终点
            routeNum++;
            if (minCost == Integer.MAX_VALUE) {//若为首次进入
                changeMin();
            } else {
                if (curCost < minCost) {
                    changeMin();
                } else if (curCost == minCost) {
                    if (curHappiness > minHappiness)
                        changeMin();
                    else if (curHappiness == minHappiness) {
                        if ((double)(curHappiness / curPath.size()) >(double)( minHappiness / minPath.size()))
                            changeMin();
                    }
                }
            }
        }
        for (int i = 1; i < N; i++) {
            if (!cityStatus[i]&&map[begin][i]!=0){//该城市未被访问 且 存在道路
                cityStatus[i]=true;
                curPath.add(i);
                curCost += map[begin][i];
                curHappiness+=happiness[i];
                dfs(i,end);
                curPath.remove(curPath.size()-1);
                curCost -= map[begin][i];
                curHappiness-=happiness[i];
                cityStatus[i]=false;
            }
        }
    }

    public static void changeMin() {
        minCost = curCost;
        minHappiness = curHappiness;
        minPath = new ArrayList<Integer>(curPath);
    }
}
