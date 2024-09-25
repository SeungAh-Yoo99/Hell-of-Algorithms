// 문제 링크: https://www.acmicpc.net/problem/9012
// 시간: 64 ms
// 메모리: 11608 KB

import java.io.*;

public class boj9012_refactor {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            if (isBalance(input)) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.print(sb);

	}
	
	// 괄호 유효성 검사 함수
    public static boolean isBalance(String str) {
        int balance = 0; // 여는 괄호의 균형을 맞추기 위한 변수

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                balance++;  // 여는 괄호일 경우 카운트 증가
            } else if (ch == ')') {
                balance--;  // 닫는 괄호일 경우 카운트 감소
            }

            // 닫는 괄호가 더 많아지면 즉시 유효하지 않음
            if (balance < 0) {
                return false;
            }
        }

        // 최종적으로 괄호가 균형을 이루면 true, 아니면 false
        return balance == 0;
    }

}
