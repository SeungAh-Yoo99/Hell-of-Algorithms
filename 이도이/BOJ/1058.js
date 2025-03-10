//문제 링크: https://www.acmicpc.net/problem/1058
//시간: 156ms 
//메모리: 9964KB

let input = require("fs").readFileSync("/dev/stdin").toString().split('\n');

let n = Number(input.shift());
input = input.map(x => x.split(""));

let max = 0;

input.forEach((x,i) => {
    let temp = [];

    x.forEach((k,idx) => {
        if(k === 'Y'){
             temp.push(idx);     
        }
    })
     
    let list = new Set(temp);
    temp.forEach((j) => {
      input[j].forEach((str, idn) => {
        if (str === "Y" && idn !== i) {
          list.add(idn);
        }
      });
    });

    
    max = Math.max(max, list.size);
})

console.log(max);
