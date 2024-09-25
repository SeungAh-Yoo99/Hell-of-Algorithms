문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
시간: ms
메모리: KB

class Solution {
    int[] dx = {0,0,-1,1};
    int[] dy = {-1,1,0,0};
    boolean[][] visited;
    int endX;
    int endY;
    int max = 10000;

    public int solution(int[][] maps) {   
        endX = maps.length-1;
        endY = maps.length[0]-1;
        
        dfs(0,0,1)
    }
    
    void dfs(int x, int y, int count){
        
        if(x==0 || y==0 || visited[x][y] || endX > x || endY > y){
            return;
         }
        
        result = Math.min( max,count)
        
        visited[x][y] = true;
        
        for(int=0; i<4; i++){
            dfs(x+X[i],y+Y[i],count+1)
        }
        
     }
}
