//문제 링크: https://www.acmicpc.net/problem/1259
//시간: 60 ms
//메모리: 11332 KB

import java.io.*;

public class boj1259 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		// 맨 마지막에 의미없는 0 입력이 들어오므로 그때까지 반복
		while(Integer.parseInt(input) != 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(input).reverse();
			
			// input 값과 sb로 reverse한 값을 비교
			if(input.equals(sb.toString())) {
				System.out.println("yes");
			}else {
				System.out.println("no");				
			}
			
			// 다음줄 읽어들임
			input = br.readLine();
		}
	}

}
