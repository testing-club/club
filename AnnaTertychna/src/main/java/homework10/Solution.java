package homework10;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution  = new Solution();
        System.out.println(solution.solution("abba"));
        System.out.println(solution.solution("a"));
        System.out.println(solution.solution("dddd"));
        System.out.println(solution.solution("world"));
        System.out.println(solution.solution("cycle"));
    }
    public int solution(String s) {
        int count = 1;
        Set<Character> subString = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (subString.contains(c)) {
                count++;
                subString.clear();
            }
            subString.add(c);
        }
        return count;
    }
}
