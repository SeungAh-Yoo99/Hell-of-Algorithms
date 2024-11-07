// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/176963
// 시간: 2.02ms
// 메모리: 37MB

function solution(name, yearning, photo) {
    const map = {};
    const answer = Array.from({length: photo.length}, () => 0);
    
    name.reduce((acc, cur, idx) => {
        map[cur] = yearning[idx];
        return acc
    }, {});
    
    photo.forEach((item, idx) => {
              item.forEach(person => {
                  !!map[person] && (answer[idx] += map[person])
        })
    })
    return answer;
}
