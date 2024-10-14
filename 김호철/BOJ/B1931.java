package 김호철.BOJ;
// 문제 링크: https://www.acmicpc.net/problem/1931
// 시간: 788 -> 484 ms(정렬 리팩토링 해봤음)
// 메모리: 45888 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int point;
        int count = 1;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1]= Integer.parseInt(st.nextToken());
            //System.out.println(arr[i][0] +" "+ arr[i][1]); // 잘 들어가는거 확인
        }

        // TODO: 여기서 이차원 배열 정렬해야함
        Arrays.sort(arr,(o1, o2) ->{ // 이부분 검색해봤음
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];
            }
            return o1[1]-o2[1];
        });

        point = arr[0][1]; // 첫번째 회의의 끝나는 시간을 point로 설정

        for(int i = 1; i< n ; i++){

            if(arr[i][0]>=point){ // 회의 시작시간이 끝나는 시간보다 같거나 크면
                count++;
                point = arr[i][1]; // point에다가 이번 회의 끝나는 시간 대입
            }
        }
        System.out.println(count);
    }
}