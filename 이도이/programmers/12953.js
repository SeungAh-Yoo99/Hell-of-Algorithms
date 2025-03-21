//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12953
//시간: 0.12ms
//메모리: 33.4MB

// 최소공배수 구하기 num1 * num2 / num1와num2의 최대공약수
function solution(arr) {   
    return arr.reduce((acc,x,i) => { return (acc*x)/gcd(acc,x) })
}

// 최대공약수 구하는 유클리트 호제법 
const gcd = (a,b) => {
     while(b !== 0){
         let temp = b;
         b = a%b;
         a = temp;
      } 
    return a   
}
