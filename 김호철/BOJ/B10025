// 문제 링크:https://www.acmicpc.net/problem/10025
// 시간: 268 ms
// 메모리: 40700 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게으른_백곰_10025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int max;
        int sum=0;
        int[] iceBucket = new int[1000001];

        for(int i = 0 ; i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            iceBucket[y]+= x;
        }
        for(int i = 0 ; i < K*2+1&& i <= 1000000; i++){ // 여기서 &&조건이 꼭 필요함
            sum+=iceBucket[i];                          // 인덱스 범위 벗어나면 안되기 때문에
        }
        max = sum;
        for(int i = 2*K+1;i<=1000000;i++){
            sum-=iceBucket[i-(K*2+1)];
            sum+=iceBucket[i];
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
