import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int maxx = 0;
        for(int n:nums) set.add(n);
        for(int n: set){
            if(!set.contains(n-1)){
                int curren = n;
                int longest = 1;
                while(set.contains(curren + 1)){
                    curren ++;
                    longest ++;
                }
                maxx = Math.max(maxx, longest);
            }
        }
        return maxx;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
