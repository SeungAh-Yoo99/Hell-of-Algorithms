// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12919
// 시간: 0.05 ms
// 메모리: 33.5 MB

function solution(seoul) {
    const idx = seoul.findIndex( s => s == 'Kim');
    return "김서방은 " + idx + "에 있다"
}
