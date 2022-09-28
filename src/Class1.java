import java.util.*; // import all libraries for convience

// 704 leetcode
public class Class1 {
    public int search (int [] nums, int target){
//        int index =-1;
//        for(int i = 0; i<nums.length;i++){
//            if(nums[i] == target){
//                return i;
//            }
//        }
//        return -1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int pivot = (left + right) / 2;

            if(nums[pivot] == target){
                return pivot;
            }
            if(nums[pivot] > target){
                right = pivot -1;
            } else if(nums[pivot] < target){
                left = pivot + 1;
            }
        }
        return -1;
    }




}

    // Binary search.

