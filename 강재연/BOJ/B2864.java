//문제 링크: https://www.acmicpc.net/problem/2864
//시간: 68 ms
//메모리: 11688 KB

import java.io.*;
import java.util.*;

public class boj2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		System.out.println(minimum(A, B) + " " + maximum(A, B));
	}
	
	// 모든 6을 5로 바꾸고 A+B 반환
	public static int minimum(String a, String b) {
		int A = Integer.parseInt(a.replaceAll("6", "5"));
		int B = Integer.parseInt(b.replaceAll("6", "5"));
		return A+B;
	}

	// 모든 5을 6로 바꾸고 A+B 반환
	public static int maximum(String a, String b) {
		int A = Integer.parseInt(a.replaceAll("5", "6"));
		int B = Integer.parseInt(b.replaceAll("5", "6"));
		return A+B;
	}

}
