public class Class125 {
    public boolean isPalindrome(String s){
        int left = 0;
         int right = s.length() -1;

         while(left <= right){
             while(!Character.isLetterOrDigit(s.charAt(left))){
                 left++;
             }
             while(!Character.isLetterOrDigit(s.charAt(right))){
                 right --;
             }
             if( Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                 return false;
             }
             right--;
             left++;
         }
         return false;
    }
}
