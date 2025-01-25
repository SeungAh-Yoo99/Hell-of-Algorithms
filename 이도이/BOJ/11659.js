//문제 링크: https://www.acmicpc.net/problem/11659
//시간: 3756ms
//메모리: 43488KB

let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");


let [a,b] = input[0].split(" ").map(Number);

let array = input[1].split(" ").map(Number);

let prefixSum = [0]; // 0번째는 0으로 시작
for (let i = 0; i < a; i++) {
  prefixSum[i + 1] = prefixSum[i] + array[i]; // 누적합 계산
}

// end까지 누적합 - start이전의 누적합 
for(let i=0; i<b; i++){
    let [start, end] = input[i+2].split(" ").map(Number);
    console.log(prefixSum[end]-prefixSum[start-1]);
}
