import java.util.*;

/// QUICK SORT ALGORITHM

// 1. Chose the last element of the array as pivot
// 2. Move all the number that are lower to the left and higher to the right (Partition)

public class SortingArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] Arr = new int[10];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = rand.nextInt(100);

        }
        System.out.println("Array Before:");
        printArray(Arr);
        quickSort(Arr);
        System.out.println();
        System.out.println("Array After:");
        printArray(Arr);

    }
    private static void quickSort(int [] arr){
        quickSort(arr,0,arr.length -1);
    }
    public  static void printArray( int [] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int [] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        // choose a pivot
        int pivot = arr[highIndex];
        int leftP = lowIndex;
        int rightP = highIndex;

        while(leftP < rightP){
            while(arr[leftP] <= pivot && arr[rightP] > arr[leftP]){
                leftP++;
            }
            while (arr[rightP] >= pivot && leftP < rightP){
                rightP--;
            }
            swap(arr,leftP,rightP);
        }
        swap(arr,leftP,highIndex);
        quickSort(arr,lowIndex,leftP -1);
        quickSort(arr,leftP+1,highIndex);
    }
    private static void swap(int [] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}


