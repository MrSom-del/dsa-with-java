import java,util.*;
public class MergeStringAlt {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();

        for(int i = 0; i<Math.max(n1,n2); i++){
            if(i<n1){
                res.append(word1.charAt(i));
            }
            if(i<n2){
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }

    static void main() {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
}
