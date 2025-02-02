//문제링크 https://www.acmicpc.net/problem/11725
//시간 1192ms
//메모리 80948KB


import java.io.*;  
import java.util.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int n = Integer.parseInt(br.readLine());  
        int[] parent = new int[n + 1];  
        ArrayList<Integer>[] adj = new ArrayList[n + 1];  
        for (int i = 1; i <= n; i++) {  
            adj[i] = new ArrayList<>();  
        }  
        boolean[] visited = new boolean[n + 1];  
        StringTokenizer st;  
        for (int i = 1; i < n; i++) {  
            st = new StringTokenizer(br.readLine());  
            int a = Integer.parseInt(st.nextToken());  
            int b = Integer.parseInt(st.nextToken());  
            adj[a].add(b);  
            adj[b].add(a);  
        }  
  
        Queue<Integer> queue = new LinkedList<>();  
        queue.add(1);  
        visited[1] = true;  
  
        while (!queue.isEmpty()) {  
            int cur = queue.poll();  
            for (int next : adj[cur]) {  
                if (visited[next]) continue;  
                visited[next] = true;  
                queue.add(next);  
                parent[next] = cur;  
            }  
        }  
  
        for (int i = 2; i <= n; i++) {  
            System.out.println(parent[i]);  
        }  
    }  
}
