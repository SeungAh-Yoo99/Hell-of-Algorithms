package 김호철.BOJ;
// 문제 링크: https://www.acmicpc.net/problem/1026
// 시간: 64 ms
// 메모리: 11620 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i<n;i++) {
            A[i]= Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i<n;i++) {
            B[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);// 문제에선 B를 정렬하지 말고 풀라했지만 그냥
                        // 정렬해서 풀었다...


        for(int i = 0 ; i < n; i ++){
            sum += A[i]*B[n-i-1];
            // 내림차순하기 귀찮아서 B는 뒤에서 부터 참조 ㅎㅎ
        }

        System.out.println(sum);

    }
}
