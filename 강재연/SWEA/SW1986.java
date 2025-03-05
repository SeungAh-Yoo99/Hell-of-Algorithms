//문제 링크: https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PxmBqAe8DFAUq&categoryId=AV5PxmBqAe8DFAUq&categoryType=CODE&problemTitle=&orderBy=PASS_RATE&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1

import java.io.*;

public class sw1986 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int sum = 0;
			for(int j=1; j<=N; j++) {
				if(j%2 == 0) sum -= j;
				else sum += j;
			}
			sb.append("#"+(i+1)+" ").append(sum).append("\n");
		}
		System.out.println(sb);
	}

}
