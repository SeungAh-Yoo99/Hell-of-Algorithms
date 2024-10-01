package 김호철.BOJ;
// 문제 링크: https://www.acmicpc.net/problem/1449
// 시간: 68 ms
// 메모리: 11604 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 물이 새는 곳 수
        int l = Integer.parseInt(st.nextToken()); // 테이프 길이
        int count = 0 ;

        int temp = 0 ; // temp 까지 테이프가 칠해져 있다고 생각할 예정
                        // 정렬 을 한 뒤 낮은 숫자 순서로 확인 할 것이기 때문에

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; // 물이 새는 곳 위치 배열

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 정렬

        for(int i = 0 ; i<n; i++){
            if(temp<arr[i]){ // 만약 temp가 물이 새는 곳보다 낮으면
                count++; // 테이프 하나 추가
                temp = arr[i]+l-1; // 물 새는 곳에서 테이프 길이 -1 만큼 테이핑 처리 되있다고 생각
            }
        }
        System.out.println(count);
    }
}

