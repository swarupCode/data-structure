package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
    public static void main(String[] args) {
        matchingStringRegex();
//        splitString();
    }

    public static void matchingStringRegex() {
        Pattern pattern = Pattern.compile("a?");
        Matcher matcher = pattern.matcher("abaabaaab");
        while (matcher.find()) {
//            System.out.println(matcher.start()+ "; " + (matcher.end()-1) + "; "+ matcher.group());
            System.out.println(matcher.start()+ "; "+ matcher.group());
        }
    }

    public static void splitString() {
        Pattern pattern = Pattern.compile("\\W");
        String[] matcher = pattern.split("I am a good boy!");
        for (String m : matcher) {
            System.out.println(m);
        }

    }
}
