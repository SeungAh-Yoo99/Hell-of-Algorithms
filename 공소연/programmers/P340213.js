// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/340213
// 시간: 0.28ms
// 메모리: 33.6MB

function solution(video_len, pos, op_start, op_end, commands) {
    const video_len_sp = video_len.split(":");
    const pos_sp = pos.split(":");
    const op_start_sp = op_start.split(":");
    const op_end_sp = op_end.split(":");
    const video_len_m = Number(video_len_sp[0]) * 60 + Number(video_len_sp[1]);
    let pos_m = Number(pos_sp[0]) * 60 + Number(pos_sp[1]);
    const op_start_m = Number(op_start_sp[0]) * 60 + Number(op_start_sp[1]);
    const op_end_m = Number(op_end_sp[0]) * 60 + Number(op_end_sp[1]);
    
    commands.forEach(command => {
        if (pos_m >= op_start_m && pos_m < op_end_m) {
            pos_m = op_end_m; // 건너뛰기
        }
        
        if (command === "next") {
            if (pos_m + 10 > video_len_m) pos_m = video_len_m
            else pos_m += 10;
        } else if (command === "prev") {
            if (pos_m - 10 < 0) pos_m = 0;
            else pos_m -= 10;
        }
        
        if (pos_m >= op_start_m && pos_m < op_end_m) {
            pos_m = op_end_m; // 건너뛰기
        }
    })
    
    return String(Math.floor(pos_m / 60)).padStart(2, "0") 
        + ":" + String(pos_m % 60).padStart(2, "0");
}

// 예2 -> 명령어 실행하고 오프닝 건너뛰기
// 예2 -> 오프닝 건너뛰고 명령어 실행


// 10초 전으로 이동 - 10초 미만 -> 처음 위치
// 10초 후로 이동 - 남은 시간 10초 미만 -> 마지막 위치
// 오프닝 건너뛰기 - op_start ≤ 현재 재생 위치 ≤ op_end -> 오프닝이 끝나는 위치
