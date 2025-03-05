// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86051
// 시간: 0.08ms
// 메모리: 33.5MB

function solution(numbers) {
    let answer = 0;
    [1,2,3,4,5,6,7,8,9].forEach(num => !numbers.includes(num) && (answer += num));
    return answer;
}
