package com.github.longylg.first;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 字母异位词分组
 *
 * @author liyulong
 * @link https://leetcode.cn/problems/group-anagrams/?envType=study-plan-v2&envId=top-100-liked
 * @date 2023-09-18 10:38
 */
public class Training16 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(s);
            } else {
                List slist = new ArrayList<>();
                slist.add(s);
                map.put(sortedStr, slist);
            }
        }
        return map.values().stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for (List<String> groupAnagram : groupAnagrams(strs)) {
            for (String s : groupAnagram) {
                System.out.println(s);
            }
        }
    }
}
