//문제 링크 : https://www.acmicpc.net/problem/10828
//시간 : 264ms
//메모리 : 20452KB

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i<n;i++){
            s[i] = br.readLine();
            if(s[i].startsWith("push")){
                String[] arrS= s[i].split(" ");
                st.push(arrS[1]);                      
            }
            else if(s[i].equals("pop")){ 
                if(st.isEmpty()){
                    System.out.println("-1");
                }
                else {
                    System.out.println(st.pop());
                }
            }
            else if(s[i].equals("size")){ 
                System.out.println(st.size());
            }
            else if(s[i].equals("empty")){ 
                if(st.isEmpty()){
                    System.out.println("1");
                }
                else {
                    System.out.println("0");
                }
            }
            else if(s[i].equals("top")){
                if(st.isEmpty()){
                    System.out.println("-1");
                }
                else {
                    System.out.println(st.peek());
                }
            }
        }

    }

}
