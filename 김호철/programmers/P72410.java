////문제 링크:https://school.programmers.co.kr/learn/courses/30/lessons/72410
//
//
//import java.util.*;
//
//class P72410 {
//    public String solution(String new_id) {
//
//        String answer = "";
//
//        StringBuilder sb = new StringBuilder();
//        //1단계
//        new_id = new_id.toLowerCase();
//
//
//        //2단계
//       String chk = "1234567890qwertyuiopasdfghjklzxcvbnm.-_";
//        String[] arr_chk = chk.split("");
//        String[] id_arr = new_id.split("");
//        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr_chk));
//        ArrayList<String> id = new ArrayList<>(Arrays.asList(id_arr));
//        id.retainAll(al);
//        new_id = String.join("",id);
//
//        //3단계
//        while(new_id.contains("..")){
//            new_id=new_id.replace("..",".");
//        }
//        //4단계
//        if(new_id.endsWith(".")){
//            new_id = new_id.substring(0,new_id.length()-1);
//        }
//        if(new_id.startsWith(".")){
//            new_id = new_id.substring(1,new_id.length());
//        }
//        //5단계
//        if(new_id.isEmpty()){
//            new_id +="a";
//        }
//
//        //6단계
//        if(new_id.length()>15){
//            new_id=new_id.substring(0,15);
//        }
//        if(new_id.endsWith(".")){
//            new_id = new_id.substring(0,new_id.length()-1);
//        }
//        //7단계
//        while(new_id.length()<=2){
//            char temp = new_id.charAt(new_id.length()-1);
//            sb.setLength(0);
//            sb.append(new_id);
//            sb.append(temp);
//            new_id=sb.toString();
//
//        }
//
//        System.out.println(new_id);
//
//
//        return new_id;
//
//    }
//}
