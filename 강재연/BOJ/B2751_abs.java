//문제 링크: https://www.acmicpc.net/problem/2751
//시간: 628 ms
//메모리: 129536 KB

import java.io.*;

public class boj2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		boolean[] abs = new boolean[2000001];
		
		
		for(int i=0; i<T; i++) {
			int index = Integer.parseInt(br.readLine()) + 1000000;
			abs[index] = true;
		}
		
		for(int j=0; j<abs.length; j++) {
			if(abs[j]) {
				bw.write(j-1000000 + "\n");
			}
		}

		bw.flush();
		bw.close();
	}
}
