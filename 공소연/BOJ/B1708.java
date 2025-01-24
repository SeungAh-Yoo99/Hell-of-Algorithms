// 링크: https://www.acmicpc.net/problem/1708
// 시간: 612ms
// 메모리: 47240KB

import java.io.*;
import java.util.*;

public class Main {
    static class Point {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<>();

        // 입력
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            points.add(new Point(x, y));
        }

        // y좌표가 가장 작은 점(같으면 x좌표가 작은 점)을 첫 점으로
        Point first = points.get(0);
        for(int i = 1; i < N; i++) {
            if(points.get(i).y < first.y ||
                    (points.get(i).y == first.y && points.get(i).x < first.x)) {
                first = points.get(i);
            }
        }

        // 첫 점 기준 반시계방향 정렬
        Point finalFirst = first;
        Collections.sort(points, (p1, p2) -> {
            int result = ccw(finalFirst, p1, p2);
            if(result == 0) {
                long dist1 = dist(finalFirst, p1);
                long dist2 = dist(finalFirst, p2);
                return dist1 < dist2 ? -1 : 1;
            }
            return result > 0 ? -1 : 1;
        });

        // 스택으로 컨벡스헐 구성
        Stack<Point> stack = new Stack<>();
        stack.add(first);

        for(int i = 1; i < points.size(); i++) {
            while(stack.size() > 1 &&
                    ccw(stack.get(stack.size()-2), stack.peek(), points.get(i)) <= 0) {
                stack.pop();
            }
            stack.add(points.get(i));
        }

        System.out.println(stack.size());
    }

    static int ccw(Point p1, Point p2, Point p3) {
        long result = (p2.x - p1.x) * (p3.y - p1.y) - (p3.x - p1.x) * (p2.y - p1.y);
        if(result > 0) return 1;
        else if(result < 0) return -1;
        return 0;
    }

    static long dist(Point p1, Point p2) {
        return (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
    }
}
