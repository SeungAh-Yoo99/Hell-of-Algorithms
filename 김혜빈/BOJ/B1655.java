package 김혜빈.BOJ;

import java.io.*;
import java.util.*;

public class B1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 정수의 개수
        Queue<Integer> min = new PriorityQueue<>(Collections.reverseOrder()); // 중간값보다 작은 수를 넣는 힙
        Queue<Integer> max = new PriorityQueue<>(); // 중간값보다 큰 수를 넣는 힙

        int mid = Integer.parseInt(br.readLine()); // 중간값을 1번째 입력값으로 초기화
        sb.append(mid).append("\n"); // 현재 무조건 중간값이므로 출력

        for(int i=1; i<N; i++) {
            int input = Integer.parseInt(br.readLine());
            /* 현재 수의 개수가 홀수인 경우와 짝수인 경우를 구분 */
            if(min.size() == max.size()) { // 홀수
                if(mid < input) max.add(input); // 입력값이 중간값보다 크면 중간값은 유지되고 입력값만 max에 추가
                else { // 입력값이 중간값보다 작으면 mid는 max에 추가되고 min 중 가장 큰 수가 mid가 된다
                    min.add(input);
                    max.add(mid);
                    mid = min.poll();
                }
            } else { // 짝수
                // 두 힙 크기가 다른 경우는 무조건 max 가 더 크다. 중간값은 가운데 중 작은 경우가 되기 때문
                if(mid > input) min.add(input); // 입력값이 중간값보다 작은 경우 중간값은 유지되고 입력값만 min에 추가
                else { // 입력값이 중간값보다 크면 mid는 min에 추가되고 max 중 가장 작은 수가 mid가 된다
                    min.add(mid);
                    max.add(input);
                    mid = max.poll();
                }
            }
            sb.append(mid).append("\n");
        }

        bw.append(sb.toString());
        bw.close();
    }
}
