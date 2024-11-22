// 문제 링크: https://www.acmicpc.net/problem/15664
// 시간: 72 ms
// 메모리: 11608 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] numbers;
    static boolean[] visited;
    static Map<String,Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        numbers = new int[n];

        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        backTracking(0,0,new int[m]);

        System.out.println(sb.toString());

    }

    private static void backTracking(int number, int cnt, int[] visitedNum) {
        if(cnt == m){
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                builder.append(visitedNum[i]).append(" ");
            }
            if(map.containsKey(builder.toString())){
                return;
            }
            sb.append(builder.toString()).append("\n");
            map.put(builder.toString(),0);
            return;
        }

        for (int i = number; i < n; i++) {
            if(!visited[i]){
                
                visited[i] = true;
                visitedNum[cnt] = numbers[i];
                backTracking(i+1,cnt+1,visitedNum);
                visited[i] = false;
            }
        }

    }
}
