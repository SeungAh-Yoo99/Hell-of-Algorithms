//문제 링크: https://www.acmicpc.net/problem/4949
//시간: 252ms
//메모리: 20424KB

import java.util.*;
import java.io.*;

public class Main {
    /**
     * 여는 괄호가 들어오면 stack에 넣고, 닫는 괄호가 들어오면 stack.pop()해서 짝 확인후 짝이 맞으면 pop, 틀리면 no 출력.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        while (!(line = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char ch : line.toCharArray()) {

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            if (isBalanced) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
