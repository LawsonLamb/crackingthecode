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

}
