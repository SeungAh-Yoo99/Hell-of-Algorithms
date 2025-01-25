// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181912
// 시간: 0.80 ms
// 메모리: 35.6 MB

function solution(intStrs, k, s, l) {
    const answer = [];
    intStrs.forEach((int) => {
        const num = Number(int.slice(s,s+l));
        if(num > k) answer.push(num);
    });
    return answer;
}
