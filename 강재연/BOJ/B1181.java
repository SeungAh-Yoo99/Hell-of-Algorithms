//문제 링크: https://www.acmicpc.net/problem/1181
//시간: 392 ms
//메모리: 34632 KB

import java.io.*;
import java.util.*;

public class boj1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 중복된 단어는 제거해야 하므로 Set으로 입력받음
		Set<String> wordSet = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			wordSet.add(br.readLine());
		}
		
		// 정렬을 위해 ArrayList로 변환
		ArrayList<String> words = new ArrayList<>(wordSet);
		
		// 1. 길이가 짧은 것부터
		// 2. 길이가 같으면 사전 순으로
		words.sort((w1, w2) -> w1.length() != w2.length() ? w1.length() - w2.length() : w1.compareTo(w2));
		StringBuilder sb = new StringBuilder();
		for(String word : words) sb.append(word).append("\n");
		System.out.println(sb);
	}
}
