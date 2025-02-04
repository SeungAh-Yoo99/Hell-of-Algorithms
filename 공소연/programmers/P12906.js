// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=javascript
// 시간: 42.93ms
// 메모리: 83.4MB

function solution(arr)
{
    const answer = [];
    let lastSeen = null;
    
    arr.forEach(item => {
        if (item !== lastSeen) {
            answer.push(item);
        }
        lastSeen = item;
    })
    
    return answer;
}
