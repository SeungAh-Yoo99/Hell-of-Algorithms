//문제 링크: https://www.acmicpc.net/problem/10814
//시간: 564 ms
//메모리: 51892 KB

import java.io.*;
import java.util.*;

public class boj10814 {
	public static class User{
		int access;
		int age;
		String name;
		public User(int access, int age, String name) {
			this.access = access; // 가입순서
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<User> userList = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			userList.add(new User(i, age, name));
		}
		
		// 1. 나이순으로 오름차순
		// 2. 나이가 같으면 가입한 순으로 오름차순 
		userList.sort((u1, u2) -> u1.age != u2.age ? u1.age - u2.age : u1.access - u2.access);
		
		StringBuilder sb = new StringBuilder();
		for(User user : userList) sb.append(user.age).append(" ").append(user.name).append("\n");
		System.out.println(sb);
	}

}
