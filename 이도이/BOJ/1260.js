//문제 링크: https://www.acmicpc.net/problem/1260
//시간: 184ms
//메모리: 	16580KB

let input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");

let [N,M,V] = input[0].split(" ").map(Number);

let node = [];


for(let i=1; i<input.length; i++){
    node.push(input[i].split(" ").map(Number))
}

let graph = Array.from({length:N+1}, () => []);
node.forEach(([a,b]) => {
    graph[a].push(b);
    graph[b].push(a);
})


graph.forEach((arr) => arr.sort((a,b) => a-b));


const dfs = (start, visitedDFS, dfsResult) => {
  visitedDFS[start] = true;
  dfsResult.push(start);

  for (let next of graph[start]) {
    if (!visitedDFS[next]) {
      dfs(next, visitedDFS, dfsResult);
    }
  }
};


 let visitedDFS = Array(N + 1).fill(false);
  let dfsResult = [];
dfs(V, visitedDFS, dfsResult);


const bfs = (start) => {
    let queue = [start];
    let result = [];
    let visited = Array(N+1).fill(false);

       visited[start] = true;
    while (queue.length) {
      let v = queue.shift();
      result.push(v);

       for(let next of graph[v]){
           if(!visited[next]){
            visited[next] = true;
                queue.push(next);
           }
       }
     
    }
    
    return result;
}

const bfsResult = bfs(V);
console.log(dfsResult.join(" "));
console.log(bfsResult.join(" "));
