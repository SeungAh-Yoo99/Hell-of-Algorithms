문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/12981
시간: 0.26ms
메모리: 33.5MB

function solution(n, words) {
     let result = [0,0],prevWord,idx = 0, wordsCopy = [];
     for(const word of words){    
        if(idx !== 0 && prevWord[prevWord.length-1] != word[0] || wordsCopy.includes(word)){
               result[0] = (idx+1)%n == 0 ? n : (idx+1)%n;            
               result[1] = Math.ceil((idx+1)/n);      
               break;
         }
         idx++;
         wordsCopy.push(word)
         prevWord = word;
       }
    
    return result
}
