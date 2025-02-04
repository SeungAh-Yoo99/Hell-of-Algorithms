문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/12981
시간: 0.26ms
메모리: 33.5MB

function solution(n, words) {
     let result = [0,0],prevWord,idx = 0, wordsCopy = [];

     //words 배열에서 하나의 원소씩 순차적으로 가져옵니다.
     for(const word of words){    

        // 이전 단어의 마지막 알파벳과 현재 단어의 첫번째 알파벳이 다르고 
        // 이전 단어들을 넣어놓은 배열에 현재 단어가 존재하지 않는 경우의 idx값을 이용해 result배열을 수정합니다. 
        if(idx !== 0 && prevWord[prevWord.length-1] != word[0] || wordsCopy.includes(word)){
               result[0] = (idx+1)%n == 0 ? n : (idx+1)%n;            
               result[1] = Math.ceil((idx+1)/n);      
               break;
         }
         idx++;

         // 이전 단어들을 넣어놓은 배열
         wordsCopy.push(word)
         // 이전 단어 
         prevWord = word;
       }
    
    return result
}
