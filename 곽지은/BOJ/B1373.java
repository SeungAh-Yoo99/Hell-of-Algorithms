//문제링크 https://www.acmicpc.net/problem/1373
//시간  1612ms
//메모리 57912KB



import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        
        if (n % 3 == 1) { 
            System.out.print(s.charAt(0));
        } else if (n % 3 == 2) { 
            System.out.print((s.charAt(0) - '0') * 2 + (s.charAt(1) - '0'));
        }
        for (int i = n % 3; i < n; i += 3) {
            System.out.print((s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0'));
        }
    }
}
