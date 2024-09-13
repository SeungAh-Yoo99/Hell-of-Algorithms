// 문제 링크: https://www.acmicpc.net/problem/10829
// 시간: 104 ms
// 메모리: 14240 KB

package recursion;

import java.io.*;

public class boj10829 {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N의 범위가 (1 ≤ N ≤ 100,000,000,000,000) 라서 long 타입으로 받음
		long N = Long.parseLong(br.readLine());
		
		binary(N);
		// 재귀 호출 전에 append를 하기 때문에 0의 자릿수부터 이진수 변환이 됨
		// 따라서 reverse로 전체를 뒤집어줘야 제대로 된 이진수 결과값이 출력된다
		System.out.println(sb.reverse());
	}
	
	public static void binary(long n) {
		// 먼저 2로 나눈 나머지를 sb에 append 하고
		sb.append(n % 2);
		// 만약 몫이 0이라면 재귀 종료
		if(n/2 == 0) return; 
		// 아니라면 2로 나눈 값으로 다시 호출
		binary(n /= 2);
	}

}
