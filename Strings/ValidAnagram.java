import java.util.*;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sAna = s.toCharArray();
        char[] tAna = t.toCharArray();

        Arrays.sort(sAna);
        Arrays.sort(tAna);

        if(Arrays.equals(sAna,tAna)) return true;
    return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaran";
        System.out.println(isAnagram(s,t));
    }
}
