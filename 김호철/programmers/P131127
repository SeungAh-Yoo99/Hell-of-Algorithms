//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131127
//시간: 117.44ms
//메모리: 128MB

import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        List<String> wishList = new ArrayList<>();
        for(int i = 0 ; i < want.length ; i++){
            for(int j =0;j<number[i];j++){
                wishList.add(want[i]); //위시리스트 만들었다.
            }
        }

        List<String> compareList; // 비교할 할인 리스트를 선언 먼저했다.

        Collections.sort(wishList);
        // 위시리스트 정렬했음(정렬하고 equals사용하고싶어서)

        for(int i = 0; i <= discount.length - 10; i++){

            compareList = new ArrayList<>(Arrays.asList(discount).subList(i,i+10));
            // 선언했던 비교리스트에 할인 배열을 10일 단위로 끊어서 넣어줬다.

            Collections.sort(compareList);
            //비교하기 위해서 정렬하였다.

            if(Objects.equals(compareList, wishList)){
                answer++; //같으면 1증가
            }
        }
        return answer;
    }
}

