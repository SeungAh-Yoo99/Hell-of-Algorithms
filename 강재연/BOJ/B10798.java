//문제 링크: https://www.acmicpc.net/problem/10798
//시간: 68 ms
//메모리: 11508 KB

import java.io.*;

public class boj10798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] text = new char[15][5];
		
		for(int i=0; i<5; i++) {
			char[] line = br.readLine().toCharArray();
			for(int j=0; j<line.length; j++) {
				// 세로로 배열에 넣음
				text[j][i] = line[j];
			}			
		}
		
		// 가로로 배열 순회 
		for(int i=0; i<15; i++) {
			for(char c:text[i]) {
				// 공백이 아닐 경우에만 sb에 append
				if(c != ' ' && c != '\0') {
					sb.append(c);
				}
			}
		}
		
		System.out.println(sb);
	}

}
