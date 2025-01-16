// 문제링크: https://www.acmicpc.net/problem/2776
// 시간: 1312ms
// 메모리: 311632KB

let [T, ...input] = require("fs").readFileSync(0).toString().trim().split("\n");

let note1count,
  note1,
  note2count,
  note2,
  result = [];
for (let i = 0; i < T * 4; i += 4) {
  note1count = +input[i];
  note1 = new Set(input[i + 1].split(" ").map(Number));
  note2count = +input[i + 2];
  note2 = input[i + 3].split(" ").map(Number);
  note2.forEach((note) => {
    result.push(note1.has(note) ? 1 : 0);
  });
}

console.log(result.join("\n"));
