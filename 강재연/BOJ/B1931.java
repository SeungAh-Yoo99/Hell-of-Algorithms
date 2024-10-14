import java.io.*;
import java.util.*;

//문제 링크: https://www.acmicpc.net/problem/1931
//시간: 528 ms
//메모리: 46404 KB

public class boj1931 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] office = new int[N][2];
		
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			office[i][0] = Integer.parseInt(st.nextToken());
			office[i][1] = Integer.parseInt(st.nextToken());
		}
		
        Arrays.sort(office, (a, b) -> {
        	// 끝나는 시간을 기준으로 오름차순 정렬
        	int comp = Integer.compare(a[1], b[1]);
        	if(comp != 0) return comp;
        	
        	// 만약 끝나는 시간이 같으면 시작하는 시간 기준으로 오름차순 정렬
        	return Integer.compare(a[0], b[0]);
        });
		
        int cnt = 1;
        int end = office[0][1]; // 첫 회의가 끝나는 시간
        
        for(int j=1; j<office.length; j++) {
        	// 다음 회의가 시작하는 시간이 이전 회의가 끝나는 시간보다 같거나 트면 
        	if(end <= office[j][0]) {
        		cnt++; // 사용횟수 증가
        		end = office[j][1]; // 회의 끝나는 시간 갱신
        	}
        }
        System.out.println(cnt);
	}
}
