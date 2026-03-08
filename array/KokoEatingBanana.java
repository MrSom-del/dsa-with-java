public int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = Integer.MIN_VALUE;
    for (int i : piles) {
        high = Math.max(i, high);
    }
    int res = high;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (totalEatingTime(piles, h, mid) <= h) {
            res = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return res;
    }
public int totalEatingTime(int[] piles, int h, int k) {
    int totalHours = 0;
    for (int i = 0; i < piles.length; i++) {
        totalHours += Math.ceil((double) piles[i] / k);
    }
    return totalHours;
}
