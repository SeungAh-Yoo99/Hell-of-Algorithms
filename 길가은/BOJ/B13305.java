import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/13305
 * 시간 : 424ms
 * 메모리 : 36476KB
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long cost = 0;
        long[] distances = new long[Integer.parseInt(reader.readLine()) - 1];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < distances.length; i++) {
            distances[i] = Long.parseLong(tokenizer.nextToken());
        }

        long min = 0l;
        tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < distances.length; i++) {
            if(i == 0) {
                min = Long.parseLong(tokenizer.nextToken());
            } else {
                min = Math.min(min, Long.parseLong(tokenizer.nextToken()));
            }
            cost += min * distances[i];
        }
        System.out.println(cost);
    }
}
