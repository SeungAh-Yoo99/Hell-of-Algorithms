//문제 링크 https://www.acmicpc.net/problem/10816
//시간 1196ms
//메모리 184540KB


import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numN = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < numN; i++) {
			int input = Integer.parseInt(st.nextToken());
			if(hash.get(input) == null) 
                hash.put(input, 1);
			else hash.put(input, hash.get(input) + 1);
		}
		int numM = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < numM; i++) {
			int input = Integer.parseInt(st.nextToken());
			if(hash.get(input) == null) 
                sb.append(0).append(" ");
			else sb.append(hash.get(input)).append(" ");
		}
		System.out.println(sb);
	}
}
