//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12947
//시간: 0.05ms
//메모리: 33.4MB

function solution(x) {    
    let numArr = x.toString().split("").map(Number);
    return x%numArr.reduce((acc,x) => x+acc) == 0 ? true : false
}
