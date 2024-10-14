package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1620
// 시간: 520 ms
// 메모리: 97488 KB

import java.io.*;
import java.util.*;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameMap = new HashMap<>();
        String[] numMap = new String[N + 1];
        for(int i=1; i<=N; i++) {
            String s = br.readLine();
            nameMap.put(s, i);
            numMap[i] = s;
        }

        for(int i=0; i<M; i++) {
            String s = br.readLine();
            try {
                int num = Integer.parseInt(s);
                sb.append(numMap[num]).append("\n");
            } catch (NumberFormatException e) {
                sb.append(nameMap.get(s)).append("\n");
            }
        }

        bw.append(sb.toString());
        bw.close();
    }
}
