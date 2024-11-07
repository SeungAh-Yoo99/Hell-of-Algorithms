//문제 링크 https://www.acmicpc.net/problem/2805
//시간  492ms
//메모리 119316KB


import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		int left = 0;
		int right = -1;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, arr[i]);
		}
		while(left<=right) {
			int mid = (left+right)/2;
			long tree=0;
			for(int i=0; i<n; i++) {
				if(arr[i]>mid) tree+= arr[i]-mid;
			}
			if(tree>=m) {
				left = mid+1;
			}else if(tree<m) { 
				right = mid-1;
			}
		}
		System.out.println(right);
	}
}
