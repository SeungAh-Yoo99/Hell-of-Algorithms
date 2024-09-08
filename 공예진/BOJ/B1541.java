//문제 링크: https://www.acmicpc.net/problem/1541
//시간: 100ms
//메모리: 14200KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-"); // 입력 문자열을 -로 분리
        String first = st.nextToken();
        int sum = 0;

        // 첫 번째 토큰은 따로 처리해줌 (덧셈 연산 처리)
        StringTokenizer st1 = new StringTokenizer(first, "+");
        while(st1.hasMoreTokens()) {
            sum += Integer.parseInt(st1.nextToken());
        }

        // 나머지 토큰들은 모두 뺄셈 연산 처리
        while (st.hasMoreTokens()) {
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            while(st2.hasMoreTokens()) {
                sum -= Integer.parseInt(st2.nextToken());
            }
        }

        System.out.println(sum);

    }

}
