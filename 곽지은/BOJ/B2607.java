//문제 링크 : https://www.acmicpc.net/problem/2607
//시간 : 112ms
//메모리 : 14916KB


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int wordNum = Integer.parseInt(br.readLine());
        String inputWord = br.readLine();
        String standardStr = inputWord;
        
        int answer = 0 ; 
        for(int i = 1; i < wordNum; i++){
            inputWord = br.readLine();
            String tempStr = inputWord;
            String standerword = standardStr;
            
            if(standardStr.length()> tempStr.length()){
                for(int j = 0;j < tempStr.length();j++){
                	standerword = standerword.replaceFirst(String.valueOf(tempStr.charAt(j)),"");
                }
                if(standerword.length()==1){
                    answer++;
                }
            }
            else{
                for(int j = 0;j < standerword.length();j++){
                    tempStr = tempStr.replaceFirst(String.valueOf(standerword.charAt(j)),"");
                }
                if(tempStr.length()==1||tempStr.length()==0){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
