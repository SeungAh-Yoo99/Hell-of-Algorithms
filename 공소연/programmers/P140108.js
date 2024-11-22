// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/140108
// 시간: 2.36ms
// 메모리: 37.3MB

function solution(s) {
    let count = 0;
    let startIdx = 0;
    let [start, other] = [0, 0];
    
    Array.from(s).forEach((char, idx) => {
        if (char === s[startIdx]) {
            start++;
        } else {
            other++;
        }
        
        if (start === other) {
            startIdx = idx + 1;
            [start, other] = [0, 0];
            count++;
        }
    })
    
    if (start > 0) count++;
    
    return count;
}
