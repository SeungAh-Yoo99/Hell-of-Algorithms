// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/161990
// 시간: 0.41ms
// 메모리: 33.7MB

function solution(wallpaper) {
    // lux === 가장 작은 i
    // luy === 가장 작은 j
    // rdx === 가장 큰 i + 1
    // rdy === 가장 큰 j + 1
    let lux = wallpaper.length;
    let luy = wallpaper[0].length;
    let rdx = 0;
    let rdy = 0;
    
    wallpaper.forEach((row, i) => {
        Array.from(row).forEach((space, j) => {
            if (space === "#") {
                lux = Math.min(lux, i);
                luy = Math.min(luy, j);
                rdx = Math.max(rdx, i + 1);
                rdy = Math.max(rdy, j + 1);
            }
        })
    })
    
    return [lux, luy, rdx, rdy];
}

// .#...
// ..#..
// ...#.
