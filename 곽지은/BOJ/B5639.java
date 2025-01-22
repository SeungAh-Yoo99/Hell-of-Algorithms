//문제링크 https://www.acmicpc.net/problem/5639
//시간 572ms
//메모리 29360KB

import java.util.*;
import java.io.*;

class Main {
    static class Node {
        int root;
        Node left, right;

        Node(int root) {
            this.root = root;
        }

        Node(int root, Node left, Node right) {
            this.root = root;
            this.left = left;
            this.right = right;
        }

        void insert(int n) {
            if (n < this.root) {
                if (this.left == null)
                    this.left = new Node(n);
                else
                    this.left.insert(n);
            } else {
                if (this.right == null)
                    this.right = new Node(n);
                else
                    this.right.insert(n);
            }
        }
    }

    static void dfs(Node curr) {
        if (curr == null)
            return;

        dfs(curr.left);
        dfs(curr.right);
        System.out.println(curr.root);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node root = new Node(Integer.parseInt(br.readLine()));

        while (true) {
            String str = br.readLine();
            if (str == null || str.equals(""))
                break;
            int value = Integer.parseInt(str);
            root.insert(value); 
        }
        dfs(root);
    }
}
