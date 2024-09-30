//문제 링크: https://www.acmicpc.net/problem/1966
//시간: 84ms
//메모리: 12588KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서 개수
            int M = Integer.parseInt(st.nextToken()); // 인덱스

            Queue<int[]> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(new int[] {j, num}); // 인덱스, 중요도
            }

            int cnt = 0; // 문서의 출력 순서

            while (true) {
                boolean hasHigherPriority = false; // 자신보다 중요도가 높은 문서가 있는 지 확인하는 용도
                int[] selected = queue.poll();

                for (int[] arr : queue) {
                    if (selected[1] < arr[1]) { // 중요도 비교
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) { // 자신보다 중요도가 높은 문서가 있는 경우
                    queue.add(selected);
                } else { // 자신이 가장 높은 중요도를 가진 경우
                    if (selected[0] == M) { // 인덱스 비교
                        cnt++;
                        break;
                    } else {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}




