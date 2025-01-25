//문제 링크: https://www.acmicpc.net/problem/1254
//시간: 96ms
//메모리: 9424KB

let input = require('fs').readFileSync('/dev/stdin').toString().trim();
let n = input.length;
let wordReverse,word;
let count = 0

for (let i = 1; i <= n; i++) {
  wordReverse = [...input].slice(-i).reverse();
  word = [...input].slice(-i);
  if (wordReverse.join("") == word.join("")) {
    count = wordReverse.length;
  }
}

console.log(n + n - count);
