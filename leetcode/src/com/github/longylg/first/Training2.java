package com.github.longylg.first;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liyulong
 */
public class Training2 {

    /**
     * 变位词组
     *
     * https://leetcode-cn.com/problems/group-anagrams-lcci/
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        List<Integer> mark = new ArrayList<>(strs.length);
        for (int i = 0; i < strs.length; i++) {
            if (mark.contains(i)) {
                continue;
            }
            List<String> childs = new ArrayList<>();
            childs.add(strs[i]);

            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].length() == strs[j].length()) {
                    char[] b1 = strs[i].toCharArray();
                    char[] b2 = strs[j].toCharArray();
                    Arrays.sort(b1);
                    String s1 = new String(b1);
                    Arrays.sort(b2);
                    String s2 = new String(b2);
                    if (s1.equals(s2)) {
                        childs.add(strs[j]);
                        mark.add(j);
                    }
                }
            }
            lists.add(childs);
        }

        return lists;
    }


    public static void main(String[] args) {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Training2.groupAnagrams(strings);
    }
}
