//문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/12939
//시간: 0.12ms
//메모리: 33.4MB

function solution(s) {
    let sortedArr = s.split(" ").map(Number).sort((a,b) => a-b);
    return sortedArr[0] + " " + sortedArr[sortedArr.length-1]
}
