//we need ro check and return the number of windows (subarrays), having avergae greater than or equal to threshold value 
public class AvgGreterThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum+=arr[i];
        }
        int count = 0;
        if(sum/k >= threshold){
            count++;
        }
        for(int i = k; i<arr.length; i++){
            sum+=arr[i] - arr[i-k];
            if(sum/k >= threshold) count++;
        }
        return count;
    }
    static void main() {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}
