//here nums is the array that stores the numbers and k is the window size given.
//We need to find find whetehr there duplicates of any element (say at j index) present or not. If yes, we'll compare the abs(i-j)<=k
//return true, else false

import java.util.*;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> dup = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(dup.containsKey(nums[i]) && i - (dup.get(nums[i])) <= k) return true;
            dup.put(nums[i], i);
        }
        return false;
    }
    static void main() {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
