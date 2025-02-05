문제 링크: https://softeer.ai/practice/6284
시간:0.196 초
메모리: 10.29 MB

let input = require('fs').readFileSync('/dev/stdin').toString().trim().split(" ").map(Number);

let [K,P,N] = input;
K = BigInt(K);
P = BigInt(P);
N = BigInt(N);

for(let i=0; i<N; i++){
    K *= P%BigInt(1000000007)
}

console.log(K.toString())
