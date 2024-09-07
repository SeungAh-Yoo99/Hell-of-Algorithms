// 문제 링크: https://www.acmicpc.net/problem/1541
// 시간: 64ms
// 메모리: 11508KB

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subtract = br.readLine().split("-");
        
        int sum = Integer.MAX_VALUE;

        for (int i=0; i<subtract.length; i++) {
            int temp = 0;

            String[] plus = subtract[i].split("\\+");

            for (String num : plus) {
                temp += Integer.parseInt(num);
            }

            if (sum == Integer.MAX_VALUE) sum = temp;
            else sum -=temp;
        }

        System.out.println(sum);
    }
}
