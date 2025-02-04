//문제 링크: https://www.acmicpc.net/problem/1449
//시간: 100ms
//메모리: 14340KB

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
  public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         int M = Integer.parseInt(st.nextToken());
         int L = Integer.parseInt(st.nextToken());

         String[] arr = br.readLine().split(" ");
         int[] placeWater = new int[arr.length];

         for(int i=0; i<arr.length; i++){
           placeWater[i] = Integer.parseInt(arr[i]);
         }

         Arrays.sort(placeWater);

         // 하나의 테이프가 붙일 수 있는 범위 설정
         int range = (int)(placeWater[0]-0.5+L);
         // 테이프는 무조건 한번은 필요하니깐 1부터
         int cnt = 1;

         for(int i=0; i<placeWater.length; i++){
                
                // 현재 위치가 범위에서 벗어나면 cnt++
                if(placeWater[i] > range){
                       cnt++;
                       // 다시 범위 설정하기 
                       range = (int)(placeWater[i]-0.5+L);
                }
         }

         System.out.println(cnt);
  }
}
