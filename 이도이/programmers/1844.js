//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844
//시간: 1.72ms
//메모리: 36.9MB

function solution(maps) {
     let n = maps.length;
     let m = maps[0].length;
     let dy = [-1,1,0,0];
     let dx = [0,0,-1,1];
     let visited = Array.from({length:n}, () => Array(m).fill(false));
     let minResult = Infinity;
    
    const dfs = (x,y,cnt) => {
        if(x == n-1 && y == m-1){
            minResult = Math.min(minResult,cnt)
            return;
        }
        for(let i=0; i<4; i++){
            let newX = x+dx[i];
            let newY = y+dy[i];
            if(newX >= 0 && newY >=0 && newX<n && newY<m && !visited[newX][newY] && maps[newX][newY] == 1){
                visited[newX][newY] = true;
                dfs(newX,newY,cnt+1)
                visited[newX][newY] = false;
            }
        }
    }   
    
    visited[0][0] = true; 
    dfs(0,0,1)
     
    return minResult == Infinity ? -1 : minResult
}
