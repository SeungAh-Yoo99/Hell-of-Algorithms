//문제 링크: https://www.acmicpc.net/problem/1978
//시간: 172 ms
//메모리: 17804 KB

import java.util.Scanner;
public class B1978 {
    //  소수 여부 확인
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int j=2; j<number; j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] inputs = sc.nextLine().split(" ");
        sc.close();

        int[] numbers = new int[n]; // inputs String -> int
        int count = 0;

        for (int i=0; i<n; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
