// 문제 링크: https://www.acmicpc.net/problem/11047
// 시간: 100 ms
// 메모리: 14192 KB

package greedy;

import java.io.*;
import java.util.*;

public class boj11047_refactor {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N]; // 원시타입 배열로 선언
		
		// 역순으로 넣으면 정렬을 할 필요가 없음 
		for(int i=N; i>0; i--) {
			coins[i-1] = Integer.parseInt(br.readLine());
		}
		
		int result = 0; 

		for(int coin: coins) {
			if(coin > K) continue; 
			
			result += (K/coin); // 금액을 큰 동전부터 나눈 몫을 result에 넣음
			K %= coin; // result에 할당된 만큼은 금액을 빼야하기 때문에 동전으로 나눈 나머지로 재할당
		}

		System.out.println(result);
	}
}
