// 문제 링크: https://www.acmicpc.net/problem/20291
// 시간: 456ms
// 메모리: 77656KB

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();

        String file;
        String split;
        for (int i = 0; i < n; i++) {
            file = br.readLine();
            split = file.substring(file.indexOf('.') + 1);
            map.put(split, map.getOrDefault(split, 0) + 1);
        }

        for (String key : map.keySet()) {
            sb.append(key).append(' ').append(map.get(key)).append("\n");
        }

        System.out.println(sb);
    }
}
