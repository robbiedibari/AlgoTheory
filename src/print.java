import java.util.*;
public class print {
    public void print(){
        int x = 10;
        double [] array = new double[]{1,2,3};
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println(x);
        System.out.println("Hello" + x);

        for(double number : array){
            System.out.println(number);
        }
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
