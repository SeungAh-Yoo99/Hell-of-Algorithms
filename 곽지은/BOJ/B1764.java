//문제링크 https://www.acmicpc.net/problem/1764
//시간 244ms
//메모리 26032KB


import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numN = Integer.parseInt(st.nextToken());
		int numM = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < numN; i++) {
			hash.put(br.readLine(), 1);
		}
		int count = 0;
		for(int i = 0; i < numM; i++) {
			String input = br.readLine();
			if(hash.get(input) != null) {
				list.add(input);
				count++;
			}
		}
		Collections.sort(list);
		sb.append(count).append("\n");
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
} 
