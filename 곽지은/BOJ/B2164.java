//문제 링크 https://www.acmicpc.net/problem/2164
//시간 168ms
//메모리 53436KB


// 방법1) 큐 이용해서 풀기
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int numN = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1;i<=numN;i++) 
			queue.add(i);

		while(queue.size() > 1) {
			queue.poll();
			int reInsert = queue.poll();
			queue.add(reInsert);
		}
		System.out.println(queue.poll());
	}
}




//문제 링크 https://www.acmicpc.net/problem/2164
//시간 128ms
//메모리 18512KB


// 방법 2) 배열 인덱스
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int numN = Integer.parseInt(br.readLine());

		int[] q = new int[2 * numN];	  
		for(int i = 1; i <= numN; i++) {
			q[i] = i;
		}
		int prev_index = 1;
		int last_index = numN;
        
		while(numN-- > 1) {
			prev_index++;
			q[last_index + 1] = q[prev_index];
			prev_index++; last_index++;
		}
		System.out.println(q[prev_index]);
	}
 
}
