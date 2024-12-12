//문제 링크: https://www.acmicpc.net/problem/2559
//시간: 180 ms
//메모리: 22856 KB

import java.io.*;
import java.util.*;

public class boj2559 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken());
		int[] nums = new int[N]; // 온도 배열
		int[] prefix = new int[N]; // 누적합 배열
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			prefix[i] = i == 0 ?
					nums[i]:
					prefix[i-1] + nums[i];
		}
		
		int max = prefix[K-1]; // 0 ~ K-1만큼의 누적합 
		
		int start = 1;
		int end = 1 + K;
		
		while(end < N) {
			// 한칸씩 이동하면서 새로운 누적합 구함
			int nmax = prefix[end] - prefix[start];
			start++;
			end++;
			// max값과 비교
			max = max < nmax ? nmax : max;
		}	
		System.out.println(max);
	}
}
