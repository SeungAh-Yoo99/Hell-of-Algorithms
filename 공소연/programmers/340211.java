// 문제링크: https://school.programmers.co.kr/learn/courses/30/lessons/340211
// 시간: 255.33ms
// 메모리: 139MB

import java.util.*;

// point들에 번호 매기기
// 큐에 각 route들의 첫 번째 요소들 집어 넣기(첫 번째 요소의 목적지 필드도 설정)
// 큐에서 현재 size만큼의 하나의 로테이션을 돌기
// 로테이션을 돌면서 좌표별 방문 횟수 카운트 하기
// 다음 로테이션을 위해 큐에 이동한 포인트 집어 넣기

class Solution {
    public int solution(int[][] points, int[][] routes) {
        Queue<Point> q = new ArrayDeque<>();
        Map<Integer, Point> pointMap = new HashMap<>(); 
        int result = 0;

        // point들에 번호 매기기
        for (int i = 0; i < points.length; i++) {
            pointMap.put(i + 1, new Point(points[i][0], points[i][1]));
        }
        
        // 큐에 각 route들의 첫 번째 요소들 집어 넣기
        for (int[] route : routes) {
            Point point = pointMap.get(route[0]);
            Point newPoint = new Point(point.r, point.c);
            int[][] destination = new int[route.length - 1][2];
            for (int i = 0; i < route.length - 1; i++) {
                Point destPoint = pointMap.get(route[i + 1]);
                destination[i][0] = destPoint.r;
                destination[i][1] = destPoint.c;
            }
            newPoint.destination = destination;
            q.add(newPoint);
        }
                
        while (!q.isEmpty()) {
            int size = q.size();
            
            // 같은 로테이션일 때 카운트가 2이상인 경우를 세어야하니까 시작 부분에서 map 초기화
            Map<String, Integer> countMap = new HashMap<>();    
            
            for (int i = 0; i < size; i++) {
                Point remove = q.remove();
                String point = remove.r + ", " + remove.c;
                countMap.put(point, countMap.getOrDefault(point, 0) + 1);
                
                int[] destination = remove.destination[remove.index];
                if (destination[0] == remove.r && destination[1] == remove.c) {
                    if (remove.index < remove.destination.length - 1) {
                        remove.index++;
                        destination = remove.destination[remove.index];
                    } else {
                        continue;
                    }
                }
                
                if (remove.r != destination[0]) {
                    if (remove.r < destination[0]) {
                        remove.r++;
                    } else {
                        remove.r--;
                    }
                } else if (remove.c != destination[1]) {
                    if (remove.c < destination[1]) {
                        remove.c++;
                    } else {
                        remove.c--;
                    }
                }
                
                q.add(remove);
            }
            
            for (int value : countMap.values()) {
                if (value >= 2) result++;
            }
        }

        return result;
    }
}

class Point {
    int r;
    int c;
    int[][] destination;
    int index = 0; // 다음 목적지 인덱스

    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

