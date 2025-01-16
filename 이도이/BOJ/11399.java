문제 링크:https://www.acmicpc.net/problem/11399
시간: 104ms
메모리: 14464KB


import java.io.*;
import java.util.Arrays;


public class Main {
  public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       String[] arr = br.readLine().split(" ");
       int[] waitingTime = new int[n];

       //String배열 int배열로 변환하기
       for(int i=0; i<n; i++){
         waitingTime[i] = Integer.parseInt(arr[i]);
       }

       Arrays.sort(waitingTime);
       int lineSum = 0;
       int[] totalSum = new int[n];
        // 결과값
        int result = 0;

       // 각 사람마다 걸리는 시간 배열에 집어 넣고 마지막 결과 그 배열값 더하기 
       for(int i=0; i<n; i++){
          lineSum+= waitingTime[i];
          totalSum[i] = lineSum;
          result += totalSum[i];
       }

       System.out.println(result);

  }
}
