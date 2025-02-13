// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/142086?language=javascript
// 시간: 4.00ms
// 메모리: 37.9MB

function solution(s) {
    const map = {}
    return Array.from(s).map((c, idx) => {
        if (map[c]) {
            map[c] = [idx, idx - map[c][0]];
        } else {
            map[c] = [idx, -1]
        }
        return map[c][1];
    });
}
