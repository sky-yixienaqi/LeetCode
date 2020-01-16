package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/16 11:20
 * @Description:
 * @UpdateDate: 2020/1/16 11:20
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1309 {

    public static void main(String[] args) {
//        char a = '\0';
//        System.out.println(a);
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }

    public static String freqAlphabets(String s) {
        char[] dic = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] chars = s.toCharArray();
        StringBuffer str = new StringBuffer();
        for(int i = chars.length - 1; i >=0 ; i--){
            if(chars[i] != '\0'){
                if(chars[i] == '#'){
                    str.append(dic[Integer.valueOf(String.valueOf(chars[i-2]) + String.valueOf(chars[i-1])) - 1]);
                    chars[i-2] = '\0';
                    chars[i-1] = '\0';
                } else {
                    str.append(dic[Integer.valueOf(String.valueOf(chars[i])) - 1]);
                }
            }
        }
        return str.reverse().toString();
    }
}
