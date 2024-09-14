// 문제 링크: https://www.acmicpc.net/problem/11659
// 시간: 492ms
// 메모리: 56348KB

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException{
      StringBuilder sb = new StringBuilder();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;

      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken()); // 수의 개수
      int M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수
      int[] S = new int[N + 1];
      
      st = new StringTokenizer(br.readLine());
      for (int i = 1; i <= N; i++) {
          S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
      }
      
      int start; int end;
      for (int i = 0; i < M; i++) {
          st = new StringTokenizer(br.readLine());
          start = Integer.parseInt(st.nextToken());
          end = Integer.parseInt(st.nextToken());
          sb.append(S[end] - S[start - 1]).append("\n");
      }
      
      System.out.print(sb);
  }
}
