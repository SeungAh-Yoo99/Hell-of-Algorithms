//문제 링크: https://www.acmicpc.net/problem/1427
//시간: 92 ms
//메모리: 12968 KB

import java.io.*;
import java.util.*;

public class boj1427 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String N = sc.next(); // 입력을 그냥 String으로 받고
		int[] number = new int [N.length()]; // 입력받은 숫자의 길이만큼 배열 선언
		
		for(int i=0; i<number.length; i++) {
			number[i] = Integer.parseInt(N.substring(i, i+1)); // 한자리씩 잘라서 배열에 삽입
		}
		// 오름차순 정렬
		Arrays.sort(number);
		
		StringBuilder sb = new StringBuilder();
		for(int n : number) sb.append(n); // 일단 순서대로 sb에 넣음
		// 그다음에 뒤집기
		sb.reverse();
		System.out.println(sb);
		
	}

}
