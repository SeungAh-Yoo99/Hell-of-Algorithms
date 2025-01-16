import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/2164
 * 시간 : 156ms
 * 메모리 : 45460KB
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cards = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= cards; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
