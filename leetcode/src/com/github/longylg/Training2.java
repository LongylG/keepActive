package com.github.longylg;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liyulong
 */
public class Training2 {

    /**
     * 编写一种方法，对字符串数组进行排序，将所有变位词组合在一起。变位词是指字母相同，但排列不同的字符串。
     * <p>
     * 注意：本题相对原题稍作修改
     * <p>
     * 示例:
     * <p>
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * 输出:
     * [
     * ["ate","eat","tea"],
     * ["nat","tan"],
     * ["bat"]
     * ]
     * 说明：
     * <p>
     * 所有输入均为小写字母。
     * 不考虑答案输出的顺序。
     * <p>
     * 来源：力扣（LeetCode）
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
