//문제 링크: https://www.acmicpc.net/problem/1764
//시간: 360ms
//메모리: 25796KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        List<String> nameList = new LinkedList<>();


        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, 1);
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                answer++;
                nameList.add(name);
            }
        }

        System.out.println(answer);
        Collections.sort(nameList);
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }
    }

}
