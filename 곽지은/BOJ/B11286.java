//문제링크 https://www.acmicpc.net/problem/11286
//시간 452ms
//메모리 26440KB


import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
      
    PriorityQueue<Integer> priQueue = new PriorityQueue<>((o1, o2) -> {
      int firstAbs = Math.abs(o1);
      int secondAbs = Math.abs(o2);
      if (firstAbs == secondAbs)
        return Integer.compare(o1, o2); 
      else
        return Integer.compare(firstAbs, secondAbs);
    });
      
    for (int i = 0; i < num; i++) {
      int request = Integer.parseInt(br.readLine());
      if (request == 0) {
        if (priQueue.isEmpty())
          System.out.println("0");
        else
          System.out.println(priQueue.poll());
      } else {
        priQueue.add(request);
      }
    }
  }
}
