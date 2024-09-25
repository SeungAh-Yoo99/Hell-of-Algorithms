package 김호철.BOJ;
// 문제 링크: https://www.acmicpc.net/problem/11660
// 시간: 1880 ms
// 메모리: 124716 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 표의 크기 n * n
        int m = Integer.parseInt(st.nextToken()); // 구해야하는 횟수 m

        int[][] arr = new int[n+1][n+1]; // (n+1) * (n+1) 배열 생성
        // x 0이랑 y 0값 안쓰기 위해서 그냥 1씩 크게 만들었음
        int temp;

        // 표(2차원 배열)에 데이터 넣기
        for(int i = 1 ; i<=n;i++){
            temp = 0;
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=n;j++){
                temp+=Integer.parseInt(st.nextToken());
                arr[i][j] = temp;
            }
        }
        int x1,y1,x2,y2,sum;

        for(int i = 0 ; i < m; i++){
            sum = 0;
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            for(int j = x1; j <= x2 ; j++){
                sum += arr[j][y2]-arr[j][y1-1];
            }
            System.out.println(sum);
        }
    }
}
