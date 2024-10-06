//문제링크  https://www.acmicpc.net/problem/1449
//시간 100ms
//메모리 14300KB


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int placeNum = Integer.parseInt(st.nextToken());
        int tapeLength = Integer.parseInt(st.nextToken());

        int arr[] = new int[placeNum];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < placeNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int range = (int)(arr[0] - 0.5 + tapeLength);
        int result = 1;

        for (int i = 1; i < arr.length; i++) {
            if (range < (int)(arr[i] + 0.5)) {
                range = (int)(arr[i] - 0.5 + tapeLength);
                result++;
            }
        }

        System.out.println(result);
    }
}
