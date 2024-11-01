// https://www.acmicpc.net/problem/15654
// 시간: 236 ms
// 메모리: 31344 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    static int[] numbers,arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        numbers = new int[n]; // 입력 받은 숫자들 담을 배열
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n ; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers); // 우선 정렬



        backTracking(0, 0 , new int[n]);

        System.out.println(sb.toString());


    }

    private static void backTracking(int number, int cnt, int[] arr) {
        if(cnt==m){

            for(int i = 0 ; i < m;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        if(number == n+1){
            return;
        }

        for(int i = 0 ; i < n ; i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            arr[cnt] = numbers[i];
            backTracking(i+1,cnt+1,arr);
            visited[i] = false;
        }

    }
}
