// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181893
// 시간: 0.50 ms
// 메모리: 34.2 MB

function solution(arr, query) {
    query.forEach((value, i)=>{
        if(i%2 ==0) {
            arr.splice(value+1);
        }else{
            arr.splice(0,value);
        }
    });
    return arr;
}
