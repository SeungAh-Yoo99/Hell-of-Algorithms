//문제 링크: https://www.acmicpc.net/problem/11659
//시간: 428 ms
//메모리: 57676 KB

import java.io.*;
import java.util.*;

public class boj11659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] prefixSum = new int[N];
		st = new StringTokenizer(br.readLine());
		
		// 누적합 배열 생성 
		for(int i=0; i<N; i++) {
			// prefixSum[0] = 입력값
			// prefuxSum[1~] = 이전값 + 입력값 = 누적합 
			prefixSum[i] = i == 0 ? 
							Integer.parseInt(st.nextToken()) :
							prefixSum[i-1] + Integer.parseInt(st.nextToken()); 
		}		
		
		// 구간합 구하는 부분
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			if(start > 0) {
				// 구간합을 구하는 끝 인덱스에서 시작 인덱스의 이전 누적합을 빼주면 원하는 구간합을 구할 수 있다!!! 
				sb.append(prefixSum[end] - prefixSum[start-1]).append("\n");
			}else {
				// 구간합을 구하는 시작 인덱스가 0이면 그냥 누적합 배열에서 출력
				sb.append(prefixSum[end]).append("\n");
			}
		}
		System.out.println(sb);
	}

}
