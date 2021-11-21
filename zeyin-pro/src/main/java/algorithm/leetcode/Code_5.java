package algorithm.leetcode;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 */
public class Code_5 {
    public static String longestPalindrome(String s) {
        if (s==null||s.length()==0){
            return "";
        }
        int begin=0;
        int end=0;
        for (int index=0;index<s.length();index++){
            int len1=findCentrol(index,index+1,s);
            int len2=findCentrol(index,index,s);
            int len=Math.max(len1,len2);
            //回文长度：end-begin+1
            if (len>end-begin+1){
                begin=index-(len-1)/2;
                end=index+len/2;
            }
        }
        return s.substring(begin,end+1);
    }

    //中心法则，返回回文长度
    private static int findCentrol(int left,int right,String str){
        while (left>=0&&right<str.length()&&str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        //left,right落在非回文的索引地方，所以需要减去1
        return right-left-1;
    }


    public static void main(String []args){
        String input="babad";
        String result=longestPalindrome(input);
        System.out.println(result);
    }
}
