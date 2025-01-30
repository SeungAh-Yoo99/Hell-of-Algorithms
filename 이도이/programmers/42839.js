//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42839#
//시간: 4.32ms
//메모리:37.8MB

function solution(numbers) {
    let result = 0; 
    let num = [];

    const totalMix = (current, remain) => {
        if(current.length > 0){
            num.push(Number(current))
        }
        
        for(let i=0; i<remain.length; i++){
            totalMix(current + remain[i], remain.slice(0,i) + remain.slice(i+1))
        }
    }
    
    totalMix("",numbers)
    
    let numCopy = [...new Set(num)];
    
   
    for(let i=0; i<numCopy.length; i++){
        let isPrime = true;
  
        if(numCopy[i] < 2) continue;
        for(let j=2; j<=Math.sqrt(numCopy[i]); j++){
            if(numCopy[i]%j==0 ) {
                isPrime = false;
                break;
            }
        }
        if( isPrime) result++;
    }

    
    return result
}
