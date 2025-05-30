//문제 링크: https://www.acmicpc.net/problem/2578
//시간: 104
//메모리: 14180

import java.io.*;
import java.util.Arrays;


public class Main {

  static int bingoCnt = 0;
  static int[][] bingoBoard = new int[5][5];

  public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int result = 0;

         int[][] callBoard = new int[5][5];
         for(int i=0; i<10; i++){

           // 빙고판 입력 받기
            if(i<5){
              String[] bingo = br.readLine().split(" ");
              for(int j=0; j<bingo.length; j++){
                 bingoBoard[i][j] = Integer.parseInt(bingo[j]);
              }
            }else{
              // 부를 숫자 입력 받기
              String[] call = br.readLine().split(" ");
              for(int j=0; j<call.length; j++){
                callBoard[i-5][j] = Integer.parseInt(call[j]);
              }

            }
         }

        // 불린 숫자 0으로 체크하기 
        for(int i=0; i<5; i++){
          for(int k=0; k<5; k++){

            for(int j=0; j<5; j++){
              for(int h=0; h<5; h++){
                if(callBoard[i][k] == bingoBoard[j][h]){
                  bingoBoard[j][h] = 0;
                }
              }
            }

            width();
            height();
            Diagonal();
            OppositeDiagonal();

            result++;
            if(bingoCnt >= 3){
              System.out.println(result);
              return;
            }

           bingoCnt=0;

          }
        }
  }
  // 가로줄 체크
  public static void width(){
    for(int i=0; i<5; i++){
      boolean isBingo = true;
      for(int j=0; j<5; j++){
        if(bingoBoard[i][j] != 0){
          isBingo = false;
          break;
        }
      }

      if(isBingo){
        bingoCnt++;
      }
    }
  }

  // 세로줄 체크
  public static void height(){
    for(int i=0; i<5; i++){
      boolean isBingo = true;
      for(int j=0; j<5; j++){
        if(bingoBoard[j][i] != 0){
          isBingo = false;
          break;
        }
      }

      if(isBingo){
        bingoCnt++;
      }
    }
  }


  //대각선
  public static void Diagonal(){
       int cnt = 0;
       for(int i=0; i<5; i++){
         if(bingoBoard[i][i] == 0){
           cnt++;
         }
       }

       if(cnt == 5){
         bingoCnt++;
       }
  }

    //반대각
    public static void OppositeDiagonal(){
      int cnt = 0;
      for(int i=0; i<5; i++){
        if(bingoBoard[i][4-i] == 0){
          cnt++;
        }
      }

      if(cnt == 5){
        bingoCnt++;
      }
    }

}
