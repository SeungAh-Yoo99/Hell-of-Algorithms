//문제 링크: https://www.acmicpc.net/problem/11650
//시간: 756 ms
//메모리: 66596 KB

import java.io.*;
import java.util.*;

public class boj11650 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Integer[][] coord = new Integer[N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			coord[i][0] = Integer.parseInt(st.nextToken());
			coord[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(coord, new Comparator<>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// x좌표를 기준으로 오름차순 정렬
				if(o1[0].compareTo(o2[0]) != 0) {
					return o1[0].compareTo(o2[0]);
				}
				// y좌표를 기준으로 오름차순 정렬
				return o1[1].compareTo(o2[1]);
			}
			
		});
				
		for(int k=0; k<coord.length; k++) {
			sb.append(coord[k][0]).append(" ").append(coord[k][1]).append("\n");
		}
		
		System.out.println(sb);
	}

}
