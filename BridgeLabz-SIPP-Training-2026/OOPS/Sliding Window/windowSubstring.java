import java.util.*;
public class windowSubstring {
    static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int start = 0;
        int count = t.length();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                if (map.get(c) > 0)
                    count--;
                map.put(c, map.get(c) - 1);
            }
            while (count == 0) {
                if (end - start + 1 < min) {
                    min = end - start + 1;
                    index = start;
                }
                char ch = s.charAt(start);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                    if (map.get(ch) > 0)
                        count++;
                }
                start++;
            }
        }
        if (min == Integer.MAX_VALUE)
            return "";
        return s.substring(index, index + min);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minWindow(s, t));
    }
}