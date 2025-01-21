// 문제 링크:https://www.acmicpc.net/problem/15649
// 시간: 852 ms
// 메모리: 64836 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // n 까지의 자연수
        m = Integer.parseInt(st.nextToken()); // m 개 고를 예정

        boolean[] visited; // 방문 배열 넘겨주면서 진행 예정


        for(int i = 1 ; i <= n ; i++){
            visited = new boolean[n+1]; // 0번 인덱스는 사용 X
            backTracking(i,0, visited,""); // i부터 시작, 선택한 숫자 갯수, 방문 배열, 문자열 넘겨주며 진행
        }
    }

    private static void backTracking(int number,int cnt, boolean[] visited,String s) {
        if(cnt == 0){
            s += number;
            visited[number] = true;
            cnt++;
        }

        if(cnt == m){
            System.out.println(s);
            return;
        }


        for(int i = 1 ; i <= n ; i++){
            if(!visited[i]){
                visited[i] = true;
                backTracking(i+1, cnt+1, visited, s+" "+i);
                visited[i] = false;
            }
        }
    }
}
