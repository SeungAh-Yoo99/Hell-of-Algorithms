//문제 링크 : https://www.acmicpc.net/problem/11866
//시간 : 128ms
//메모리 : 23404KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder answer = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		answer.append('<');
		while(queue.size() > 1) {
			for(int i = 0; i < K - 1; i++) {
				queue.offer(queue.poll());
			}
			answer.append(queue.poll()).append(", ");
		}
		answer.append(queue.poll()).append('>');
		System.out.println(answer);
	}
 
}
