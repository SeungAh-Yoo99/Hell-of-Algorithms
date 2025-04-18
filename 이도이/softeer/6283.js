//문제 링크: https://softeer.ai/app/assessment/index.html?xid=289621&xsrfToken=FR9dpdmmmlCkMaU8XmMeHx8RaZE5pJwo&testType=practice
//시간: 0.038
//메모리: 6.82MB


const input = require("fs").readFileSync("/dev/stdin").toString().split(" ");
let ascArr = [1,2,3,4,5,6,7,8];
//오름차순 배열 스프레드 연산자 사용해서 복사하고 내림차순으로 정렬하기
let descArr = [...ascArr].sort((a,b) => b-a);

// ascArr의 모든 원소와 input의 모든 원소가 같은 값이면 true반환
let isAscArr = ascArr.every((x,i) => x == input[i]);

// descArr의 모든 원소와 input의 모든 원소가 같은 값이면 true반환
let isDescArr = descArr.every((x,i) => x == input[i]);

console.log(isAscArr ? "ascending" : isDescArr ? "descending" : "mixed")
