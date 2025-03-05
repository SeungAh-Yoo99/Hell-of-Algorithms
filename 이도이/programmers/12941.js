//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12941
//시간:0.18ms
//메모리:33.5MB

function solution(A,B){
    A.sort((a,b) => a-b);
    B.sort((a,b) => b-a);
    return A.reduce((acc,x,i) =>  acc+(x * B[i]),0)
}

