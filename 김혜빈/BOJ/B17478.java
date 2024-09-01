package 김혜빈.BOJ;

// 문제 링크: https://www.acmicpc.net/problem/17478
// 시간: 104 ms
// 메모리: 14564 KB

import java.io.*;

public class B17478 {
    /* 재귀로 반복할 문자열 목록 */
    static final String[] str = {"\"재귀함수가 뭔가요?\"", "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.", "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.", "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"",};
    /* 마지막 재귀에서 출력할 문자열 목록 */
    static final String[] last = {"\"재귀함수가 뭔가요?\"", "\"재귀함수는 자기 자신을 호출하는 함수라네\"", "라고 답변하였지."};
    /* 최종적으로 출력되는 문자열 */
    static final String end = "라고 답변하였지.";
    /* 언더바를 반복하므로 static 변수로 설정해두기 */
    static String repeat = "_";
    /* 재귀하는 횟수 */
    static int N;
    /* 최종 출력을 위해 쓸 StringBuilder 변수 (재귀에서 사용하므로 전역으로 설정) */
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n"); // 가장 처음에만 오는 문자열
        recursion(0); // 재귀 시작

        bw.append(sb.toString());
        bw.close();
        br.close();
    }

    static void recursion(int cnt) {
        String r = repeat.repeat(cnt * 4); // 언더바를 현재 재귀하는 횟수의 4배 추가

        if(cnt == N) {
            // 마지막 재귀의 경우 마지막 문자열 목록을 출력하고 리턴
            for(String s:last) sb.append(r).append(s).append("\n");
            return;
        }

        for(String s:str) sb.append(r).append(s).append("\n"); // 마지막 재귀가 아닌 경우 반복하는 문자열을 출력
        recursion(cnt + 1); // 다음 재귀로 이동
        sb.append(r).append(end).append("\n"); // 현재 이후의 재귀가 완료된 후 최종적으로 출력되는 문자열 출력
    }
}
