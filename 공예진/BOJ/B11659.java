//문제 링크: https://www.acmicpc.net/problem/11659
//시간: 632ms
//메모리: 72216KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] allNumber = new int[N];
        for (int i = 0; i < N; i++) {
            allNumber[i] = Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[N];

        // 모든 인덱스까지의 누적 합을 배열에 저장하기
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += allNumber[i];
            sumArr[i] = sum;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == 1) {
                bw.write(sumArr[end - 1] + "\n");
            } else {
                if (start == end){
                    bw.write(allNumber[end - 1] + "\n");
                } else {
                    bw.write(sumArr[end - 1] - sumArr[start - 2] + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
