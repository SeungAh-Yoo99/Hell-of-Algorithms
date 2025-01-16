// 문제 링크: https://www.acmicpc.net/problem/2961
// 시간: 64ms
// 메모리: 11520KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] ingredients;
    static int diff = 1_000_000_000;
    static int sour;
    static int bitter;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ingredients = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            ingredients[i] = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }

        combination(0, new int[n][2], 0);

        System.out.println(diff);
    }

    static void combination(int depth, int[][] chosen, int startIdx) {
        if (depth > 0) {
            calculateDiff(chosen, depth);
        }

        if (depth == ingredients.length) {
            return;
        }

        for (int i = startIdx; i < ingredients.length; i++) {
            chosen[depth] = ingredients[i];
            combination(depth + 1, chosen, i + 1);
        }
    }

    static void calculateDiff(int[][] chosen, int depth) {
        sour = 1;
        bitter = 0;
        for (int i = 0; i < depth; i++) {
            sour *= chosen[i][0];
            bitter += chosen[i][1];
        }
        diff = Math.min(diff, Math.abs(sour - bitter));
    }
}
