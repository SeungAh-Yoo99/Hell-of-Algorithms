문제 링크:https://www.acmicpc.net/problem/2588
시간: 100ms
메모리: 14032KB

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String m = br.readLine();


      System.out.println(n*(m.charAt(2)-'0'));
      System.out.println(n*(m.charAt(1)-'0'));
      System.out.println(n*(m.charAt(0)-'0'));
      System.out.println(n*Integer.parseInt(m));

    }

}
