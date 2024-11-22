//문제 링크: https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QLGxKAzQDFAUq&categoryId=AV5QLGxKAzQDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=1&pageSize=10&pageIndex=1&&&&&&&&&&
import java.io.*;

public class sw2056 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		
		char[] alphabet = br.readLine().toCharArray();
		
		for(int i=0; i<alphabet.length; i++) {
			sb.append(alphabet[i] - 64).append(" ");
		}
		System.out.println(sb);
	}

}
