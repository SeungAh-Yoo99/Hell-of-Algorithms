문제 링크: https://www.acmicpc.net/problem/2018
시간:	144 ms
메모리: 14312KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
     public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int start=0; int end=0;
            int sum=0; int cnt=0;

            while(start <= n){
               while(++end <= n){
                 sum += end;
                  if(sum >= n){
                     if(sum == n)cnt++;
                     break;
                  }
               }

               while(++start <= n){
                 sum -= start;
                 if(sum <= n){
                   if(sum == n)cnt++;
                   break;
                 }
               }

            }
       System.out.println(cnt);
     }


}
