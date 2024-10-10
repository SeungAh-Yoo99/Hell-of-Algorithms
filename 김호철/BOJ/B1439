// 문제 링크:https://www.acmicpc.net/problem/1439
// 시간: 72 ms
// 메모리: 11804 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); // 우선 받은 문자열 저장하고 

        StringTokenizer st0 = new StringTokenizer(s,"0"); // 0 기준으로 나누면 떨어져있는 1의 개수가 나온다
        StringTokenizer st1 = new StringTokenizer(s, "1"); // 그렇게 되면 그 것 만큼 뒤집으면 1을 뒤집었을 때 값
                                                            // 이 방법처럼 1기준으로 나뉜 0 값들의 갯수를 구한뒤 최소를 구하면 된다.

        System.out.println(Math.min(st0.countTokens(), st1.countTokens()));

    }
}
