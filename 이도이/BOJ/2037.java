문제 링크:https://www.acmicpc.net/problem/2037
시간: 108ms
메모리: 14368KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int plus = Integer.parseInt(st.nextToken());
    int seqMsg = Integer.parseInt(st.nextToken());

    // 입력 받은 알파벳 문자
    String[] inputMsg = br.readLine().split("");

    // 자판기
    String[][] alphabet = {{"A","B","C"}, {"D","E","F"}, {"G","H","I"}, {"J","K","L"} ,{"M", "N", "O"}, {"P","Q","R","S"},
        {"T", "U", "V"}, {"W","X","Y","Z"}};

    // 결과값
    int sum = 0;
    int temp = -1;
    for(int i=0; i<inputMsg.length; i++){

      for(int k=0; k<alphabet.length; k++){
        if(inputMsg[i].equals(" ")){
          temp = -1;
          sum+= plus;
          break;
        }
        for(int j=0; j<alphabet[k].length; j++){
          if(inputMsg[i].equals(alphabet[k][j]) && j == 0){
            if (temp == k) {
              sum += seqMsg;
            }
            temp = k;
            sum += plus;
          }else if(inputMsg[i].equals(alphabet[k][j]) && j == 1){
            if (temp == k) {
              sum += seqMsg;
            }
            temp = k;
            sum += plus*2;
          }else if(inputMsg[i].equals(alphabet[k][j]) && j == 2){
            if (temp == k) {
              sum += seqMsg;
            }
            temp = k;
            sum += plus*3;
          }else if(inputMsg[i].equals(alphabet[k][j]) && j == 3){
            if (temp == k) {
              sum += seqMsg;
            }
            temp = k;
            sum += plus*4;
          }

        }
      }

    }

    System.out.println(sum);

  }
}
