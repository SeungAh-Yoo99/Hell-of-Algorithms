//문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/43162
//시간: 0.82ms
//메모리: 33.8MB

let visited;
let arr;

function solution(n, computers) {
    visited = Array(n).fill(false);
    arr = computers;
    let result = 0;
   
    for(let i=0; i<n; i++){
        result += dfs(i);
    }
    
    return result;
}

const dfs = (start) => {
    if(visited[start]) return 0;
    else visited[start] = true;
    
    for(let j in arr[start]){
        if(arr[start][j] == 1){
            dfs(j)
        }
    }
        
    return 1;

 
//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43162
//시간: 0.49ms
//메모리: 33.8MB

function solution(n, computers) {
    let result = 0; 
    let visited = Array(n).fill(false);
    
    const bfs = (start) => {
        let queue = [start];
        visited[start] = true;
        
        while(queue.length){
            let node = queue.shift();
            
            for(let i=0; i<n; i++){
            if(computers[node][i] == 1 && computers[i][node] ==1 && !visited[i]){
                visited[i] = true;
                queue.push(i)
                }
            }
        }
    }
    
    for(let i=0; i<n; i++){
        if(!visited[i]){
            bfs(i)
            result++;
        }
    }
   
    
  
    return result;
    
}
