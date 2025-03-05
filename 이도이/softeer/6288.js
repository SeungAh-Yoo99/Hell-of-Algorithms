//문제 링크: https://softeer.ai/app/assessment/index.html?xid=313332&xsrfToken=AqT8LDWCcdgsAzdnka79luUY4CbVHtLB&testType=practice
//시간: 2.373초
//메모리: 238.94MB

let input = require('fs').readFileSync('/dev/stdin').toString().split("\n");
let arr = [];
let n = input[0].split(" ")
// 입력값 2차원 배열로 만들기 
for(let i=1; i<=n[1]; i++){
    arr.push(input[i].split(" "))
}
// 2차원 배열 인덱스값1 기준으로 내림차순으로 정렬
let sortedArr = arr.sort((a,b) => b[1] - a[1]);
let result = 0, m = 0; 
let weightBag = Number(n[0])

// 금고 무게가 0보다 클때까지 반복
while(weightBag > 0){
    if(weightBag > sortedArr[m][0]){
        result += sortedArr[m][0]*sortedArr[m][1]
    }else{
        result += weightBag*sortedArr[m][1]
    }
    weightBag -= sortedArr[m][0]
    m++;
}

console.log(result)
