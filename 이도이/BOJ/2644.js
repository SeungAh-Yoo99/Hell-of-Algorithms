//문제 링크: https://www.acmicpc.net/problem/2644
//시간: 88ms
//메모리: 9372KB

let fs = require("fs")
  .readFileSync("2644.javascript/index.txt")
  .toString()
  .split("\n");

let n = parseInt(fs[0]);

//촌수를 계산할 두 사람
let [start, target] = fs[1].split(" ").map(Number);

let m = parseInt(fs[2]);

let graph = Array.from({length:n+1}, () => []);

//그래프 관계 입력
for(let i=0; i<m; i++){
    let [parent, child] = fs[i+3].split(" ").map(Number);
    graph[parent].push(child);
    graph[child].push(parent);
}

const bfs = (start, target) => {
    const visited = Array(n+1).fill(false);
    const queue = [[start,0]];
    visited[start] = true;

    while(queue.length){
        let [current, count] = queue.shift();

        //목표 타켓에 도달 시 촌수 반환
        if(current == target) return count;

        //현재 노드랑 연결된 노드 탐색
        for(let next of graph[current]){
            if(!visited[next]){
                visited[next] = true;
                queue.push([next, count+1]);
            }
        }
    }

    return -1;

}

console.log(bfs(start, target));



