package 김혜빈.BOJ;

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
        Map<Integer, String> numMap = new HashMap<>();
        for(int i=1; i<=N; i++) {
            String s = br.readLine();
            nameMap.put(s, i);
            numMap.put(i, s);
        }

        for(int i=0; i<M; i++) {
            String s = br.readLine();
            try {
                int num = Integer.parseInt(s);
                sb.append(numMap.get(num)).append("\n");
            } catch (NumberFormatException e) {
                sb.append(nameMap.get(s)).append("\n");
            }
        }

        bw.append(sb.toString());
        bw.close();
    }
}