//문제 링크 https://www.acmicpc.net/problem/1259
//시간 96ms
//메모리 14252KB


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            StringBuilder sb = new StringBuilder(str);
            String reversedStr = sb.reverse().toString();

            if (str.equals(reversedStr)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        br.close();  
    }
}
