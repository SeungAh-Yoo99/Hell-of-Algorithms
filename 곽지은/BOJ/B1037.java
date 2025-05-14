//문제링크 https://www.acmicpc.net/problem/1037
//시간 100ms
//메모리 14396KB


import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		while(num-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			max = n > max ? n : max;
			min = n < min ? n : min;
		}
		System.out.println(max * min);
	}
}
