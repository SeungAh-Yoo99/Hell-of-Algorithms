//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12934
//시간: 0.03ms
//메모리: 33.4MB

function solution(n) {
  let num = Math.sqrt(n)
   return Number.isInteger(num) ? (num + 1)*(num + 1) : -1
}
