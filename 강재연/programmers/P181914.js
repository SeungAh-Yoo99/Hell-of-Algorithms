// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181914
// 시간: 4.19 ms
// 메모리: 33.4 MB

function solution(number) {
    let answer = 0;
    // +n을 하면 문자 → 숫자 변환 가능
    for(const n of number) answer += +n;
    return answer % 9;
}
