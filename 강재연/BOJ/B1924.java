// 문제 링크: https://www.acmicpc.net/problem/1924
// 시간: 224 ms
// 메모리: 18364 KB

package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class boj1924 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken());
		int date = Integer.parseInt(st.nextToken());
		// 반환해줄 결과값 배열
		String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		Calendar calendar = Calendar.getInstance();
		// 달력 날짜를 셋팅
		calendar.set(2007, month - 1 , date);
		// DAY_OF_WEEK의 반환값은 1~7이라서 인덱스에 맞게끔 -1을 해줬습니다!! 
		System.out.println(day[calendar.get(Calendar.DAY_OF_WEEK)-1]);	
		
	}

}
