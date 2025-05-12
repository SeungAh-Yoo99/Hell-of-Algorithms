//문제 링크: https://www.acmicpc.net/problem/1004
//시간: 120ms
//메모리: 11624KB

let input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .split("\n");

let T = Number(input[0]);
let result = [];
let index = 2;
  for(let i=0; i<T; i++){

    let count = 0

    //출발, 도착지점
    let [startX, startY, arriveX, arriveY] = input[index-1].split(" ").map(Number);


    // 행성들 
    let plantsNum = input[index]
    for (let j = 1; j <= plantsNum; j++) {
      let [cx, cy, r] = input[index + j].split(" ").map(Number);

      if (
        (startX - cx) ** 2 + (startY - cy) ** 2 < r ** 2 &&
        (arriveX - cx) ** 2 + (arriveY - cy) ** 2 >= r ** 2
      ) {
        count++;
      }

      if (
        (startX - cx) ** 2 + (startY - cy) ** 2 >= r ** 2 &&
        (arriveX - cx) ** 2 + (arriveY - cy) ** 2 < r ** 2
      ) {
        count++;
      }
    }
    index = index + Number(input[index]) + 2;

    result.push(count);
  }

for(let i=0; i<result.length; i++){
    console.log(result[i]);
}



