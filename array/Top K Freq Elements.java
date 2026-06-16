import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }
        Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b)); //min heap based on frequency, priority based on element have minimum repeated freq
        for(int key : freq.keySet()){
            minHeap.add(key);
            if(minHeap.size() > k) minHeap.poll();
        }
        for(int i = 0; i < k; i++){
            res[i] = minHeap.poll();
        }
        return res;
    }
    static void main() {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
