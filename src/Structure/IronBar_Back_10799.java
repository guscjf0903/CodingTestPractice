package Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class IronBar_Back_10799 {
    public static void main(String[] args) throws IOException {
        //쇠막대기는 절대 양끝이 겹치지않음
        // 점점 쇠막대기 갯수가 올라가는 스택이다.
        //()(((()())(())()))(())
        // 0 3 3 1 3 1 2 1 1 1 1
        // (((()(()())) (())()))  (()())
        // 4 5 5 1 1
        Stack<Character> stack = new Stack<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = bufferedReader.readLine().toCharArray();
        int result = 0;
        int check = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] == '('){
                check++;
            }else {
                check--;
                if(input[i - 1] =='('){
                    result += check;
                }else {
                    result += 1;
                }
            }
        }
        System.out.println(result);



    }

}

