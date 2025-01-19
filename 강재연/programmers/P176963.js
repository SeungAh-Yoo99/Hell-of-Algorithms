// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=javascript
// 시간: 1.43 ms
// 메모리: 36.9 MB

function solution(name, yearning, photo) {
    const result = [];
    photo.forEach((arr, i) => {
        let score = 0;
        // 배열별로 순회
        arr.forEach((pl, j) => {
            // 각 photo 배열의 사람이 name 배열에 있는지 확인
            const idx = name.indexOf(pl);
            // indexOf가 0 이상이라면 (-1이 아니라면) 추억점수 합산
            if(idx >= 0) score += yearning[idx];
        });
        // 결과 배열에 push
        result.push(score);
    });
    return result;
}
