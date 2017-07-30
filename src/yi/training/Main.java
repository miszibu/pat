package yi.training;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        //first line
        int n = Integer.parseInt(reader.readLine());
        AvlNode root = null;
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i != n; i++) {
            int val = Integer.parseInt(tokenizer.nextToken());
            root = insert(val, root);
        }
        System.out.println(root.val);
    }

    public static int height(AvlNode node) {
        return node == null ? -1 : node.height;
    }

    public static boolean isBalanced(AvlNode node) {
        return Math.abs(height(node.left) - height(node.right)) < 2;
    }

    public static AvlNode rotateLeft(AvlNode node) {
        AvlNode tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        tmp.height = Math.max(height(tmp.left), height(tmp.right)) + 1;
        return tmp;
    }

    public static AvlNode rotateRight(AvlNode node) {
        AvlNode tmp = node.right;
        node.right = tmp.left;
        tmp.left = node;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        tmp.height = Math.max(height(tmp.left), height(tmp.right)) + 1;
        return tmp;
    }

    public static AvlNode doubleLeft(AvlNode node) {
        node.left = rotateRight(node.left);
        return rotateLeft(node);

    }

    public static AvlNode doubleRight(AvlNode node) {
        node.right = rotateLeft(node.right);
        return rotateRight(node);
    }

    public static AvlNode insert(int val, AvlNode root) {
        if (root == null) {
            return new AvlNode(val);
        }
        if (val > root.val) {
            root.right = insert(val, root.right);
            if (!isBalanced(root)) {
                root = val > root.right.val ? rotateRight(root) : doubleRight(root);
            }
        } else {
            root.left = insert(val, root.left);
            if (!isBalanced(root)) {
                root = val < root.left.val ? rotateLeft(root) : doubleLeft(root);
            }
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        return root;
    }

    public static class AvlNode {

        int val;
        AvlNode left;
        AvlNode right;
        int height;

        public AvlNode(int val) {
            this.val = val;
        }
    }
}


