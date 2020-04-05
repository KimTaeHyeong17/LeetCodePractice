import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        double sum = 0;
        ArrayList<Double> arraylist = new ArrayList();
        while (true) {
            
            while (n != 0) {
                int num = n % 10;
                //num을 10으로 나눈 값을 다시 num에 저장한다.
                n = n / 10;
                System.out.print(num);
                sum = sum + Math.pow(num, 2);
            }
            System.out.println("\nsum : " + sum);
            if (sum == 1) {
                return true;
            } else {
                if(arraylist.contains(sum)){
                    break;
                }else{
                    arraylist.add(sum);
                    n = (int) sum;
                    sum = 0;
                }
            }
        }//while true
        return false;
    }
}
