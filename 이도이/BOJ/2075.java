문제 링크: https://www.acmicpc.net/problem/2075
시간: 1520ms
메모리: 352488KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            for(int k=0;k<n; k++){
                arrayList.add(Integer.parseInt(arr[k]));
            }
        }

        int[] intArr = arrayList.stream().mapToInt(i->i).toArray();
        Arrays.sort(intArr);

        System.out.println(intArr[intArr.length-n]);
    }
}
