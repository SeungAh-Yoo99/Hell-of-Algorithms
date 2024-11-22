//문제 링크: https://www.acmicpc.net/problem/2217
//시간: 220 ms
//메모리: 21220 KB

import java.io.*;
import java.util.*;

public class boj2217 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 로프 오름차순 정렬
		Arrays.sort(nums);
		
		int max = 0; 
		for(int j=0; j<N; j++) {
			// 로프 * 남은 로프갯수 
			// 중량이 작은 로프를 많이 쓰는것과
			// 중량이 큰 로프를 작게 쓰는것 비교
			max = max < nums[j] * (N - j) ? nums[j] * (N - j) : max;
		}
		
		System.out.println(max);
	}

}
