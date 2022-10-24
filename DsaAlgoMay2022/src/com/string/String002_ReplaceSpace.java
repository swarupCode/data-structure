package com.string;

import java.util.Stack;

public class String002_ReplaceSpace {
    public static void main(String[] args) {
        String s = "Mr John Smith \", 13";

        String new_string = s.replaceAll("\\W", "%20");
        System.out.println(new_string);


        /*char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length; i++) {
            if ((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z')){
                sb.append(str[i]);
            } else {
                if(i > 0 && sb.charAt(sb.length()-1) != '0') {
                    sb.append("%20");
                }
            }
        }
        System.out.println(sb.toString());*/

//        String str = getReplacedString(s);
        System.out.println(s);
    }

    private static String getReplacedString(String s) {
        char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for (int i=0; i<str.length; i++) {
            if(!stk.empty() && stk.peek().equals(' ') && (str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z') && i>0) {
                sb.append("%20");
            }
            if ((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z') || str[i]==' '){
                if(str[i]!=' ') {
                    sb.append(str[i]);
                }

                stk.push(str[i]);
            } else {
                if(!stk.empty()){
                    stk.pop();
                }
            }
        }
        return sb.toString();
    }
}
