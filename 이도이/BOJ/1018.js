//문제 링크: https://www.acmicpc.net/problem/1018
//시간: 176ms
//메모리: 11516KB

let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

let [size, ...board] = input;
let [row, col] = size.split(" ");
board = board.map((x) => x.split(""));
let answer = [];

const white = [
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
];

const black = [
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
];

//흰색 먼저인 체스판
const whiteFrist = (x,y) => {
    let count = 0;
    for(let i=0; i<8; i++){
        for(let j=0; j<8; j++){
            if (white[i][j] != board[x + i][y + j]) {
              count++;
            }
        }
    }

    return count;
}

//검정색 먼저인 체스판
const blackFrist = (x,y) => {
  let count = 0;
  for (let i = 0; i < 8; i++) {
    for (let j = 0; j < 8; j++) {
      if (black[i][j] != board[x + i][y + j]) {
        count++;
      }
    }
  }

  return count;
};

//보드의 전체 행과 열의 길이에서 7을 빼줘야 체스크기에 맞음 
for(let i=0; i<row-7; i++){
    for(let j=0; j<col-7; j++){
        answer.push(whiteFrist(i,j));
        answer.push(blackFrist(i,j));
    }
}

//answer배열에서 최솟값 구하기 
console.log(Math.min(...answer));
