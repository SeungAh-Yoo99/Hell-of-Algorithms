import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * 문제링크 : https://www.acmicpc.net/problem/5073
 * 시간 : 96ms
 * 메모리 : 14128KB
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            List<Integer> sides = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            for(int i = 0; i < 3; i++) {
                int target = Integer.parseInt(st.nextToken());
                if(sides.contains(target)) count++; // 같은 변의 개수
                sides.add(target);
            }

            Collections.sort(sides); // 삼각형인지 확인하기 위함
            if(sides.get(0) == 0 && count == 2) break; // 000 이어서 입력을 그만 받을 때
            else if(sides.get(0) + sides.get(1) <= sides.get(2)) System.out.println("Invalid"); // 삼각형 형태가 아닌 경우
            else if(count == 2) System.out.println("Equilateral"); // 세 변이 모두 같은 경우
            else if(count == 1) System.out.println("Isosceles"); // 두 변이 같은 경우
            else System.out.println("Scalene"); // 세 변이 모두 다른 경우
        }
        
    }
}
