package com.company.Chapter1;


import com.company.Question;

/**
 * implement an algorithm to determine if a string has al unique characters. What if you cannot use additional data structures
 */
public class Question1 implements Question {

    public boolean isUnique(String string){

        char[] arr = new char[string.length()];

        for(int i=0; i< string.length();i++){
            char  c  = string.charAt(i);
            System.out.println(c);
           for(int j =0;j<arr.length;j++){
               if(c == arr[j]){
                   System.out.println("TRUE");
                return true;
               }
               else if(c!=arr[j]){
                 System.out.println("ADD: " + c);
                   arr[j] = c;
               }
           }

        }
        return false;

    }



    @Override
    public void Run() {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUnique(word));
        }
    }
}
