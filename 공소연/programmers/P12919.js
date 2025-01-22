// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12919
// 시간: 0.06ms
// 메모리: 33.4MB

function solution(seoul) {
    for (let i = 0; i < seoul.length; i++) {
        if (seoul[i] === "Kim") return "김서방은 " + i + "에 있다"
    }
}
