//문제 링크: https://www.acmicpc.net/problem/1475
//시간: 100 ms
//메모리: 12924 KB

import java.io.*;
import java.util.*;

public class boj1475 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] nums = new int[10];
		
		// 0~9 범위의 배열에 일치하는 숫자가 있을때마다 +1
		for(int i=0; i<str.length(); i++){
			int num = Character.getNumericValue(str.charAt(i));
			nums[num] += 1;
		}
		
		int max = 0;
		// 6이랑 9는 같은 숫자로 쳐서 더한다음 /2 
		int change = (int) Math.ceil((nums[6]+nums[9])/2.0);
		
		// 6이랑 9를 제외한 범위중에 최댓값
		for(int j=0; j<10; j++) {
			if(j != 6 && j != 9) {
				max = Math.max(max, nums[j]);
			}
		}
		
		// 그 최댓값과 6이랑 9를 더하고 나눈값이랑 비교 후 출력 
		System.out.println(Math.max(max, change));
	}
}
