//문제 링크: https://www.acmicpc.net/problem/1080
//시간: 156ms
//메모리: 10168KB

let input = require('fs').readFileSync('1080.js/index.txt').toString().trim().split('\n');

let [N,M] = input[0].split(' ').map(Number)

let A = [];
let B = [];
for(let i=1; i<N+1; i++){ 
    let arr = input[i].trim().split("").map(Number);  
    A.push(arr);
}

for (let i = N+1; i < input.length; i++) {
  let arr = input[i].trim().split("").map(Number);  
  B.push(arr);
}

let count = 0;

const flip3X3 = (matrix, k,m) => {
  for(let i=0; i<3; i++){
    for(let j=0; j<3; j++){
        matrix[i + k][j + m] == 0
          ? (matrix[i + k][j + m] = 1)
          : (matrix[i+k][j+m] = 0);
    }
  }
}

for(let i=0; i<=N-3; i++){
  for(let j=0; j<=M-3; j++){
    if(A[i][j] !== B[i][j]){
       flip3X3(A,i,j);
       count++;
    }
  }
}

const isSame = (a,b) => {
    for(let i=0; i<a.length; i++){
        for(let j=0; j<a[0].length; j++){
            if(a[i][j] !== b[i][j]){
              return false;
            }
        }
    }


    return true;
}


console.log(isSame(A,B) ? count : -1 )


