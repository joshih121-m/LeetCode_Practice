import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (set.contains(ch)) {
                continue;
            }

            while (!set.isEmpty()) {

                char last = getLast(set);

                if (last > ch && s.indexOf(last, i + 1) != -1) {
                    set.remove(last);
                } else {
                    break;
                }
            }

            set.add(ch);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

    private char getLast(Set<Character> set) {
        char last = 0;

        for (char ch : set) {
            last = ch;
        }

        return last;
    }
}