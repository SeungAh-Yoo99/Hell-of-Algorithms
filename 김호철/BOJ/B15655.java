문제 링크: https://www.acmicpc.net/problem/15655
시간: 64ms
메모리: 11576KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n , m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr; // 전역으로 선언 한 것들
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n]; // 방문 배열
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 낮은 순 부터 나와야 해서 정렬했음
        
        backtracking(0,0,visited); // 깊이, 갯수, 방문 배열 순

        System.out.println(sb.toString());

    }

    private static void backtracking(int depth, int cnt, boolean[] visited) {
        if(cnt ==m){ // 만약 m 만큼 숫자가 쌓였다면
            for(int i = 0 ; i< n ; i++){
                if(visited[i]){ // 방문 했던 것들을 띄어쓰기 기준으로 빌더에 담고
                    sb.append(arr[i]).append(" ");
                }
            }
            sb.append("\n"); // 다 담았다면 개행했다.
            return; // 끝났기 때문에 return
        }
        if(depth == n ) return; // 만약 끝 까지 들어갔다면 return

        visited[depth]=true; //현재 방문 처리하고
        backtracking(depth+1,cnt+1,visited); // 방문 했다 치고 cnt+1로 넘겨줬음
        visited[depth]= false; // 방문 안했다고 생각하고
        backtracking(depth+1, cnt, visited); // cnt 그대로, 깊이는 한 번 더 들어감
    }
