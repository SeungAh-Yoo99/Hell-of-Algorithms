// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42578
// 시간: 0.31ms
// 메모리: 33.6MB

/** 
 * @param {[string, string][]} clothes - [의상 이름, 의상 종류]가 담긴 배열
 * @returns {number} - 서로 다른 옷의 조합의 수
 */
function solution(clothes) {
    const map = new Map();
    clothes.forEach(item => map.set(item[1], (map.get(item[1]) || 1) + 1));
    return Array.from(map.values()).reduce((acc, cur) => acc * cur, 1) - 1;
}

// 매일 다른 조합 옷 (다른 의상이 겹치지 않거나, 의상을 추가로 더 착용)
// 각 종류 별 최대 1가지 의상만 착용
// 최소 1개 의상

// 서로 다른 옷의 조합의 수 return
// map.get(의상종류1)*map.get(의상종류2)*...
