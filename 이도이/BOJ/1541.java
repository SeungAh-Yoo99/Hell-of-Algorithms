문제 링크:https://www.acmicpc.net/problem/1541
시간: 100ms
메모리: 14244KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //-기준으로 분리하고 배열 생성
         String[] subArr = br.readLine().split("-");
         //결과값
         int result = 0;

         for(int i=0; i<subArr.length; i++){
           // 더한 값을 담을 변수
           int temp = 0;

           // 배열 값중에 + 포함되어 있는 건 따로 더해주기
           if(subArr[i].contains("+")){
             String[] plusArr = subArr[i].split("\\+");
             for(String plus : plusArr){
               temp += Integer.parseInt(plus);
             }
           }else{
             temp += Integer.parseInt(subArr[i]);
           }

           if(i == 0) result = temp;
           else{
             result -= temp;
           }
         }

       System.out.println(result);

     }
}
