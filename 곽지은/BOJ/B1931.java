//문제링크 https://www.acmicpc.net/problem/1931
//시간 456ms
//메모리 43764KB


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); // 시작
            time[i][1] = Integer.parseInt(st.nextToken()); // 종료
        }

        Arrays.sort(time, (o1, o2) -> {
            if(o1[1] == o2[1]) { //종료시간이 같을 경우 시작 시간이 빠른 순
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int cnt = 0;
        int end = 0;

        for (int i = 0; i < N; i++) {
            if(end <= time[i][0]) {
                end = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
