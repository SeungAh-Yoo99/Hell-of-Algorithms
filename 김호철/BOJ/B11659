// 문제 링크: https://www.acmicpc.net/problem/11659
// 시간: 484 ms
// 메모리: 56414 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
        
		int[] arr = new int[n + 1]; //0번 비워놓고 시작 예정
		arr[0] = 0;
        
		StringBuilder sb = new StringBuilder(); //출력 여러번이니 빌더 사용

		st = new StringTokenizer(br.readLine());
        
		for(int i = 1; i <= n; i++) {			
			arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int startNumber = Integer.parseInt(st.nextToken());
			int endNumber = Integer.parseInt(st.nextToken());
			sb.append(arr[endNumber] - arr[startNumber - 1]).append("\n");
		}
		System.out.println(sb);
	}

}
