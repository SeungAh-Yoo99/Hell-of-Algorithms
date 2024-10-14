문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
시간:0.43ms
메모리:76MB

class Solution {
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    boolean[][] visited;
    int endX;
    int endY;
    int max = 10000;
    int[][] copyMap;

    public int solution(int[][] maps) {   
        int answer = 0; 
        visited = new boolean[maps.length][maps[0].length];
        endX = maps.length-1;
        endY = maps[0].length-1;
        copyMap = maps;
      
        dfs(0,0,1);
            
        answer = max == 10000 ? -1 :  max;
        return answer;
    }

    void dfs(int x, int y, int count){
        
        // 도착지점일 때 count값 비교해서 가장 작은 값 return
        if(endX == x && endY == y){
            max = Math.min(max,count);
            return;
        }
        
        // maps의 범위를 벗어났거나 이미 방문한 곳은 제외
        if(x<0 || y<0 || endX < x || endY < y || visited[x][y] || copyMap[x][y] == 0){
            return;
         }

        // 방문한 좌표 
        visited[x][y] = true;

        // 상하좌우로 사방 탐색
        for(int i=0; i<4; i++){
            dfs(x+dx[i],y+dy[i],count+1);
        }
        
        // 현재 방문했던 좌표를 다시 풀어줘서 다른 경로를 탐색할 수 있도록 하기 
        visited[x][y] = false;

     }
}
