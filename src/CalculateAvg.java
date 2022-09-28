public class CalculateAvg {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(find_Average(list));
    }
    public static double find_Average(int [] Arr){
        double avg = 0;
        int total = 0;
        if (Arr == null){
            return 0;
        }
        for (int i = 0; i < Arr.length; i++){
            total += Arr[i];
        }
        System.out.println("tot is " + total);

        avg =  (double) total/Arr.length;
        return avg;

    }
}
