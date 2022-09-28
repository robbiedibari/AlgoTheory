import java.util.*;
public class SquareSum {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        System.out.println(squareSum(arr));

    }


    public static int squareSum(int [] n){
        int sum = 0;
        for(int i = 0; i < n.length; i++){
           int power = (int) Math.pow(n[i],2);
           sum += power;

        }
        return sum;

    }

}
