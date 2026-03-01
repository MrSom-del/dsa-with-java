import java.util.*;
public class LongSubSNoD {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character>chars = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        for(int i = 0; i < s.length(); i++){
            while(chars.contains(s.charAt(i))){
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - l + 1);
        }
        return maxLen;
    }
    static void main() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
