//문제 링크 : https://www.acmicpc.net/problem/10773
//시간 : 212ms
//메모리 : 856KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stackInt = new Stack<>();
        int answer = 0;

        String intInput = br.readLine();
        int intValue = Integer.parseInt(intInput);

        for (int i = 0; i < intValue; i++) {
            String line = br.readLine();
            int num = Integer.parseInt(line);
            stackInt.push(num);
            if(0==num){
                stackInt.pop();
                stackInt.pop();
            }
        }
        while (!stackInt.isEmpty()) {
            answer += stackInt.pop();
        }
        System.out.println(answer);
    }
}
