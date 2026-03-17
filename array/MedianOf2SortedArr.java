import java.util.*;

public class Median2SortArr {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];

        System.arraycopy(nums1, 0, result, 0, m);
        System.arraycopy(nums2, 0, result, m, n);

        Arrays.sort(result);

        int totalLength = result.length;
        int mid = totalLength / 2;

        if (totalLength % 2 != 0) {
            return (double) result[mid];
        } else {
            return (double) (result[mid - 1] + result[mid]) / 2.0;
        }
    }
    static void main() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
