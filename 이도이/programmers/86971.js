//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86971#
//시간: 34.97ms
//메모리: 38.2MB

function solution(n, wires) {
    let graph = Array.from({length:n+1}, () => []);
    wires.forEach(([a,b]) => {
        graph[a].push(b);
        graph[b].push(a);
    })
    
    let visited = Array(n+1).fill(false);
    
    let count;
    const dfs = (start,last) => {
        visited[start] = true;
        count++;
        for(let next of graph[start]){
           if(!visited[next]){
               if(next !== last){
                    dfs(next,last)
               }
                
           }
        }
        
        return count;
    }
    
    let result = Infinity;
    for(let [x,y] of wires){
        count = 0;
        let one = dfs(x,y);
        count = 0; 
        let two = dfs(y,x);
        console.log([x,y],one,two)
         visited.fill(false);
        result = Math.min(Math.abs(one-two), result);
    }
    
    return result;
    
  
  
}

