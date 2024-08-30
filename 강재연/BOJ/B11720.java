// 문제 링크: https://www.acmicpc.net/problem/11720
// 시간: 100 ms
// 메모리: 14204 KB

package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11720 {
	static int T;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		T = Integer.parseInt(br.readLine());
		
		int num = 0;
		String s = br.readLine();
		for(int i=0; i<T; i++) {
      // char 타입이라 아스키 코드의 숫자값으로 변환된다 (48 ~ 57)
      // char 타입인 '0' (48)을 빼줘야 의도한 0 ~ 9 숫자값이 반환됨 
			num += s.charAt(i) - '0';
		}
		System.out.println(num);
	}

}
