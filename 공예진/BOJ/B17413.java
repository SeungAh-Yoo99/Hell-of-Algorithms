//문제 링크: https://www.acmicpc.net/problem/17413
//시간: 172ms
//메모리: 24256KB

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        boolean isTag = false;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (ch == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                sb.append(ch);
                isTag = true;
            } else if (ch == '>') {
                sb.append(ch);
                isTag = false;
            } else if (isTag) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                } else {
                    stack.push(ch);
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}