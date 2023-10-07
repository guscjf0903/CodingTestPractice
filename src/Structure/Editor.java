package Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int commandNum = Integer.parseInt(br.readLine());
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : input.toCharArray()) {
            stack1.add(c);
        } //queue1에 모든 문자열 입력

        for (int i = 0; i < commandNum; i++) {
            String commandLine = br.readLine(); //문자 한개씩만 들어옴
            switch (commandLine.charAt(0)) {
                case 'L':
                    if(stack1.isEmpty()){
                        break;
                    }
                    stack2.add(stack1.pop());
                    break;
                case 'D':
                    if(stack2.isEmpty()){
                        break;
                    }
                    stack1.add(stack2.pop());
                    break;
                case 'B':
                    if(stack1.isEmpty()){
                        break;
                    }
                    stack1.pop();
                    break;
                case 'P':
                    char plusChar = commandLine.charAt(2);
                    stack1.add(plusChar);
                    break;
            }
        }

        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack1) {
            result.append(c);
        }
        System.out.println(result);


        //스택 2개로 구현 B = 스택에서 삭제 L = 스택2로 이동 D = 스택2에있던걸 다시 1으로 이동 P = 스택1에 문자 추가

    }
}
