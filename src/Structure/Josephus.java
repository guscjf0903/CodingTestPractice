package Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue1 = new LinkedList<>();
        String[] input = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= N; i++){
            queue1.add(i);
        }
        result.append('<');
        while(!queue1.isEmpty()){
            for(int i = 0; i < K - 1; i++){
                int remove = queue1.poll();
                queue1.add(remove);
            }
            result.append(queue1.poll());
            if(!queue1.isEmpty()){
                result.append(", ");
            }
        }
        result.append('>');
        System.out.println(result);
    }
}
