//문제 링크: https://www.acmicpc.net/problem/1326
//시간: 896ms
//메모리: 29112KB

let input = require('fs').readFileSync("/dev/stdin").toString().split("\n");

let N = Number(input[0]);
let bridge = input[1].split(" ").map(Number);
let [a, b] = input[2].split(" ").map(Number);

let visited = Array(N).fill(false);
let queue = [[a - 1, 0]];

while (queue.length) {
    let [index, step] = queue.shift();

    if (index + 1 === b) return console.log(step);

    if (!visited[index]) {
        visited[index] = true;
        let jump = bridge[index];

        // 왼쪽으로 점프
        for (let i = index - jump; i >= 0; i -= jump) {
            if (!visited[i]) queue.push([i, step + 1]);
        }

        // 오른쪽으로 점프
        for (let i = index + jump; i < N; i += jump) {
            if (!visited[i]) queue.push([i, step + 1]);
        }
    }
}

console.log(-1);

