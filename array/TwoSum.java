import java.util.*;

public class Main{
  public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
        map.put(nums[i],i);
        }
        for(int i = 0; i< nums.length; i++){
            int tar = target - nums[i];
            if(map.containsKey(tar) && map.get(tar) != i) return new int[] {i, map.get(tar)};  // map.get is giving index of other pair
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
