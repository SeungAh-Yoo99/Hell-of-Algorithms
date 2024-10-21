import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/17266
 * 시간 : 244ms
 * 메모리 : 24736KB
 */
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int lightSize = Integer.parseInt(reader.readLine());
        int[] lights = new int[lightSize];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int prev = 0;
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < lightSize; i++) {
            int light = Integer.parseInt(tokenizer.nextToken());
            if(i == 0) start = light;
            if(i == lightSize - 1) end = length - light;
            if(light - prev > max) max = light - prev;
            prev = light;
        }

        int needsHeight = (int) Math.ceil(max/(2.0));
        if(needsHeight < start || needsHeight < end) System.out.println(Math.max(start, end));
        else System.out.println(needsHeight);
    }
}
