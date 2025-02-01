// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12940
// 시간: 0.18ms
// 메모리: 33.4MB

function solution(n, m) {
    
    // 최대공약수
    let max = 0;
    for (let i = 1; i <= m; i++) {
        if (n % i === 0 && m % i === 0) max = Math.max(max, i);
    }
    
    // 최소공배수
    let min = (n * m) / max;
    
    return [max, min];
}
