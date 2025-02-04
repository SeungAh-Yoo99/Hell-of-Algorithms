//문제 링크: https://www.acmicpc.net/problem/1003
//시간: 104ms
//메모리: 9760KB

let input = require("fs")
  .readFileSync("1003.javascript/index.txt")
  .toString()
  .trim()
  .split("\n");

let dp = Array.from({ length: 41 }, () => [0,0]);

dp[0] = [1,0];
dp[1] = [0,1];

for (let i = 2; i <= 40; i++) {
  dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
  dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
}

for (let i = 1; i < input.length; i++) {
  let x = Number(input[i]);
  console.log(dp[x].join(" "));
}
