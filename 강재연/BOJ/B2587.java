//문제 링크: https://www.acmicpc.net/problem/2587
//시간: 64 ms
//메모리: 11496 KB

import java.io.*;
import java.util.*;

public class boj2587 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int avg = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i]; // 누적합
		}
		
		Arrays.sort(arr);
		
		System.out.println(avg/arr.length); // 평균 출력
		System.out.println(arr[2]); // 중간값 출력
		
	}
}
