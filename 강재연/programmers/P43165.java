// 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=java
// 시간: 10.17ms
// 메모리: 79.6MB

class Solution {
    int cnt = 0;
    int[] _numbers;
    int _target;
    
    public int solution(int[] numbers, int target) {
        // 입력을 전역변수에 할당 
        _numbers = numbers;
        _target = target;
        
        targetNumber(0,0);
        return cnt;
    }
    
    public void targetNumber(int index, int sum){
        // index가 배열의 끝에 닿으면 재귀에서 벗어남
        if(index == _numbers.length){
            // 그렇게 끝까지 갔을때 _target과 sum이 같으면 cnt 증가
        	if(sum == _target) {
        		cnt ++;	
        	}
            return;
        }
        
        // 누적합을 구하되 다음 index 값을 더하는 경우와 빼는 경우로 분기를 나눔
        targetNumber(index + 1, sum + _numbers[index]);
        targetNumber(index + 1, sum - _numbers[index]);
    }
}
