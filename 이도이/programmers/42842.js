//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42842
//시간: 0.24ms
//메모리: 33.5MB

function solution(brown, yellow) {
    let a,result = [];
    for(let i=1; i<=yellow; i++){
        a = yellow/i
        if(2*(a+i)+4 == brown){
            result[0] = a+2;
            result[1] = i+2;
            break;
        }
    }
    
    return result
    
}
