// 문제 링크: https://www.acmicpc.net/problem/15665
// 시간: 464 ms
// 메모리: 52208 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        numbers = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        numbers = Arrays.stream(numbers).distinct().toArray(); // 중복 제거

        n = numbers.length; // 중복 제거된 크기로 맞췄음

        Arrays.sort(numbers); // 그 다음 정렬

        backTracking(0,0, new int[m]); // 인덱스 값, 담은 값(선택한 숫자 갯수), 담은 수 배열 

        System.out.println(sb.toString());

    }

    private static void backTracking(int number, int cnt, int[] visitedNum) {

        if(cnt == m){ // 담을 갯수가 다 차면

            for (int i = 0; i < m; i++) {
                sb.append(visitedNum[i]).append(" "); // 담긴 숫자들 넣었음
            }

            sb.append("\n");

            return;
        }

        if(number == n){
            return; // 인덱스 값 오버하면 리턴
        }

        for (int i = number; i < n; i++) {
            visitedNum[cnt] = numbers[i]; // 배열에 숫자 담고
            backTracking(number,cnt+1, visitedNum); // 재귀 호출

        }


    }
}
