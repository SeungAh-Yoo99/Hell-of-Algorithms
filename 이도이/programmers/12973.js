//문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/12973
//시간: 33.05ms
//메모리: 40MB

function solution(s)
{
    let arr = s.split('');
    let stack = [];

    arr.forEach((x,i) => {
        i>=1 && stack[stack.length-1]==x ? stack.pop() : stack.push(x)
    })
    
    return stack.length == 0 ? 1:0
}
