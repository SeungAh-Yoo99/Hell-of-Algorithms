// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181900
// 시간: 0.05 ms
// 메모리: 33.4 MB

function solution(my_string, indices) {
    const answer = [...my_string];
    indices.forEach((str) => {
        answer[str] = '';
    });
    
    return answer.join('');
}
