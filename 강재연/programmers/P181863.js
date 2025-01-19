// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181863
// 시간: 0.05ms
// 메모리: 33.4MB

function solution(rny_string) {
    const answer = [...rny_string];
    answer.forEach((txt,i)=>{
        if(txt == 'm'){
            answer[i] = 'rn';
        }
    });
    return answer.join('');
}
