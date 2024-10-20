//문제 링크: https://www.acmicpc.net/problem/2164
//시간: 144 ms
//메모리: 44292 KB

import java.io.*;
import java.util.*;

public class boj2164 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		// 큐의 사이즈가 2이상일때까지 반복 
		while(queue.size() > 1) {
			// 제일 위에 있는 카드를 버림
			queue.remove();
			// 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮김 
			queue.add(queue.remove());
		}
		// 마지막에 남게 되는 카드 출력 
		System.out.println(queue.remove());
	}

}
