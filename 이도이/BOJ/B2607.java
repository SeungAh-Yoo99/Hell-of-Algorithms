// 문제 링크: https://www.acmicpc.net/problem/2607
// 시간: 96ms
// 메모리: 14116KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
        //첫번째 단어 받기
        String firstWord = br.readLine();
       //최종 정답
        int result = 0;

       for(int i=0; i<n-1; i++){
         String nextWord = br.readLine();
         int[] word = new int[26];
         int cnt = 0;

         //첫번째 문자 카운트
          for(int j=0; j<firstWord.length(); j++){
            word[firstWord.charAt(j) - 'A']++;
          }

         //다음단어 문자 카운트
          for(int k=0; k<nextWord.length(); k++){
             if(word[nextWord.charAt(k) - 'A'] > 0){
                 cnt++;
                 word[nextWord.charAt(k) - 'A']--;
             }
          }

        //비슷한 단어에 해당하는지 체크! 맞으면 result 카운트
           if(firstWord.length() == nextWord.length() && (firstWord.length() == cnt ||firstWord.length() == cnt+1 )) {
             result++;
           }else if(firstWord.length() == nextWord.length()-1 && nextWord.length() - 1 == cnt){
             result++;
           }else if(firstWord.length() == nextWord.length()+1 && nextWord.length() == cnt){
             result++;
           }

       }

       System.out.println(result);

  }
}
