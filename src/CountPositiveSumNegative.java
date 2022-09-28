import java.util.*;
public class CountPositiveSumNegative {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15};
        printArr(countPositiveAddNegative(list));
    }

    public static int [] countPositiveAddNegative(int [] Arr){
        if(Arr == null || Arr.length < 2) {
           int [] emptyArray = {};
           return emptyArray;
        }
        int [] newArr =  new int [2];
        for(int i = 0; i < Arr.length; i++){
            if(Arr[i] > 0){
                newArr[0]++;
            }
            if (Arr[i] < 0){
                newArr[1] += Arr[i];
            }
            }
        return newArr;
        }

    public static void printArr ( int [] Arr){
        for(int i = 0; i < Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
}
