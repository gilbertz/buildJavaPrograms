package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhao on 16/8/29.
 */
public class ComputeNprime {
    public static void main(String args[]){
        int n = 5;
        List<Integer> primes = new ArrayList<>();
        int number = 3;
        while(primes.size() != n){
            boolean isPrime = true;
            for (Integer it: primes) {
              if(it == number) break;
                if(number % it ==0) isPrime = false;
            }

            if(isPrime) primes.add(number);
            number += 2;
        }
        System.out.println(primes.get(primes.size()-1));
    }


}
