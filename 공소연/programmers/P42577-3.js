// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=javascript
// 시간: 133.65ms
// 메모리: 79.6MB

function solution(phone_book) {
    const length = phone_book.length;
    
    return !phone_book.sort().some((cur, idx) => {
        if (idx === length - 1) return false;
        
        return phone_book[idx + 1].startsWith(cur);
    })
}
