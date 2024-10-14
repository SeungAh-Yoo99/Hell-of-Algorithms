// 문제 링크: https://www.acmicpc.net/problem/11047
// 시간: 64 ms
// 메모리: 11592 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());//동전 종류
        int k = Integer.parseInt(st.nextToken()); //목표 금액
        int count = 0; // 동전 갯수
        int temp = 0; // 한 번에 뺄 동전 갯수 담을 변수

        int[] coins = new int[n]; //코인들 담을 배열

        for(int i = 0 ; i< n ; i++){
            coins[i]= Integer.parseInt(br.readLine());
        }

        for(int i = n-1;i>=0;i--){ //제일 큰 동전부터 확인
            if(k==0) break; //탈출 조건 - 금액이 딱 맞게 떨어졌을 때 탈출

            

            if(k >= coins[i]){
                temp = k / coins[i]; // 동전이 몇 개 까지 들어갈지 확인
                count += temp; // 들어가는 동전 만큼 갯수 추가

                k -= temp * coins[i]; // 동전 금액 만큼 목표금액에서 뺐음
            }
        }

        System.out.println(count);
    }
}
