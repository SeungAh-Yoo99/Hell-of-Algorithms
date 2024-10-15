//문제 링크 https://www.acmicpc.net/problem/2869
//시간 104ms
//메모리 14108KB


import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
 
		int resultDay = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0)
			resultDay++;
		System.out.println(resultDay);
	}
}
