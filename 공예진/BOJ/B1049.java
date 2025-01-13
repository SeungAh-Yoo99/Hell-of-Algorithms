//문제 링크: https://www.acmicpc.net/problem/1049
//시간: 68ms
//메모리: 11620KB

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] packages = new int[M];
        int[] pieces = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            packages[i] = Integer.parseInt(st.nextToken());
            pieces[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(packages);
        Arrays.sort(pieces);

        int minPackage = packages[0];
        int minPiece = pieces[0];
        int answer = 0;

        if (minPackage <= minPiece * 6) {
            if (N % 6 == 0) {
                answer = (N / 6) * minPackage;
            } else {
                if ((N % 6) * minPiece > minPackage) {
                    answer = minPackage * (N / 6 + 1);
                } else {
                    answer = (N / 6) * minPackage + (N % 6) * minPiece;
                }
            }
        } else {
            answer = minPiece * N;
        }

        System.out.println(answer);
    }

}
