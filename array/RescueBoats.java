//Boats to save people
//there are infinite number of boats, each boat can carry two people at most and having a weight 'limit' that shouldn't be extended!
// Find the minmum number of boats required to carry out off the people. The array shows the number of people and elements shows the weight of that particular person

import java.util.*;
public class Main{
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int left = 0, right = people.length - 1;

        while(left <= right){
            if(people[left] + people[right] <= limit) left++;
            right--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args){
        int[] people = {3,5,3,4};
        int limit = 5;

        System.out.println(numRescueBoats(people, limit));
    }
}
