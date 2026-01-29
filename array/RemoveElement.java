import java.util.*;

public class Main{
  
    public static int removeElement(int[] nums, int val) {
        int k = 0;                                            //initialising an integer k that gonna stores the rest of elemnts 
        for(int i = 0; i<nums.length; i++){                   // that doesn't contain the 'val' value
            if(nums[i] != val){
                nums[k] = nums[i];                            // storing the value 
                k++;
            }
        }
    return k;
    }
  
  public static void main(String[] args){
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    System.out.println(removeElement(nums, val));             // the output will return the number of elements that are presnet in the array
  }
}

