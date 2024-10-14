//문제 링크: https://www.acmicpc.net/problem/2751
//시간: 628 ms
//메모리: 129536 KB

import java.io.*;

public class boj2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		boolean[] abs = new boolean[2000001]; // 음수를 포함해서 1000000*2 크기의 배열 선언
		
		
		for(int i=0; i<T; i++) {
			// 입력값에 음수도 있기 때문에 + 1000000 
			int index = Integer.parseInt(br.readLine()) + 1000000;
			// 해당하는 인덱스값에 true 처리
			abs[index] = true;
		}
		
		for(int j=0; j<abs.length; j++) {
			// 해당 인덱스가 참일경우
			if(abs[j]) {
				// 배열에 넣을때 +1000000을 했기 때문에 
				// 출력할땐 -1000000
				bw.write(j-1000000 + "\n");
			}
		}

		bw.flush();
		bw.close();
	}
}
