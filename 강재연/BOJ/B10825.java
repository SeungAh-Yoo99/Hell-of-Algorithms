//문제 링크: https://www.acmicpc.net/problem/10825
//시간: 660 ms
//메모리: 68168 KB

import java.io.*;
import java.util.*;

public class boj10825 {
	public static class Student{
		String name;
		int kor;
		int eng;
		int math;
		
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 그냥 2차원 배열로 해도 되겠지만 200% 헷갈릴것 같아서
		// Student 타입의 ArrayList 생성
		ArrayList<Student> students = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			// 생성자로 요소 추가
			students.add(new Student(name, kor, eng, math));
		}
		
		students.sort((s1, s2) -> {
			// 1. 국어 점수가 감소하는 순서로
			if(s1.kor != s2.kor) {
				return s2.kor - s1.kor;
			}
			// 2. 국어 점수가 같으면 영어 점수가 증가하는 순서로
			if(s1.eng != s2.eng) {
				return s1.eng - s2.eng;
			}
			// 3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
			if(s1.math != s2.math) {
				return s2.math - s1.math;
			}
			// 4. 모든 점수가 같으면 이름이 사전순으로 증가하는 순서로 
			return s1.name.compareTo(s2.name);
		});
		
		StringBuilder sb = new StringBuilder();
		for(Student student : students) {
			// 정렬된 리스트의 이름만 출력
			sb.append(student.name).append("\n");
		}
		System.out.println(sb);
	}

}
