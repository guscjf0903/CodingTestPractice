import java.util.*;
public class SeparateDigits {

    public static void main(String[] argc){
        var scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();
        int check = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(true){
            if(num < 10){
                stack.push(num);
                break;
            }
            check = num % 10;
            num /= 10;
            stack.push(check);

        }
        int size = stack.size();
        for(int i = 0; i < size; i++){
            int a = stack.pop();
            sum += a;
            System.out.println(a);
        }
        System.out.println(sum);

    }
}
