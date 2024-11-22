//문제 링크: https://www.acmicpc.net/problem/11659
//시간: 528ms
//메모리: 62436KB

import java.util.*;
import java.io.*;

public class Main {
    /**
     * 리팩토링 - 모든 인덱스까지의 누적 합을 배열에 저장할 때 1번 인덱스부터 사용하도록 변경
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sumArr = new int[N + 1]; // N + 1 크기로 선언, 1번 인덱스부터 사용
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            bw.write(sumArr[end] - sumArr[start - 1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
