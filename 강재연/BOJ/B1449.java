//문제 링크: https://www.acmicpc.net/problem/1449
//시간: 68 ms
//메모리: 11620 KB

import java.io.*;
import java.util.*;

public class boj1449 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] water = new int[N]; // 물이 떨어지는 위치 배열
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			water[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(water);
		
		int end = 0; // 테이프를 붙인 끝점
		int cnt = 0;
		for(int j=0; j<N; j++) {
			// 끝점이 물이 떨어지는곳보다 작으면
			if(end < water[j]) {
				// 테이프 개수 증가
				cnt++;
				// 끝점 갱신 
				// 물이 떨어지는 위치의 좌우 0.5만큼 간격이 있어야 하니까 -1
				end = water[j] + L - 1;
			}
		}
		System.out.println(cnt);
	}

}
