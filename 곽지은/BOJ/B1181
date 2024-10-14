//문제링크 https://www.acmicpc.net/problem/1181
//시간 464ms
//메모리 23756KB


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String args[]) throws IOException{
	   	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   	 
	   	 	int n = Integer.parseInt(br.readLine());
	   	 	
	   	 	String[] word = new String[n];
	   	 	
	   	 	for(int i =  0 ; i < n ; i++) {
	   	 		word[i] = br.readLine();
	   	 	}
	   	 	
	   	 	Arrays.sort(word, new Comparator<String>() {
	   	 		@Override
	   	 		public int compare(String s1, String s2) {
	   	 		if(s1.length() == s2.length()) {
	   	 			return s1.compareTo(s2);
	   	 		}else {
	   	 			return s1.length() - s2.length();
	   	 		}
	   	 		
	   	 	}
	   	 	});
	   
	   	 	System.out.println(word[0]);
	   	 	for(int i = 1; i < n; i++) {
	   		if (!word[i].equals(word[i - 1])) {
				System.out.println(word[i]);
			}
		}
	}
}
