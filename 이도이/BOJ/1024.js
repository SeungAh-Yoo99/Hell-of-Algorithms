//문제 링크: https://www.acmicpc.net/problem/1024
//시간: 96ms
//메모리: 9604KB

let input = require('fs').readFileSync('1024.javascript/index.txt').toString().split(" ").map(Number);
let sum = input[0];
let m = input[1];

const findResult = (sum, m) => {
  // 최소 길이부터 시작
  for (let i = m; i <= 100; i++) {

    // 수열의 첫 번째 정수 찾기
    const x = (sum - (i * (i - 1)) / 2) / i;

    if (x >= 0 && Number.isInteger(x)) {
      let arr = Array.from({ length: i }, (_, k) => x + k);
    
      return arr.join(" ");
    }
  }
  
  return -1;
};


console.log(findResult(sum,m));






