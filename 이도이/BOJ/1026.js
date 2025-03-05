// 문제 링크: https://www.acmicpc.net/problem/1026
// 시간: 96ms
// 메모리: 9580KB

let input = require('fs').readFileSync('1026.javascript/index.txt').toString().split('\n');

// 입출력
let [n,...arr] = input;
arr = arr.map((x) => x.split(" "));

// 정답
let result = 0; 

// A의 배열의 작은 수 * B배열의 큰 수 차례대로 곱하기 위해 정렬
arr[0].sort((a,b) => a-b); // 오름차순
arr[1].sort((a,b) => b-a); // 내림차순

for(let i=0; i<arr[0].length; i++){
     result +=(arr[0][i] * arr[1][i])
}

console.log(result)
