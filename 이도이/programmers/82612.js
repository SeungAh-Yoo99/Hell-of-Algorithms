//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/82612
//시간: 0.12ms
//메모리: 33.4MB

function solution(price, money, count) {
    let sum = 0, answer = 0;
   for(let i=1; i<=count; i++){
        sum += price
        answer += sum
     }    

    return answer-money > 0 ? answer-money : 0
}
