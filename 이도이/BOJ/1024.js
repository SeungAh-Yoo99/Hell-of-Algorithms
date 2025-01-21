문제 링크: https://www.acmicpc.net/problem/1024
시간: ms
메모리: KB

let input = require('fs').readFileSync('1024.javascript/index.txt').toString().split(" ").map(Number);
console.log(input);
let result = 0;

while(result != input[0]){
    let num = Math.round(input[0]/2);
    for(let i=0; i<input[1]; i++){
        result += input[i]
    }
}


