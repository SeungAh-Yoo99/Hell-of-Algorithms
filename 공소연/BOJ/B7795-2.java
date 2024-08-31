// 문제 링크: https://www.acmicpc.net/problem/7795
// 시간: 1788ms
// 메모리: 42020KB

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] A = new int[n];
			int[] B = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			int idxA = 0;
			int idxB = 0;
			int count = 0;
			while (idxA < n) {
				if (idxB >= m) {
					idxA++;
					idxB = 0;
					continue;
				}
				
				int currentA = A[idxA];
				int currentB = B[idxB];
				
				if (currentA > currentB) {
					count++;
					idxB++;
				} else {
					idxA++;
					idxB = 0;
				}
			}
			
			System.out.println(count);
		}
	}

}
