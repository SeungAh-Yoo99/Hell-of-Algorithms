package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1620
// 시간: 556 ms
// 메모리: 98240 KB

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 포켓몬 수
        int M = Integer.parseInt(st.nextToken()); // 문제 수

        Map<String, Integer> nameMap = new HashMap<>(); // 이름에 대한 맵
        Map<Integer, String> numMap = new HashMap<>(); // 번호에 대한 맵
        for(int i=1; i<=N; i++) {
            String s = br.readLine();
            nameMap.put(s, i);
            numMap.put(i, s);
        }

        for(int i=0; i<M; i++) {
            String s = br.readLine();
            /* 정수 타입으로 형변환 시도 시 Exception 발생하면 이름에 대한 번호 출력, 발생하지 않으면 번호에 대한 이름 출력 */
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
