// 문제 링크: https://www.acmicpc.net/problem/16472
// 시간: 248 ms
// 메모리: 23116 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //인식할 수 있는 알파벳 수
        String meowMeow = br.readLine();

        String[] meow = meowMeow.split(""); // 우선 단어단어 짤랐음

        int max = 0; // 비교해서 가장 긴 문자열 담을 수

        int sp = 0 , ep = 0; // 시작 인덱스 , 끝 인덱스

        Map<String, Integer> map = new HashMap<>(); // 맵에 담아서 문자열 갯수 측정할 예정

        while(ep!=meow.length-1){
            map.put(meow[ep],map.getOrDefault(meow[ep],0)+1); // 맵에 하나씩 넣어갔다.

            if(map.size()>n){ // 만약 맵의 사이즈, 즉 종류가 n을 넘어가게 된다면

                max = Math.max(max,ep-sp); // 시작인덱스와 끝 인덱스의 차이만큼 이번 문자열 길이고
                                           // 이전의 max 값과 비교해서 업데이트 했다.

                map.put(meow[sp],map.get(meow[sp])-1); // 그리고 시작 인덱스를 갯수 1 줄였다.

                if(map.get(meow[sp])==0){ // 줄였는데 만약 value가 0이 된다면
                    map.remove(meow[sp]);  // 그 문자를 제거했다.
                }
                sp++; // 시작점을 올렸다.
            }
            ep++; // 끝 인덱스 올렸다.
        }

        if(max==0){              // 계속 80프로에서 막혔었는데 도저히 틀린 부분을 모르겠어서
            max = meow.length;   // 질문 게시판을 들어가보니까 80프로 때 막히는 부분은 
        }                        // 문자열이 모두 동일할 때 max가 총 길이가 나와야하는데 0이 나오는 반례가 있어서
                                  // 강제적으로 이렇게 우선 해결해봤습니다.
                                  // ex) aaaaa 라면 5가 나와야 하는데 1이 나옴
        System.out.println(max);
    }
}

	
