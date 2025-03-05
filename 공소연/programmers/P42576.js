// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=javascript
// 시간: 43.65ms
// 메모리: 68.3MB

function solution(participant, completion) {
    // reduce
    const cmap = completion.reduce((acc, cur) => {
        acc[cur] = (acc[cur] ? acc[cur] + 1 : 1);
        return acc;
    }, {})
    
    // using falsy
    return participant.find(cur => {
        if (cmap[cur]) cmap[cur] = cmap[cur] - 1;
        else return cur;
    })
}
