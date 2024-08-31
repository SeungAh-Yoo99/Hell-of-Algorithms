// 문제 링크:https://www.acmicpc.net/problem/10430
// 시간: 100ms
// 메모리: 14176KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       StringBuilder sb = new StringBuilder();

       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       int c = Integer.parseInt(st.nextToken());

       sb.append((a + b) % c).append("\n");
       sb.append( ((a % c) + (b % c)) % c).append("\n");
       sb.append((a * b) % c).append("\n");
       sb.append((a % c) * (b % c) % c);

       System.out.println(sb);
  }
}
