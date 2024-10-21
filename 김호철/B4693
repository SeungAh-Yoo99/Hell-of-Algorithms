문제 링크: https://www.acmicpc.net/problem/4963
시간: 96ms
메모리: 13416KB

// dfs 문제 복습 겸 풀어봤는데
// 흐름을 이해하니 코드도 더 간결하게 짤 수 있는것 같습니다!
// 문제 풀면서 구현만 하는게 아니고 더 편하게 풀려 노력해봤음다!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int w=-1,h,cnt;
    static int[][] island;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            cnt = 0;
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w==0){break;} //0 입력받으면 종료

            island = new int[h+2][w+2]; // 배열 가장 바깥쪽은 다 만들어 놓기만 하고
            visited = new boolean[h+2][w+2]; // 사용은 안 할 예정!(뿌듯)

            for(int i = 1 ; i<= h ; i++){
                st= new StringTokenizer(br.readLine());

                for(int j = 1 ; j <= w ; j++){
                    island[i][j] = Integer.parseInt(st.nextToken());
                }

            }

            for(int i = 1 ; i <= h ; i++){
                for(int j = 1 ; j <= w; j++){
                    if(island[i][j]==1 && !visited[i][j]){ // 방문 안했고, 섬이라면
                        dfs(i,j); //함수 호출
                        cnt++; // 구역 1 업
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;// 방문 처리
        for(int i = x-1; i <= x+1; i++){ // 9칸 다 순회하며 체크
            for(int j = y-1 ; j <= y+1; j++){ //(어짜피 자기 자신은 방문처리라서
                if(!visited[i][j] && island[i][j]==1){ // 예외 처리 안했음)
                    dfs(i,j);
                }
            }
        }
    }
}
