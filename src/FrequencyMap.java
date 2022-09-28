public class FrequencyMap {
    public static int[] charFreq(String word){
        int [] count  = new int[26];
        for(char c: word.toCharArray()){
            count[c-'a']++;
        }
        return count;
    }

    public static int[] numFreq(int[] array, int size){
        int [] count = new int[size+1];
        for(int c: array){
            count[c]++;

        }
        return count;
    }
}
