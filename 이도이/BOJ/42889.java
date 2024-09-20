문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/42889?language=java
시간: ms
메모리: KB

class Solution {
    public int solution(int N, int[] stages) {
        int[] result = new int[N];
        int[] array = new int[stages.length-1];
        for(int i=0; i<stages.length; i++){
            array[stages[i]-1]++;
        }
        
        for(int i=0; i<array.length-1; i++){
           array[i] = array[i]/(stages.length-array[i]);
        }
 
        Arrays.sort(array, Collections.reverseOrder());
     
        return array;
        
    }
}
