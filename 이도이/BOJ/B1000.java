// 문제 링크:https://www.acmicpc.net/source/83223966
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

       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());

       System.out.println(a+b);

  }
}
