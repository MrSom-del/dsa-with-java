//in this, the input array is already given sorted to us
//we need to find the indexin of the elements that sums up to the traget one, also we need to return the indexing by addin 1 to it 
import java.util.*;
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while(i<j) {
            int total = numbers[i] + numbers[j];
            if (total == target) return new int[]{i+1,j+1}; //here we're adding 1 to the indexing of both of the pointers after finding the target
            else if (total > target) j--;
            else i++;
        }
        return new int[]{};
    }
    static void main() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
