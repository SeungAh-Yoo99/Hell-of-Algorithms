//문제 링크 https://www.acmicpc.net/problem/1003
//시간 100ms
//메모리 14076KB


import java.io.*;

public class Main {
	static int fibonacci0 = 0;
	static int fibonacci1 = 0;
	static int numN = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numN = Integer.parseInt(br.readLine());  
		for (int i = 0; i < numN; i++) {
			int n = Integer.parseInt(br.readLine());
			fibonacci(n);
			sb.append(fibonacci0).append(" ").append(fibonacci1).append("\n");
			fibonacci0 = 0;
			fibonacci1 = 0;
		}
		System.out.println(sb);
	}
    
	public static void fibonacci(int n) {	
		if (n == 0) {
			fibonacci0++;
			return;
		} else if (n == 1) {
			fibonacci1++;
			return;
		}

		int temp1 = 0;
		int temp2 = 1;
		int temp;

		for (int i = 1; i < n; i++) {
			temp = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp;
		}
		fibonacci0 = temp1;
		fibonacci1 = temp2;
	}
}
