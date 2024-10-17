package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/2578
// 시간: 76 ms
// 메모리: 13040 KB

import java.io.*;
import java.util.*;
import static java.lang.System.exit;

public class B2578 {
    static final int N = 5;
    static int[] rows = new int[N]; // 행 별 체크된 숫자의 개수
    static int[] cols = new int[N]; // 열 별 체크된 숫자의 개수
    static int[] lines = new int[2]; // 대각선 라인 중 체크된 숫자의 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) map.put(Integer.parseInt(st.nextToken()), new int[] {i, j});
        }

        int cnt = 0; // 빙고 개수
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int[] arr = map.get(Integer.parseInt(st.nextToken()));
                if(++rows[arr[0]] == 5) cnt++;
                if(++cols[arr[1]] == 5) cnt++;
                chkIsLine(arr[0], arr[1]);
                if(cnt + cntLines() < 3) continue; // 현재 빙고 개수랑 대각선 개수 합친 것이 3 이상이어야 빙고
                System.out.println(5 * i + j + 1);
                exit(0);
            }
        }
    }

    private static void chkIsLine(int r, int c) {
        if(r == c) { // 행과 열 값이 같으면 대각선 라인
            lines[0]++;
            if(r == 2) lines[1]++;
        } else { // 다른 경우 아래와 같은 조건에서 대각선 라인 만족
            for(int i=0; i<N; i++) {
                if(r == i && c == (N - i - 1)) {
                    lines[1]++;
                    return;
                }
            }
        }
    }

    private static int cntLines() {
        if(lines[0] == 5 && lines[1] == 5) return 2;
        else if(lines[0] == 5 || lines[1] == 5) return 1;
        else return 0;
    }
}
