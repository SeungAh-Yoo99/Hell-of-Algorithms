//문제 링크: https://www.acmicpc.net/problem/15663
//시간: 208
//메모리: 32296


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
    static Map<String,Integer> map = new HashMap<>();
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        numbers = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        backTracking(0,new int[m]);

        System.out.println(sb.toString());

    }

    private static void backTracking(int cnt, int[] visitedNum) {
        if(cnt == m){
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                builder.append(visitedNum[i]).append(" ");
            }
            if(map.containsKey(builder.toString())){
                return;
            }
            map.put(builder.toString(),0);
            sb.append(builder).append("\n");
            return;
        }

        for(int i = 0; i < n;i++){
            if(!visited[i]){
                visited[i] = true;
                visitedNum[cnt] = numbers[i];
                backTracking(cnt+1,visitedNum);
                visited[i] = false;
            }
        }
    }
}
