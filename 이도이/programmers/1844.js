//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=javascript
//시간: 0.27ms
//메모리: 33.3MB

function solution(maps) {
     let n = maps.length;
     let m = maps[0].length;
     let visited = Array.from({length:n}, () => Array(m).fill(false));
     let dy = [-1,1,0,0];
     let dx = [0,0,-1,1];
    
     visited[0][0] = true;
     let queue = [[0,0,1]];
     
     while(queue.length){
         let [x,y,cnt] = queue.shift();
         
         if(x==n-1 && y==m-1) return cnt;
         
         for(let i=0; i<4; i++){
             let j = x+dx[i];
             let k = y+dy[i];
             if( j >= 0 && k >=0 && j < n && k <m && !visited[j][k] && maps[j][k] == 1 ){
                 visited[j][k] = true;
                 queue.push([j,k,cnt+1]);
             }
         }
               
     }
    
    return -1;

}
