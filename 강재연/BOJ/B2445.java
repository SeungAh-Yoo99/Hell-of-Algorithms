// 문제 링크: https://www.acmicpc.net/problem/2445
// 시간: 172 ms
// 메모리: 17780 KB

package IO;

import java.util.Scanner;

public class boj2445 {

	public static void main(String[] args) {
    // 입력
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		//출력
		StringBuilder sb = new StringBuilder();
    
		for(int i=1; i<=2*T-1; i++) {
      // T가 5일때 공백은 4,3,2,1,0,1,2,3,4가 필요함 → 5-1 => 4이 첫번째 줄의 공백, 5-2 => 3이 두번째 줄의 공백 ... 반복 (절대값) 
			int abs = Math.abs(T-i);
      // 5개를 기준으로 왼쪽 별
      // T가 5일때 별은 1,2,3,4,5,4,3,2,1개씩 찍힘 → 5-4(abs) => 1이 첫번째 줄의 별, 5-3 => 2가 두번째 줄의 별 ... 반복 
			sb.append("*".repeat(T-abs)).append(" ".repeat(abs));
      // 5개를 기준으로 오른쪽 별
			sb.append(" ".repeat(abs)).append("*".repeat(T-abs)).append("\n");
		}
		System.out.println(sb);
	}
}
