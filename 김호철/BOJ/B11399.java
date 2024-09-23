package 김호철.BOJ;
// 문제 링크: https://www.acmicpc.net/problem/11399
// 시간: 72 ms
// 메모리: 11924 KB

//제일 짧은 대기 시간을 구해야 함으로, 걸리는 시간이 짧은 사람이 먼저 ATM출금을 해야한다.
//
//        1. 걸리는 시간을 배열로 저장
//        2. 배열을 짧은 순으로 정렬
//        3. 총 기다려야 하는 시간을 구해야 함으로 우선 배열을 순회하면서 대기시간들을 더한다.
//              1. 각 배열의 요소의 대기시간을 더해서 총 대기시간에 더한다.
//              2. 배열의 0번의 대기시간은 자기가 걸리는 시간만큼이 대기시간이다.
//              3. 배열의 1번은 0번의 대기시간 + 자기가 걸리는 시간만큼이 대기시간.
//              4. 이런식으로 총 대기시간을 구하면 된다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class B11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalWait = 0 ; //총 대기 시간

        int waitingTime=0; // 각각의 사람마다 대기시간 담을 변수

        int[] atm = new int[n];

        for(int i = 0 ; i<n;i++){
            atm[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(atm); // 오름차순 정렬

        for(int i = 0 ;i<n;i++){
            waitingTime += atm[i]; // 한 사람의 대기시간
            totalWait += waitingTime; // 총 대기시간에 더한다.
        }

        System.out.println(totalWait);
    }
}
