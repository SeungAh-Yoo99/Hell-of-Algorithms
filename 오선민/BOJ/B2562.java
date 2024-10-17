//문제 링크: https://www.acmicpc.net/problem/2562
//시간: 104 ms
//메모리: 14252 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] inputs = new int [9];

        for (int i = 0; i < 9; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int max = Arrays.stream(inputs).max().getAsInt();
        System.out.println(max);
        for (int i = 0; i < 9; i++) {
            if (inputs[i] == max) {
                System.out.println(i+1);
            }
        }
    }
}