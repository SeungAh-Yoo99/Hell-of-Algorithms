문제 링크: https://www.acmicpc.net/problem/1138
시간: 100ms
메모리: 9324KB

let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');

let n = input[0]
let arr = input[1].split(' ').map(Number);
let order = Array.from({length:n}, (_,i) => i+1)
let result = [];

for(let i = n-1; i>=0; i--){    
    result.splice(arr[i],0,order[i])
}

console.log(result.join(' '))

