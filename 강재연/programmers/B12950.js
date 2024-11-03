// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12950
// 시간: 0.82 ms
// 메모리: 38.1 MB

function solution(arr1, arr2) {
    const answer = [];
    arr1.forEach(arr => {
        const num = [];
        arr.forEach(a => {
           num.push(a); 
        });
        answer.push(num);
    });
    
    arr2.forEach((arr, i) => {
        arr.forEach((a, j) => {
            answer[i][j] += a;
        });
    });
    return answer;
}
