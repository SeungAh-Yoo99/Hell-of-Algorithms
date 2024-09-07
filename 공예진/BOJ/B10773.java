//문제 링크: https://www.acmicpc.net/problem/10773
//시간: 196ms
//메모리: 23464KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>(); // 스택 생성

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) { // 만약 0이면 스택의 마지막 값이 잘못된 값이기 때문에 삭제
                stack.pop();
            }
            else {
                stack.push(num); // 0이 아니면 스택에 삽입
            }
        }

        int sum = 0;

        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i); // 스택의 모든 요소 더하기
        }
        System.out.println(sum);
    }

}