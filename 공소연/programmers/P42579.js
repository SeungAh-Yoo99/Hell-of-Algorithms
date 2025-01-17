// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42579
// 시간: 0.36ms
// 메모리: 33.7MB

function solution(genres, plays) {
    const album = [];
    const map = {}; // map[장르] = [[재생횟수1, i], [재생횟수2, i]];
    const sum = []; // [[총재생횟수1, 장르1], [총재생횟수2, 장르2]]
    
    for (let i = 0; i < genres.length; i++) {
        if (!map[genres[i]]) {
            map[genres[i]] = [];
        }
        map[genres[i]].push([plays[i], i]);
    }
    
    for (let key of Object.keys(map)) {
        // 장르마다 재생횟수 내림차로 정렬
        map[key].sort((a, b) => {
            if (a[0] === b[0]) return a[1] - b[1];
            return b[0] - a[0];
        })
        // 장르별 총 재생횟수 구하기
        sum.push([map[key].reduce((acc, cur) => acc + cur[0], 0), key]);
    }
    
    // sum 총 재생횟수 내림차로 정렬 & 앨범에 집어넣기
    sum.sort((a, b) => b[0] - a[0]).forEach(item => {
        const key = item[1];
        const song = map[key];
        for (let i = 0; i < Math.min(2, song.length); i++) {
            album.push(song[i][1]);
        }
    })

    return album;
}

// 장르 별 가장 많이 재생된 노래 2개씩 모아, 베스트 앨범 출시

// 1. 많이 재생된 장르를 먼저 담음
// 2. 장르 내에서 재생 횟수가 높은 노래를 먼저 수록
// 3. 장르 내 재생 횟수가 같으면 i가 작은 노래를 먼저 수록

// map[장르] = [[재생횟수1, i], [재생횟수2, i]]
