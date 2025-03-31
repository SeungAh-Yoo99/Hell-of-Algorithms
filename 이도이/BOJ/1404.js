//문제 링크:https://www.acmicpc.net/problem/1404
//시간: 96ms
//메모리: 9352KB

let winRate = require("fs")
  .readFileSync("1404.js/index.txt")
  .toString()
  .split(" ")
  .map(Number)
  .map((x) => x / 100);;

let winProb = Array.from({length:8}, () => Array(8).fill(0))

let index = 0; 
for(let i=0; i<winProb.length; i++){
  for(let j=i+1; j<winProb.length; j++){
    winProb[i][j] = winRate[index];
    winProb[j][i] = 1 - winRate[index];
    index++;
  }
}

let dp = Array.from({ length: 4 }, () => Array(8).fill(0));
dp[0] = Array(8).fill(1);


for(let round=1; round<4; round++){
    let step = 1 << round;
    for(let i=0; i<8; i+=step){
      for(let j=i; j<i+step/2; j++){
        for(let k=i+step/2; k<i+step ; k++){
          dp[round][j] += dp[round-1][k] * dp[round-1][j] * winProb[j][k];
          dp[round][k] += dp[round-1][k] * dp[round-1][j] * winProb[k][j];
        }
      }
    }
}

console.log(dp[3].map((x) => x.toFixed(13)).join(" "));

