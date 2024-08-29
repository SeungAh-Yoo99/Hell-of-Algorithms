// 문제 링크: https://www.acmicpc.net/problem/11721
// 시간: 100 ms
// 메모리: 14184 KB

package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();

    // 문자열 길이의 10의자리수를 구함
		int length = input.length()/10;
    // 10의 자리수만큼 반복
		for (int i = 0; i < length ; i++) {
      // 0 ~ 9, 10 ~ 19 ... 이런식으로 append
			sb.append(input.substring(i*10, (i*10)+10)).append("\n");
		}
		// 남은 글자 append
		sb.append(input.substring(length*10, input.length()));		
		System.out.println(sb);
	}
}
