// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42577
// 시간: 330.86ms
// 메모리: 93.3MB

function solution(phone_book) {
    let answer = true;
    const map = new Map();
    
    // 정렬을 해야 접두어를 먼저 map에 넣을 수 있음
    phone_book.sort((a, b) => a.length - b.length);

    map.set(phone_book[0]);
    
    for (let i = 1; i < phone_book.length; i++) {
        const cur = phone_book[i];
        for (let j = 1; j < cur.length; j++) {
            if (map.has(cur.slice(0, j))) {
                return false;
            } else {
                map.set(cur);
            }
        }
    }
    
    return answer;
}

// 접두어인 경우가 있으면 false;
// 아니면 true

// 1 <= phone_book 배열 길이 <= 100만
// 1 <= 각 전화번호의 길이 <= 20

// phone_book을 전화번호.길이를 기준으로 정렬
// 각 전화번호마다 전화번호.길이만큼 for문 돌리기
// 돌리면서 map.has()면 return false
// 아니라면 map.set(cur);
