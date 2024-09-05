package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1764
// 시간: 216 ms
// 메모리: 25268 KB

import java.io.*;
import java.util.*;

public class B1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 수
        int M = Integer.parseInt(st.nextToken()); // 보도 못한 사람 수

        Set<String> set = new HashSet<>(); // 듣도 못한 사람 이름 set
        for(int i=0; i<N; i++) set.add(br.readLine());

        List<String> list = new ArrayList<>();
        for(int i=0; i<M; i++) {
            String s = br.readLine();
            if(set.contains(s)) list.add(s); // 만약 보도 못한 사람이 듣도 못한 사람이면 list 에 추가
        }

        Collections.sort(list);
        sb.append(list.size()).append("\n");
        for(String s : list) sb.append(s).append("\n");

        bw.append(sb.toString());
        bw.close();
    }
}
