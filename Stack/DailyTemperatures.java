import java.util.*;

public class DailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
//here applying monotonic stack, that start iterating from the end of the array so that elemnets info will be there to perform operations
      
        for(int i = n - 1; i >= 0; i--){      
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()) answer[i] = st.peek() - i;
            st.push(i);
        }
        return answer;
    }
    static void main() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
