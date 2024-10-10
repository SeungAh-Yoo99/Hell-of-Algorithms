// 문제 링크: https://www.acmicpc.net/problem/2578
// 시간: 64 ms
// 메모리: 11640 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static int[][] numbers = new int[5][5]; // 빙고 배열
    static int[] count_width = new int[5]; // 가로 빙고 체크 배열
    static int[] count_length = new int[5]; // 세로 빙고 체크 배열
    static int[] count_cross = new int[2]; // 대각선 빙고 체크 배열
    static int countBingo = 0; // 빙고 갯수 
    static int count = 0; // 시도 횟수
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0 ; i < 5 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 5 ; j++){
                numbers[i][j] = Integer.parseInt(st.nextToken());
                String temp = i+" "+j; // value에는 가로 세로 값 넣고싶어서 이렇게 했음,,
                map.put(numbers[i][j],temp); // Map에 넣었음(숫자 찾을 때 편하려고)
            }
        }

            for(int i = 0 ; i < 5 ; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < 5 ; j++){
                    count++;
                    int number = Integer.parseInt(st.nextToken()); //찾을 숫자
                    String findNumber = findNumber(number); // 찾을 숫자의 빙고 배열 값
                    String[] arr = findNumber.split(" ");
                    int width = Integer.parseInt(arr[0]); // 가로 칸
                    int length = Integer.parseInt(arr[1]); // 세로 칸
                    check_bingo(width,length); // 빙고 체크
                    if(countBingo>=3)break; // 빙고 개수 체크
                }
                if(countBingo>=3)break; // 빙고 개수 체크
            }

        System.out.println(count); //시도 횟수 출력
    }

    private static String findNumber(int number) {
        return map.get(number); // 숫자 찾기
    }


    private static void check_bingo(int width, int length) {
        count_width[width]++; //가로 줄에 값 1 증가
        count_length[length]++;// 세로 줄에 값 1 증가
        if(width==length){
            count_cross[0]++;
        }
        if(width+length==4){
            count_cross[1]++;
        }
        
        
        //여기서 부터는 빙고 체크
        if(count_width[width]==5){ //5라면 한 줄 완성이라 판별
            countBingo++;
            count_width[width]=0; // 체크 하고 나선 0으로 바꿈
											            // 안바꾸면 계속 빙고카운트 올라가니까
        }
        if(count_length[length]==5){
            countBingo++;
            count_length[length]=0;
        }
        if(count_cross[0]==5){
            countBingo++;
            count_cross[0]=0;
        }
        if(count_cross[1]==5) {
            countBingo++;
            count_cross[1]=0;
        }
    }
}


