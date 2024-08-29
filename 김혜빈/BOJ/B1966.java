package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/1966
// 시간: 88 ms
// 메모리: 12664 KB

import java.util.*;
import java.io.*;

class Node {
    int idx; // 문서의 인덱스
    int priority; // 문서의 우선순위

    public Node(int i, int p) {
        idx = i;
        priority = p;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        /* 입출력에 필요한 변수 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        /* 테스트 케이스 수 만큼 반복문 수행 */
        for(int t=0; t<test; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken()); // 문서의 개수
            int idx = Integer.parseInt(st.nextToken()); // 몇 번째로 나올지 궁금한 문서의 인덱스

            st = new StringTokenizer(br.readLine()); // 문서들의 우선순위 입력받기

            Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위를 확인할 우선순위 큐
            Queue<Node> q = new LinkedList<>(); // 문서를 담을 큐

            /* 큐에는 문서를 넣고 우선순위 큐에는 우선순위만 넣기 */
            for(int i=0; i<size; i++) {
                int priority = Integer.parseInt(st.nextToken()); // 우선순위
                q.add(new Node(i, priority));
                pq.add(priority);
            }

            int order = 1; // 문서가 나오는 순서
            while(!q.isEmpty()) {
                int priority = pq.peek(); // 현재 가장 높은 우선순위 peek
                if(q.peek().priority < priority) q.add(q.poll()); // 만약 현재 문서보다 우선순위가 높은 값이 존재하면 맨 뒤로 보내기
                else {
                    if(q.peek().idx == idx) { // 궁금한 문서의 인덱스일 경우 sb에 추가해주고 조건문 종료
                        sb.append(order).append("\n");
                        break;
                    } else { // 아닐 경우 poll 하고 순서 증가
                        pq.poll();
                        q.poll();
                        order ++;
                    }
                }
            }
        }

        bw.append(sb.toString());
        bw.close();
        br.close();
    }
}