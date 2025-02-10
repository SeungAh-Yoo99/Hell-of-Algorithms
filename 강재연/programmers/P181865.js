// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181865
// 시간: 0.07 ms
// 메모리: 33.4 MB

function solution(binomial) {
    const [a, x, b] = binomial.split(' ');
    switch(x){
        case '+' : return +a + +b;
        case '-' : return +a - +b;
        case '*' : return +a * +b;        
    }
}
