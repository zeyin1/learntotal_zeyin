package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *3. 无重复字符的最长子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3
 */

public class Code_3 {
    public static int lengthOfLongestSubstring(String s) {
        int result=0;
        int begin=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int index=0;index<s.length();index++){
            if (map.containsKey(s.charAt(index))){
                //从重复元素的下一个元素开始
                begin=Math.max(begin,map.get(s.charAt(index))+1);
            }
            map.put(s.charAt(index),index);
            result=Math.max(result,index-begin+1);
        }
        return result;
    }

    public static void main(String[] args) {
        String input="abcabcbb";
        int result=lengthOfLongestSubstring(input);
        System.out.println(result);
    }
}
