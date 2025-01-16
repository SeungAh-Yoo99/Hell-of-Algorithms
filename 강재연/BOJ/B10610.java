//문제 링크: https://www.acmicpc.net/problem/10610
//시간: 364 ms
//메모리: 23056 KB

import java.io.*;
import java.util.*;

public class boj10610 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int[] nums = sc.next().chars().map(Character::getNumericValue).toArray();
		
		Arrays.sort(nums);
		// 오름차순 정렬 후 가장 작은 숫자에 0이 없으면 바로 -1 출력 후 리턴
		if(nums[0] != 0) {
			System.out.println(-1);
			return;
		}
		
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		// 모든 자릿수의 합을 구함
		// 오름차순 정렬 후 끝에서부터 배열을 순회해서 가장 큰 숫자를 만듬
		for(int j=nums.length-1; j>=0; j--) {
			sum += nums[j];
			sb.append(nums[j]);
		}
		
		// 모든 자릿수의 합이 3의 배수가 아니면 30의 배수도 아님 -> -1 출력
		// 맞으면 StringBuilder에 넣어둔 가장 큰 숫자 출력
		if(sum % 3 != 0) {
			System.out.println(-1);
		}else {
			System.out.println(sb);
		}
		
	}

}
