import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/group-anagrams/description/
 */
public class GroupAnagrams {
    //
    public static void main(String[] args) {
        //
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result.toString());
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        //
        if (strs == null || strs.length < 1) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String keyStr = String.valueOf(chars);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    // Stream
    public static List<List<String>> groupAnagramsByStream(String[] strs) {
        //
        if (strs == null || strs.length < 1) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        Arrays.stream(strs).forEach(str -> {
            String keyStr = Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
            map.putIfAbsent(keyStr, new ArrayList<>());
            map.get(keyStr).add(str);
        });

        return new ArrayList<>(map.values());
    }
}

