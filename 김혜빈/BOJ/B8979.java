package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/8979
// 시간: 84 ms
// 메모리: 12380 KB

import java.io.*;
import java.util.*;

public class B8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 국가의 수
        int K = Integer.parseInt(st.nextToken()); // 궁금한 국가의 번호
        int[][] arr = new int[N][4]; // 국가 배열

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 국가 번호
            arr[i][1] = Integer.parseInt(st.nextToken()); // 금메달 개수
            arr[i][2] = Integer.parseInt(st.nextToken()); // 은메달 개수
            arr[i][3] = Integer.parseInt(st.nextToken()); // 동메달 개수
        }

        Arrays.sort(
                arr,
                new Comparator<int[]>() { // 정렬
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o1[1] != o2[1]) {
                            return o2[1] - o1[1];
                        } else if (o1[2] != o2[2]) {
                            return o2[2] - o1[2];
                        } else {
                            return o2[3] - o1[3];
                        }
                    }
                });

        int rank = 1; // 현재 순위
        int target = 1; // 찾으려는 국가 순위
        for (int i = 1; i < N; i++) {
            if (arr[i][1] != arr[i - 1][1]
                    || arr[i][2] != arr[i - 1][2]
                    || arr[i][3] != arr[i - 1][3]) {
                rank = i + 1; // 갱신
            }

            if (arr[i][0] == K) {
                target = rank;
                break;
            }
        }

        System.out.println(target);
    }
}
