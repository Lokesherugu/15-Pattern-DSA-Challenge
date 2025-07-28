import java.util.Set;

public class LC1456_MaxVowelsInSubstring {
    public int maxVowels(String s, int k) {
        int maxVowels = 0, count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }

            if (i >= k) {
                if (vowels.contains(s.charAt(i - k))) {
                    count--;
                }
            }

            maxVowels = Math.max(maxVowels, count);
        }

        return maxVowels;
    }
}
