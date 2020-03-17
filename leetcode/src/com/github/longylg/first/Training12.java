package com.github.longylg.first;

/**
 * @author liyulong
 * @date 2020-03-16 10:04 上午
 */
public class Training12 {
    public static void main(String[] args) {
        System.out.println(new Training12().compressString("aabcccccaaa"));
    }

    /**
     * 字符串压缩
     * https://leetcode-cn.com/problems/compress-string-lcci/
     *
     * @param S
     * @return
     */
    public String compressString(String S) {
        char[] chars = S.toCharArray();
        String compressStr = "";
        int n = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                n++;
            } else {
                sb.append(Character.toString(chars[i]) + n);
                n = 1;
            }

        }
        compressStr = sb.toString();
        if (compressStr.length() < S.length()) {
            return compressStr;
        }

        return S;
    }
}
