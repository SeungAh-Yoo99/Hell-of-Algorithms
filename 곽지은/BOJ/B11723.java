//문제 링크 https://www.acmicpc.net/problem/11723
//시간 1504ms
//메모리 313552KB



/**
*  if-elseif과 if문만 사용하기 또는 case문 중 
*  case가 400ms정도 빨랐습니다

*  제가 생각했을 때,case구문이 빠른 이유는?
*  특정 케이스이면 바로 처리를 하기 때문에 접근이 조건문보다 뻐르기 때문이라고 생각합니다
*/

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    HashMap<Integer, Integer> hash = new HashMap<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numN = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while (numN-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String s = st.nextToken();
      int tmp;

      switch (s) {
        case "add":
          tmp = Integer.parseInt(st.nextToken());
          hash.putIfAbsent(tmp, 1);
          break;

        case "check":
          tmp = Integer.parseInt(st.nextToken());
          sb.append(hash.containsKey(tmp) ? "1" : "0").append("\n");
          break;

        case "remove":
          tmp = Integer.parseInt(st.nextToken());
          hash.remove(tmp);
          break;

        case "toggle":
          tmp = Integer.parseInt(st.nextToken());
          if (hash.containsKey(tmp)) {
            hash.remove(tmp);
          } else {
            hash.put(tmp, 1);
          }
          break;

        case "all":
          hash.clear();
          for (int i = 1; i <= 20; i++) {
            hash.put(i, 1);
          }
          break;

        case "empty":
          hash.clear();
          break;

        default:
          break;
      }
    }
    System.out.print(sb);
  }
}



