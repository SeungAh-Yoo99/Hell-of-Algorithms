//문제 링크:https://www.acmicpc.net/problem/10026
//시간: 128ms
//메모리: 10864KB

let fs = require("fs").readFileSync("10026.javascript/index.txt").toString().split("\n");

let n = parseInt(fs[0]);
let visitedNomal = Array.from({ length: n }, () => Array(n).fill(false));
let visitedRG = Array.from({ length: n }, () => Array(n).fill(false));
let graph = Array.from({length: n}, () => []);
let countNomal = 0; 
let countRg = 0; 
//상하좌우
let dx = [-1,1,0,0];
let dy = [0,0,-1,1];


for(let i=0; i<n; i++){
    graph[i] = fs[i+1].split("");
}

const bfs = (x,y,visited, isRg) => {
    let queue = [[x,y]];
    visited[x][y] = true;
    let color = graph[x][y];
    
    while(queue.length){
        let [curX, curY] = queue.shift();

        for(let i=0; i<4; i++){
            newX = curX + dx[i];
            newY = curY + dy[i];            
            
            // dx, dy에서 설정한 범위에서 순회할 수 있는 범위 찾기 
            if ( newX >= 0 && newX < n && newY >= 0 && newY < n  && !visited[newX][newY]) {
                let newColor = graph[newX][newY];

                // 적록색약 구역은 따로 구하기 
                if (
                  isRg &&
                  (color == newColor ||
                    ((color === "R" || color === "G") &&
                      (newColor === "R" || newColor === "G")))
                ) {
                    visited[newX][newY] = true;
                    queue.push([newX , newY]);
                }

                if (!isRg && color == newColor) {
                    visited[newX][newY] = true;
                    queue.push([newX, newY]);
                }

            }
        }
    }
}

//일반 사람 bfs탐색
for(let i=0; i<n; i++){
    for(let j=0; j<n; j++){
        if(!visitedNomal[i][j]){
            bfs(i,j,visitedNomal,false)
            countNomal++;
        }    
    }
}
//적록색약 bfs탐색
for (let i = 0; i < n; i++) {
  for (let j = 0; j < n; j++) {
    if (!visitedRG[i][j]) {
      bfs(i, j, visitedRG, true);
      countRg++;
    }
  }
}

console.log(countNomal, countRg);


