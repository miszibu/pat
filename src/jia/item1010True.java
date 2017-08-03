package jia;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by zibu on 2017/7/29.
 */


public class item1010True {
    public static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder("");
        int nodeNum = sc.nextInt();
        Node[] nodes = new Node[nodeNum];
        int[] values = new int[nodeNum];
        for (int i = 0; i < nodeNum; i++) {
            nodes[i] = new Node(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < nodeNum; i++) {
            values[i] = sc.nextInt();
        }
        Arrays.sort(values);
        init(nodes, 0, values);
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(nodes[0]);
        while (!queue.isEmpty()) {
            Node cur = queue.remove();//移除并返回一个头部元素
            out.append(cur.val + " ");
            if (cur.left != -1) {
                queue.add(nodes[cur.left]);
            }
            if (cur.right != -1) {
                queue.add(nodes[cur.right]);
            }
        }
        System.out.println(out.substring(0, out.length() - 1));
    }

    public static void init(Node[] nodes, int i, int[] values) {
        if (i == -1) {
            return;
        }
        if (nodes[i].left != -1) {//中序创建
            init(nodes, nodes[i].left, values);
        }
        nodes[i].val = values[index++];
        if (nodes[i].right != -1) {//中序创建
            init(nodes, nodes[i].right, values);
        }
    }

    public static class Node {
        int left;
        int right;
        int val;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }
}
