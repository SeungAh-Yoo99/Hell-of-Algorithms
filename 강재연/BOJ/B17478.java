//문제 링크: https://www.acmicpc.net/problem/17478
//시간: 180 ms
//메모리: 17956 KB


import java.util.*;

public class boj17478 {
	static StringBuilder sb = new StringBuilder();
	static int N;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
				
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		textRepeat(0);
		
		System.out.println(sb);
	}
	
	public static void textRepeat(int n) {
		// N번째에 재귀 종료
		if(n == N) {
			sb.append("____".repeat(n)).append("\"재귀함수가 뭔가요?\"\n");
			sb.append("____".repeat(n)).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
			sb.append("____".repeat(n)).append("라고 답변하였지.\n");
			return;
		}
		// n번만큼 "____" 반복
		sb.append("____".repeat(n)).append("\"재귀함수가 뭔가요?\"\n");
		sb.append("____".repeat(n)).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		sb.append("____".repeat(n)).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		sb.append("____".repeat(n)).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		
		// 0+1 만큼 재귀 
		textRepeat(n+1);
		
		// 재귀 이후 호출될 영역 
		sb.append("____".repeat(n)).append("라고 답변하였지.\n");
	}

}
