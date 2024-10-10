//문제 링크 https://www.acmicpc.net/problem/1193
//시간 124ms
//메모리 16080KB


import java.io.*;
 
public class Main {
    static int x;
    static int crossLine = 1;
    static int sum = 0;
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
 
		while (true) {
			if (x <= sum + crossLine) {	
				if (crossLine % 2 == 1) {	
					System.out.print((crossLine - (x - sum - 1)) + "/" + (x - sum));
					break;
				} 
				else {	
					System.out.print((x - sum) + "/" + (crossLine - (x - sum - 1)));
					break;
				}
			} else {
				sum += crossLine;
				crossLine++;
			}
		}
	}
}
