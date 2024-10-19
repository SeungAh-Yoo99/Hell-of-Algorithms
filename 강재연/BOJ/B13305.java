//문제 링크: https://www.acmicpc.net/problem/13305
//시간: 356 ms
//메모리: 49736 KB

import java.io.*;
import java.util.*;

public class boj13305 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 거리와 가격의 범위가 1,000,000,000 이하의 자연수라서 Long 타입으로 선언 
		Long[] distance = new Long[N-1];
		Long[] city = new Long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N-1; i++) {
			distance[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<N; j++) {
			city[j] = Long.parseLong(st.nextToken());
		}
				
		int start = 0;
		int end = 1;
		Long money = 0L;
		
		while(end <= N-1) {
			// 시작도시의 가격이 끝도시보다 크거나,
			// 시작도시의 가격이 끝도시보다 작거나 같지만 끝도시의 index가 배열의 끝일때 
			if(city[start] > city[end] || (city[start] <= city[end] && end == N-1)) {
				// 시작도시부터 끝도시의 누적거리
				Long accl = 0L;
				for(int k=start; k<end; k++) {
					accl += distance[k];
				}
				// 시작도시의 가격(최솟값) * 누적거리 
				money += (city[start] * accl);
				// 시작도시 변경
				start = end;
			}
			// 시작도시의 가격이 끝도시보다 작을경우 끝도시 증가 
			end++;
		}
		System.out.println(money);
	}
}
