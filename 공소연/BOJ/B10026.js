// 문제 링크: https://www.acmicpc.net/problem/10026
// 시간: 172ms
// 메모리: 11876KB

const input = require('fs').readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);

const map = [];
for (let i = 1; i <= n; i++) {
  map.push(input[i].split(''));
}

const visited = Array.from(Array(n), () => Array(n).fill(false));
const visitedAB = Array.from(Array(n), () => Array(n).fill(false));

const dx = [-1, 1, 0, 0];
const dy = [0, 0, -1, 1];

let nx, ny;
function dfs(x, y, color, isNormal) {
  if (isNormal) {
    if (map[x][y] == 'R') {
      map[x][y] = 'G'; // R을 G로 바꿈
    }
    visited[x][y] = true;
  } else {
    visitedAB[x][y] = true;
  }

  for (let i = 0; i < 4; i++) {
    nx = x + dx[i];
    ny = y + dy[i];

    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
    if (isNormal && visited[nx][ny]) continue;
    if (!isNormal && visitedAB[nx][ny]) continue;
    if (map[nx][ny] != color) continue;
    dfs(nx, ny, color, isNormal);
  }
}

// 적록색약이 아닌 사람이 봤을 때
let normal = 0;
for (let i = 0; i < n; i++) {
  for (let j = 0; j < n; j++) {
    if (!visited[i][j]) {
      dfs(i, j, map[i][j], true);
      normal++;
    }
  }
}

// 적록색약인 사람이 봤을 때 (R == G)
let abnormal = 0;
for (let i = 0; i < n; i++) {
  for (let j = 0; j < n; j++) {
    if (!visitedAB[i][j]) {
      dfs(i, j, map[i][j], false);
      abnormal++;
    }
  }
}

console.log(normal, abnormal)
