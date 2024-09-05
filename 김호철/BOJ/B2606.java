//문제 링크: https://www.acmicpc.net/problem/2606
//시간: 64ms
//메모리: 11632KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[][] arr;
    static int count = 0;
    static int totalPc;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        totalPc = Integer.parseInt(br.readLine());
        int totalPair = Integer.parseInt(br.readLine());
        arr = new int[totalPc][totalPc];
        visited = new boolean[totalPc];
        StringTokenizer st;
        int a,b;
        for(int i = 0 ; i< totalPair;i++) {
            st = new StringTokenizer(br.readLine());
            a =Integer.parseInt(st.nextToken());
            b =Integer.parseInt(st.nextToken());
            arr[ a- 1][b - 1] = 1;
            arr[b-1][a-1]=1;
        }
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt+" ");
//            }
//            System.out.println();
//        }
        dfs(1);
        System.out.println(count);
    }
    static void dfs(int n){
        visited[n-1]=true;
        for(int i = 0; i<totalPc;i++){
            if(arr[n-1][i]==1 && !visited[i]){
                count++;
                dfs(i+1);
            }
        }

    }
}
