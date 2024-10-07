// 문제 링크: https://www.acmicpc.net/problem/6198
// 시간: 260ms
// 메모리: 22636KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long sum = 0;

        int building;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            building = Integer.parseInt(br.readLine());
          
            while (!stack.isEmpty() && building >= stack.peek()) {
                stack.pop(); // 스택에 현재보다 작은 높이가 있으면 제거
            }

            sum += stack.size(); // 현재 빌딩의 옥상을 볼 수 있는 빌딩들의 수

            stack.push(building);
        }

        System.out.println(sum);
    }
}
