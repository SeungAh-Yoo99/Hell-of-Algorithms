문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/49993
시간: 0.69ms
메모리: 81.4MB

// 문제 풀면서 막혔던 부분

// 스킬 트리 순서대로 스킬을 배울 수 있기 때문에
  
// 큐에 넣어서 앞으로 배울 스킬이 큐에 속해있고, 큐의 제일 앞에 들어있다면
// q.poll()하고 다음 반복진행
// 아니라면 멈추고 answer -- 처리하고 for문 벗어나는 식으로 풀어봤는데
  
// 큐같은 경우 새로 선언하고 복사하는데, 주소값만 복사가 되 얕은 복사가 되는 문제점 발생
// 그래서 깊은 복사를 하고싶었지만, 구현하는데 어려움을 겪어
  
// 배열에서 이용하며 함수에 맞는 타입들로 설정 한 후 포인트를 이용해 큐처럼
// 진행해보며 풀어봤습니다!


class Solution {
    public int solution(String skill, String[] skill_trees) {

        int answer = skill_trees.length; // 반환값을 우선 전체 가능한 수로 설정 후
                                            // 반례마다 -1 예정
        
        for(int i = 0 ; i < skill_trees.length ; i++){
            int point = 0; // 반복이 다시 시작할 때 마다 다시 제일 앞부터 비교 예정
            
            String[] s = skill_trees[i].split(""); // contains 함수 쓰고 싶어서 스트링 배열 사용
            
            for(int j = 0 ; j < skill_trees[i].length(); j++){
                if(skill.contains(s[j])){ // 스킬트리에 속해있고
                    
                    if(skill.charAt(point) == skill_trees[i].charAt(j)){ // 큐(의) 제일 앞 값과 일치 한다면
                        point++; // 큐(?) poll()처리 했다 생각하고 point 이동하며 그 다음값을 비교 예정
                    }
                    else{
                        answer--; // 아니라면 반례 처리 후 break;
                        break;
                    }
                }
            }
        }        
        return answer;
    }
}
