import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //DOG단어 배열로 만들기
        String firstWord = br.readLine();
        int result = 0;

        for(int i = 0; i<n-1; i++){
            String nextWord = br.readLine();
          // 같은 단어 개수!!
          int cnt = 0;
          int[] word = new int[26];

          for(int j=0; j<firstWord.length(); j++){
            word[firstWord.charAt(j) - 'A']++;
          }

          for(int k=0; k<nextWord.length(); k++){
           if( word[nextWord.charAt(k) - 'A'] > 0){
              cnt++;
              word[nextWord.charAt(k) - 'A']--;
           }
          }

          if(firstWord.length() == nextWord.length() && (firstWord.length() == cnt || firstWord.length() - 1 == cnt)) {
            result++;
          } else if (firstWord.length() == nextWord.length() - 1 && nextWord.length() - 1 == cnt) {
            result++;
          } else if (firstWord.length() == nextWord.length() + 1 && nextWord.length() == cnt) {
            result++;
          }

       }

        System.out.println(result);

  }
}

// 문제 링크: https://www.acmicpc.net/problem/2607
// 시간: 100ms
// 메모리: 14172KB
