import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        // 1. BigDecimal을 사용하여 푸는 방법
        // int 값을 String으로 변환
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        // String 값을 사용하여 BigDecimal 생성
        BigDecimal bigA = new BigDecimal(aStr);
        BigDecimal bigB = new BigDecimal(bStr);

        // 나누기 연산 후, 소수점 21자리 내림
        BigDecimal result = bigA.divide(bigB, 20, RoundingMode.DOWN);
        System.out.println(result.toPlainString());

        // 2.  정수 부분과 소수 부분의 계산 로직을 나눠서 푸는 방법
        // 정수 부분
        System.out.printf("%d." ,a/b);
        // 소수 부분
        a %= b;
        for (int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a/b);
            a %= b;
        }
    }
}