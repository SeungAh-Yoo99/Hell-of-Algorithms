문제 링크: https://www.acmicpc.net/problem/1459
시간: 100ms
메모리: 9592KB

let input = require('fs').readFileSync('/dev/stdin').toString().split(" ").map(Number);

let mixDiagonal = Math.min(input[0], input[1]);
let mixStraight = Math.abs(input[1] - input[0])

let one ;
if ((input[0] + input[1]) % 2 === 1) {
  one =(Math.max(input[0], input[1])-1) * input[3] + input[2];
} else {
  one = Math.max(input[0], input[1])*input[3];
}

let two = mixDiagonal*input[3] + mixStraight*input[2];

let three = input[2] * (input[0] + input[1]);

console.log(Math.min(one,two,three))

