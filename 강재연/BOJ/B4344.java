// 문제 링크: https://www.acmicpc.net/problem/4344
// 시간: 140 ms
// 메모리: 15476 KB

package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj4344 {
	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력
		StringBuilder sb = new StringBuilder();
		
		// 총 테스트 케이스
		int C = Integer.parseInt(br.readLine());
		int[] arr;
		int avg;
		
		StringTokenizer st;
		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine());
			// 각 테스트 케이스 별 학생의 수 
			int T = Integer.parseInt(st.nextToken());
			arr = new int[T]; // 배열 초기화 
			avg = 0; // 평균 초기화 
			for(int j=0; j<T; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				avg += arr[j]; // 학생별 점수 누적
			}
			avg /= T; // 학생 수만큼 나눠서 평균 구함 
			
			// String.format 에서 "%.3f"를 쓸것이기 때문에 float 으로 선언
			float cnt = 0;
			for(int k=0; k<T; k++){
				// 점수가 평균 이상일때 cnt 증가
				if(arr[k] > avg) cnt++;
			}
			sb.append(String.format("%.3f", (cnt/T)*100)).append("%\n");
		}
		System.out.println(sb);
	}
}
