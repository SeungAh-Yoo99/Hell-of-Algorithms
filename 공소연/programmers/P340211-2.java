// 링크: https://school.programmers.co.kr/learn/courses/30/lessons/340211
// 시간: 3774.91ms
// 메모리: 757MB

import java.util.*;

class Solution {
    class Robot {
        int r;
        int c;
        int num; // 몇 번째 로봇인지
        int nextIdx; // 다음 경로의 인덱스
        int count; // 몇 번 움직였는지

        Robot(int r, int c, int num, int nextIdx, int count) {
            this.r = r;
            this.c = c;
            this.num = num;
            this.nextIdx = nextIdx;
            this.count = count;
        }
    }

    public int solution(int[][] points, int[][] routes) {
        int[][] board = new int[101][101];

        // 포인트 번호 - 좌표 매핑
        Map<Integer, int[]> pointMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            pointMap.put(i + 1, points[i]);
        }

        // 각 좌표 별로 방문 카운팅: (몇번째로 방문 + 좌표) = key
        Map<String, Integer> visitMap = new HashMap<>();

        Queue<Robot> q = new LinkedList<>();

        // 각 로봇의 (첫번째 경로의 좌표 + 몇번째 로봇인지)를 큐에 넣어놓기
        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            int[] startPoint = pointMap.get(route[0]);
            q.offer(new Robot(startPoint[0], startPoint[1], i + 1, 1, 1));
            visitMap.put(getKey(1, startPoint[0], startPoint[1]), visitMap.getOrDefault(getKey(1, startPoint[0], startPoint[1]), 0) + 1);
        }

        while (!q.isEmpty()) {
            // 큐에서 꺼내기
            Robot robot = q.poll();
            int curR = robot.r, curC = robot.c, count = robot.count;
            int[] nextPoint = pointMap.get(routes[robot.num - 1][robot.nextIdx]);
            int nextR = nextPoint[0], nextC = nextPoint[1];

            // 다음 경로까지의 최단 경로를 구하기
            // 최단 경로가 여러 개면
            if (curR != nextR) {
                if (curR > nextR) {
                    curR--;
                } else {
                    curR++;
                }
                count++;
            } else if (curC != nextC) {
                if (curC > nextC) {
                    curC--;
                } else {
                    curC++;
                }
                count++;
            }
            
            // 방문 카운팅하기
            visitMap.put(getKey(count, curR, curC), visitMap.getOrDefault(getKey(count, curR, curC), 0) + 1);

            // 만약 다음 경로와 일치하는 좌표라면 다음 경로 인덱스 업데이트(Robot.next 업데이트)
            if (curR == nextR && curC == nextC) {
                // 다음 경로가 있는지 확인
                if (routes[robot.num - 1].length - 1 > robot.nextIdx) {
                    robot.nextIdx++;
                } else {
                    continue;
                }
            }

            q.offer(new Robot(curR, curC, robot.num, robot.nextIdx, count));
        }
        
        int answer = 0;
        for (String key : visitMap.keySet()) {
            if (visitMap.get(key) > 1) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public String getKey(int count, int r, int c) {
        return String.format("%d(%d,%d)", count, r, c);
    }
}
