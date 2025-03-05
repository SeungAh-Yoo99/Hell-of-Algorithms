// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/340212
// 시간: 48.20ms
// 메모리: 134MB

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        return answer(diffs, times, limit);
    }
    
    int answer(int[] diffs, int[] times, long limit) {
        int start = 1;
        int end = 0;
        
        for (int diff : diffs) {
            if (diff > end) {
                end = diff;
            }
        }
        
        int mid = (start + end) / 2;
        long taken;
        while (start <= end) {
            mid = (start + end) / 2;
            taken = 0;
            for (int idx = 0; idx < diffs.length; idx++) {
                if (diffs[idx] > mid) {
                    taken += (diffs[idx] - mid) 
                        * (times[idx] + (idx - 1 >= 0 ? times[idx - 1] : 0))
                        + times[idx];
                } else {
                    taken += times[idx];
                }
            }
            
            // 레벨을 더 크게
            if (taken > limit) {
                start = mid + 1;
            } else {
                end = mid - 1; // 최솟값을 구해야하니까
            }
        }
        
        return end + 1;
    }
}

// diff <= level -> time_cur만큼의 시간
// diff > level -> (diff - level) * (time_cur + time_prev) + time_cur
// 모두 해결하기 위한 숙련도(level)의 최솟값
