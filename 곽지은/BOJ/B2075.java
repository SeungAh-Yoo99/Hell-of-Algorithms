//문제 링크 : https://www.acmicpc.net/problem/2075
//시간 : 748ms
//메모리 : 274344KB


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i< N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<N;j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i = 0; i<N-1; i++){
            pq.poll();
        }
        System.out.println(pq.poll());
    }
}
