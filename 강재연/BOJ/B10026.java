//문제 링크: https://www.acmicpc.net/problem/10026
//시간: 76 ms
//메모리: 12724 KB

import java.io.*;
import java.util.*;

public class boj10026 {
	
	// 적록색약이 아닌 사람 배열 _RGB
	// 적록색약인 사람 배열 _AB

	static int N;
	static char[][] image_RGB; 
	static char[][] image_AB;
	static boolean[][] visited_RGB;
	static boolean[][] visited_AB;
	static int[] X = {0, 0, 1, -1};
	static int[] Y = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		image_RGB = new char[N][N];
		image_AB = new char[N][N];
		visited_RGB = new boolean[N][N];
		visited_AB = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			String line = br.readLine();
			for(int j=0; j<N; j++) {
				image_RGB[i][j] = line.charAt(j);
				image_AB[i][j] = (line.charAt(j) == 'B') ? 'B' : 'A'; // 적록색약은 R과 G를 구분하지 못하기 때문에 A와 B로 나누어서 입력처리
			}
		}
			
		int count_RGB = 0;
		int count_AB = 0;
		
		for (int i = 0; i < N; i++) {
	        for (int j = 0; j < N; j++) {
	        	// 전체 방문배열을 순회하면서 방문하지 않았다면 bfs로 색상구역 방문
	            if (!visited_RGB[i][j]) {
	                bfs(i,j, image_RGB, visited_RGB);
	                count_RGB++; // 구역 수 증가
	            }
	            
	            if (!visited_AB[i][j]) {
	                bfs(i,j, image_AB, visited_AB);
	                count_AB++;
	            }
	        }
	    }
		
		System.out.println(count_RGB + " " + count_AB);
		
	}
	
	static void bfs(int x, int y, char[][] image, boolean[][] visited) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x,y});
		visited[x][y] = true;
		char color = image[x][y]; // 입력 배열에서 색상 추출 
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			x = current[0];
			y = current[1];
			
			for(int i=0; i<4; i++) {
				int newX = x+X[i];
				int newY = y+Y[i];
				
				// x, y가 배열의 범위 이내이고, 방문하지 않았고, 시작점과 같은 색상인 경우만 탐색 => 한가지 구역
				if(newX >= 0 && newY >= 0 && newX < N && newY < N && !visited[newX][newY] &&  image[newX][newY] == color) {
					queue.add(new int[]{newX, newY});
					visited[newX][newY] = true;
				}	
			}
		}
	}
}
