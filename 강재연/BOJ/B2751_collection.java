//문제 링크: https://www.acmicpc.net/problem/2751
//시간: 2076 ms
//메모리: 156120 KB

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[T];
		for(int i=0; i<T; i++) {
      // T만큼의 고정배열에 삽입
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 리스트로 변환 후 정렬
		Collections.sort(Arrays.asList(arr));

		for(int a:arr) bw.write(a+"\n");
		bw.flush();
		bw.close();
	}

}
