import java.util.*;

public class ProductExecSelf {
    public static int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];
        HashMap<Integer,Integer> prefixmap = new HashMap<>();
        HashMap<Integer,Integer> postixmap = new HashMap<>();

        int pre = 1;
        for(int i = 0; i<nums.length; i++){         //map contains the key i and storing(updating its value)
                                                    // as the loop reaches the end of the element

            prefixmap.put(i, pre);
            pre *= nums[i];
        }
        int post = 1;
        for(int i = nums.length-1; i>=0; i--){
            postixmap.put(i, post);
            post *= nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            answer[i] = prefixmap.get(i) * postixmap.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
