import java.util.*;
public class DartGame {
    public static void main(String[] args) {
        String insert = "1D2S3T*";
        char[] insertCharArray = insert.toCharArray();
        ArrayList<Double> arrayList = new ArrayList<>(3);
        int index = 0;
        double num = 0;
        int result = 0;
        int check = 0;
        for(char a : insertCharArray){
            if(Character.getNumericValue(a) >= 0 && Character.getNumericValue(a) <= 10){
                if(check != 0){
                    num = (num * 10) + Character.getNumericValue(a);
                    check = 0;
                    continue;
                }
                num = Character.getNumericValue(a);
                check++;

            }
            if(a == 'S'){
                arrayList.add(num);
                index++;
                check = 0;
            } else if(a == 'D'){
                num = Math.pow(num, 2);
                arrayList.add(num);
                index++;
                check = 0;
            }else if(a == 'T'){
                num = Math.pow(num, 3);
                arrayList.add(num);
                index++;
                check = 0;
            }
            if(a == '*'){
                arrayList.set(index - 1, num * 2);
                if(index >= 2){
                    double past = arrayList.get(index - 2);
                    arrayList.set(index - 2, past * 2);
                }
            }else if(a == '#'){
                arrayList.set(index - 1, num * -1);
            }
        }


        for(double k : arrayList){
            result += (int) k;
        }
        System.out.println(result);

    }
}
