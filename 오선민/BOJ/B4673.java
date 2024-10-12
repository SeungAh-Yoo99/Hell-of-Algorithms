// 문제링크: https://www.acmicpc.net/problem/4673
// 시간: 132 ms
// 메모리: 14560 KB

public class B4673 {
    private static int generate(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int generated = generate(i);
            if (generated <= 10000) {
                isSelfNumber[generated] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }
}