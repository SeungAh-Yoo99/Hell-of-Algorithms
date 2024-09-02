//문제 링크: https://www.acmicpc.net/problem/2075
//시간: 1748ms
//메모리: 345448KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                list.add(Integer.parseInt(arr[j]));
            }
        }

        Collections.sort(list);
        int index = N * N - N;
        System.out.println(list.get(index));
    }
}
