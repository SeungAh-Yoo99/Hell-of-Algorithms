// 문제 링크: https://www.acmicpc.net/problem/2075
// 시간: 824ms
// 메모리: 334056KB

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				pq.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		int answer = 0;
		for (int i = n; i > 0; i--) {
			answer = pq.remove();
		}
		
		System.out.println(answer);
	}

}
