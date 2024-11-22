// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12935?language=javascript
// 시간: 2.71ms
// 메모리: 43.3MB

function solution(arr) {
    const min = Math.min(...arr);
    arr = arr.filter(num => num !== min);
    
    return arr.length === 0 ? [-1] : arr;
}
