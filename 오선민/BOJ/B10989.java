// 문제 링크: https://www.acmicpc.net/problem/10989
// 시간: 2456 ms
// 메모리: 418828 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class B10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(br.readLine());
        int [] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        Arrays.sort(arrays);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arrays[i] + "\n");
        }
        System.out.print(sb);
    }
}