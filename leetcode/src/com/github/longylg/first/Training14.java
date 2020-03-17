package com.github.longylg.first;

import java.util.*;

/**
 * @author liyulong
 * @date 2020-03-17 9:47 上午
 */
public class Training14 {
    public static void main(String[] args) {
//        int length = new Training14().countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach");
        int length2 = new Training14().countCharacters2(new String[]{"cat", "bt", "hat", "tree"}, "atach");
//        System.out.println(length1);
        System.out.println(length2);
    }

    /**
     * 拼写单词 hashMap版本
     * https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
     *
     * @param words
     * @param chars
     * @return
     */
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> map = new HashMap<>(chars.length());
        for (int i = 0; i < chars.toCharArray().length; i++) {
            map.put(chars.toCharArray()[i], map.getOrDefault(chars.toCharArray()[i], 0) + 1);
        }
        int spellLength = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            HashMap<Character, Integer> temp = (HashMap<Character, Integer>) map.clone();
            int hitLength = 0;
            for (char c : word.toCharArray()) {
                if (temp.containsKey(c) && temp.get(c) > 0) {
                    temp.put(c, temp.get(c) - 1);
                    hitLength++;
                }
            }
            if (hitLength == word.length()) {
                spellLength += hitLength;
            }
        }
        return spellLength;
    }

    /**
     * 使用int数组
     *
     * @param words
     * @param chars
     * @return
     */
    public int countCharacters2(String[] words, String chars) {

        int[] ints = new int[26];
        for (int i = 0; i < chars.toCharArray().length; i++) {
            ints[chars.toCharArray()[i] - 'a'] += 1;
        }
        int spellLength = 0;
        for (String word : words) {
            int hit = 0;
            int[] temp = ints.clone();
            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] > 0) {
                    temp[c - 'a']--;
                    hit++;
                }
            }
            if (hit == word.length()) {
                spellLength += hit;
            }
        }
        return spellLength;
    }
}
