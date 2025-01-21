//문제링크 https://www.acmicpc.net/problem/9663
//시간 6240ms
//메모리 14732KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] arr;
    static int num;
    static int line = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        num = Integer.parseInt(str);
        arr = new int[num];
        dfs(0);
        System.out.println(line);
    }

    public static void dfs(int depth) {
        if (depth == num) {
            line++;
            return;
        }

        for (int i = 0; i < num; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                dfs(depth + 1);
            }
        }
    }

    public static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[i] == arr[col]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}




