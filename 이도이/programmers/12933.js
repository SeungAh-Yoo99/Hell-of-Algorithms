//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12933
//시간: 0.07ms
//메모리: 33.3MB

function solution(n) {
    return +n.toString().split("").sort((a,b) => b-a).join('')
}
