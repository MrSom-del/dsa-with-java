//here the height[] array describes the height of the conatiners and n describes the number of conatainers 
//we need to find the maximum area the water having between the two containers
//we use two pointers here, if the pointer i will be smalle rthan that of j i.e, at the end of the array, i++ will be comducted
//else j--
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxArea = 0;

        while(i<j){
            maxArea = Math.max(maxArea, (j - i)*Math.min(height[i], height[j]));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxArea;
    }
