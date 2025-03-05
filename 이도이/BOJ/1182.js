//문제 링크: https://www.acmicpc.net/problem/1182
//시간: 168ms
//메모리: 	9716KB

let input = require('fs').readFileSync("1182.javascript/index.txt").toString().split('\n');

let [N, S] = input[0].split(" ").map(Number);
let arr = input[1].split(" ").map(Number);

let result = 0;

const dfs = (index, sum) => {
    if(index === N) return;
    
    if(sum + arr[index] === S) result++;

    dfs(index + 1, sum);
    dfs(index + 1, sum + arr[index]);
}

dfs(0,0);
console.log(result);
