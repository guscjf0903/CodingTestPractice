package Structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = parseInt(bufferedReader.readLine());
        int[] result = new int[n];
        int[] input = new int[n];
        for(int i = 0; i < n; i++){ //입력받기.
            input[i] = parseInt(bufferedReader.readLine());
        }

        int check = 0;
        int i = 0;
        Queue<String> queue = new LinkedList<>();

        check++;
        stack.push(check);
        queue.add("+");
        do {
            if (stack.peek() == input[i]) { // 있으면 스택을 비움.
                result[i] = stack.pop();
                queue.add("-");
                i++;
                if(i >= n){
                    break;
                }
            } else { //없으면 스택을 쌓음
                queue.add("+");
                check++;
                stack.push(check);
            }
            if (stack.isEmpty()) {
                queue.add("+");
                check++;
                stack.push(check);
            }
        } while (check <= n);

        if(stack.isEmpty()){
            for(String k : queue){
                System.out.println(k);
            }
        }else{
            System.out.println("NO");
        }

    }
}
