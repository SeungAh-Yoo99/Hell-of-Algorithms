// 문제 링크: https://www.acmicpc.net/problem/10026
// 시간: 120ms
// 메모리: 13628KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static String[][] area;
    static boolean[][] visitedP, visitedDP;
    static int people=0,disabledPeople=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        area = new String[n][n];
        visitedP = new boolean[n][n]; //일반인
        visitedDP = new boolean[n][n]; //적록색약

        for(int i = 0 ; i < n; i++){
            String[] arr = br.readLine().split("");
            for(int j = 0 ; j < n ; j++){
                area[i][j] = arr[j];
            }
        }
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j < n ; j++){
                if(!visitedP[i][j]){ // 일반인 체크
                    dfsP(i,j);
                    people++;
                }
                if(!visitedDP[i][j]){ // 적록색약 체크
                    dfsDP(i,j);
                    disabledPeople++;
                }

            }
        }
        System.out.println(people + " " +disabledPeople);



    }

    private static void dfsP(int x, int y) {
        visitedP[x][y] = true;
        String color = area[x][y];
        // TODO: 상하좌우 탐색 후 같은 구역 설정 처리
        if(x>0){ // 상 체크
            if(area[x-1][y].equals(color)&& !visitedP[x-1][y]){
                dfsP(x-1,y);
            }
        }
        if(x<n-1){
            if(area[x+1][y].equals(color)&& !visitedP[x+1][y]){
                dfsP(x+1,y);
            }
        }
        if(y>0){
            if(area[x][y-1].equals(color)&& !visitedP[x][y-1])
                dfsP(x,y-1);
        }
        if(y<n-1){
            if(area[x][y+1].equals(color)&& !visitedP[x][y+1])
                dfsP(x,y+1);
        }
    }

    private static void dfsDP(int x, int y) {
        visitedDP[x][y] = true;
        String color = area[x][y];
        if(!color.equals("B")){ // 파란색이 아니라면
            color = "RG"; // 빨초로 설정
        }
        // TODO: 상하좌우 탐색 후 같은 구역 설정 처리
        if(x>0){ // 상 체크
            if(color.contains(area[x-1][y])&& !visitedDP[x-1][y]){
                dfsDP(x-1,y);
            }
        }
        if(x<n-1){
            if(color.contains(area[x+1][y])&& !visitedDP[x+1][y]){
                dfsDP(x+1,y);
            }
        }
        if(y>0){
            if(color.contains(area[x][y-1])&& !visitedDP[x][y-1])
                dfsDP(x,y-1);
        }
        if(y<n-1){
            if(color.contains(area[x][y+1])&& !visitedDP[x][y+1])
                dfsDP(x,y+1);
        }
    }
}
