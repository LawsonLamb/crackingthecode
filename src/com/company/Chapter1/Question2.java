package com.company.Chapter1;

import com.company.Question;
import com.sun.tools.javac.code.Attribute;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Question2 implements Question {
    private String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    // not my soultion;

    public  boolean isPermentation (String a,String b){
        return sort(a).equals(sort(b));



    }


    @Override
    public void Run() {

    }
}
