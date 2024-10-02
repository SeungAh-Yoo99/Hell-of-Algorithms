//문제 링크: https://www.acmicpc.net/problem/1049
//시간: 64 ms
//메모리: 11648 KB

import java.io.*;
import java.util.*;

public class boj1049 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] pack = new int[M]; // 패키지 배열
		int[] once = new int[M]; // 낱개 배열 
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			pack[i] = Integer.parseInt(st.nextToken());
			once[i] = Integer.parseInt(st.nextToken());
		}
		
		// 최솟값을 구하는거니까 오름차순 정렬 
		Arrays.sort(pack);
		Arrays.sort(once);
		
		// 패키지로 전부 살 경우에 필요한 수량
		int share = (int) Math.ceil((N/6.0));
		
		// 최솟값 구하기
		// 1. 패키지로 전부 사기
		// 2. 낱개로 전부 사기
		// 3. 패키지랑 낱개 섞어사기
		
		// 각 패키지, 낱개별 배열이 정렬되어있기 때문에 경우의 수 별로 0번째 인덱스 값만 비교하면 됨
		int minimum = Math.min(Math.min(share * pack[0], N * once[0]), ((N/6) * pack[0]) + ((N%6) * once[0]));
		System.out.println(minimum);
		
	}

}
