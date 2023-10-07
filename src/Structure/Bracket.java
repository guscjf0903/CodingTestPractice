package Structure;

import java.util.Stack;

/// 너무 드럽게 풀긴했다....
public class Bracket {
    public static void main(String[] argc){
        String input = ")()(";
        char[] array = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        int check = 0;
        for (char c : array) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
                check++;
            } else if (c == ']') {
                if(stack.isEmpty()){

                    break;
                }
                if (stack.pop() == '[') {
                    check--;
                } else {
                    break;
                }
            } else if (c == '}') {
                if(stack.isEmpty()){
                    break;
                }
                if (stack.pop() == '{') {
                    check--;
                } else {
                    break;
                }
            } else if (c == ')') {
                if(stack.isEmpty()){
                    break;
                }
                if (stack.pop() == '(') {
                    check--;
                } else {
                    break;
                }
            }
        }
        if(check == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

}
