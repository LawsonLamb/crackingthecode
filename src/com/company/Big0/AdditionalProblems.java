package com.company.Big0;

/**
 * Created by @Lawson Lamb  on 2/16/2017.
 */
public class AdditionalProblems {
    // The following code computes the product of a and b. What is its Runtime?
    public int product(int a, int b){
        int sum =0;
        for(int i=0;i<b;i++){
            sum+=a;
        }
        return sum;
    }

    // The following code computes a^b. What is its RunTime
    public int power(int a,int b){
        if(b<0){
            return 0; //error
        } else if(b ==0){
            return 1;
        }
        else{
            return a * power(a,b-1);
        }
    }

    // The following code computes a%b What is its runtime
    public int mod(int a, int b){
        if(b<=0){
            return -1;
        }
        int div = a/b;
        return a - div*b;
    }

    // the following code performs integer divison. What is its runtime(assume a and b are both positive)
    public int div(int a,int b){
        int count =0;
        int sum =b;
        while(sum<=a){
            sum+=b;
            count++;
        }
        return count;
    }

    /* The following code computes the [integer] square rot of a number.
     if the number is not a perfect square (there is no integer square root)
     then it returns -1. It does this by succesive guessing. If n is 100,it first guesses 50.
     Too High? Try something lower - halfway between 1 and 50 what is its runtime.
    */

    int sqrt(int n){
        return sqrt_helper(n,1,n);
    }

    int sqrt_helper(int n,int min,int max){
        if(max<min) return -1;
        int guess  =  (min+max)/2;
        if(guess + guess ==n){
            return guess;
        } else if(guess*guess <n){ //too low
            return sqrt_helper(n,guess+1,max);
        }
        else { // too high
            return sqrt_helper(n,min,guess-1);
        }
    }

    /*
     The Following code computes the integer square root of a number. if the number is not a perfect square
      (there is not integer square root), then it returns -1. It does this by trying increasingly large numbers until
         it finds the right value(or is too high) What is its runtime?
     */

    int sqrt2(int n){
        for(int guess =1;guess*guess<=n;guess++){
            if(guess*guess==n){
                return guess;
            }

        }
        return -1;
    }

    // if a binary search tree is not balanced , how long might it take(worst case) to find an element in it?

    //You are looking for a specific value in a binary tree,but the tree is not a binary search tree.
    // What is the time complexity of this?


    /* The appendToNew method appends a value to an array by creating a new,longer array and returning this longer array
     You've used the appendToNew method to create a copyArray function that repeatedly calls appendToNew.
      How long does copying an array take?
    */
    int[] copyArrary(int [] arrary){
        int [] copy = new int[0];
        for(int value:arrary){
            copy = appendToNew(copy,value);
        }
        return copy;
    }
    int[] appendToNew(int [] arrary,int value){
        //copy all elements over to new arrary
        int[] bigger = new int[arrary.length+1];
        for(int i=0;i<arrary.length;i++){
            bigger[i] = arrary[i];
        }
        // add new element
        bigger[bigger.length-1] = value;
        return bigger;
    }

    // the following code sums the digits in a number. What is its big O times?

    int sumDigits(int n){
        int sum =0;
        while(n>0){
            sum+=n %10;
            n /=10;
        }
        return sum;
    }

    //the following code prints all string of length k where the characters are in sorted order.
    // it does this by generating all string of length k then checking if each is sorted
    // What is its Runtime?

    int numchars = 26;
    void printSortedStrings(int remaining){
        printSortedStrings(remaining,"");

    }

    void printSortedStrings(int remaining,String prefix){
        if(remaining==0){
            if(isInOrder(prefix)){
                System.out.println(prefix);
            }
            else{
                for (int i=0;i<numchars;i++){
                    char c= ithLetter(i);
                    printSortedStrings(remaining-1,prefix+c);
                }
            }
        }
    }
    boolean isInOrder(String s){
        for(int i=1;i<s.length();i++){
            int prev = ithLetter(s.charAt(i-1));
            int curr = ithLetter(s.charAt(i));
            if(prev>curr){
                return  false;
            }
        }
        return true;
    }
    char ithLetter(int i){
        return (char) (((int) 'a')+1);
    }

    /*
    The following code computes the intersection(the number of elements in common) of two arrays.
    It assumes that neither array has duplicates. It computes the intersection by sorting ne array(array b) and
    then iterating though array a checking(via binary search) if each value is in b. What is its runtime?
     */

    int intersection(int [] a,int [] b){
        mergesort(b);
        int intersect =0;
        for(int x:a){
            if(binarysort(b,x)>=0){
                intersect++;
            }
        }
        return intersect;
    }

    void mergesort(int [] b){

    }
    int binarysort(int[] b,int x){
         return 1;
    }
}
