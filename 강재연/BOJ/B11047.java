// 문제 링크: https://www.acmicpc.net/problem/11047
// 시간: 104 ms
// 메모리: 14256 KB

package Greedy;

import java.io.*;
import java.util.*;

public class boj11047 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Integer[] coins = new Integer[N]; // 정렬을 위해 Integer 클래스로 선언
		
		for(int i=0; i<N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		// 내림차순 정렬
		Arrays.sort(coins, (a, b) -> b - a);
		int result = 0; 
		
		for(int coin: coins) {
			result += (K/coin); // 금액을 큰 동전부터 나눈 몫을 result에 넣음
			K %= coin; // result에 할당된 만큼은 금액을 빼야하기 때문에 동전으로 나눈 나머지로 재할당
		}
		
		System.out.println(result);
	}
}
