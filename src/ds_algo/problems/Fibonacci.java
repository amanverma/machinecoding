package ds_algo.problems;//print kth fibonacci number
//0,1,1,2,3,5,8,13
// T(n) = T(n-1) + T(n-2)


//tri-fibonacci
//T(n+3) = T(n) + T(n+1) + T(n+2) => 0,1,1,2,4,7,13,24,.....=>


//import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    static HashMap<Integer, Integer> cache2 = new HashMap<>();
    public static int fib(int n){
        if(n<2) return n;
        if(cache.containsKey(n)){ //Time complexity -- O(N)
            return cache.get(n);
        }

        int val = fib(n-1)+ fib(n-2); // Time complexity O(2^N)
        cache.put(n, val);

        return val;

    }

    public static int triFib(int n){
        if(n<2) return n;
        if(n==2) return 1;
        if(cache2.containsKey(n)){ //Time complexity -- O(N)
            return cache2.get(n);
        }

        int val = triFib(n-1)+ triFib(n-2) + triFib(n-3); // Time complexity O(2^N)
        cache2.put(n, val);

        return val;

    }

    public static void main(String[] args){
        System.out.println(fib(20));
        System.out.println(triFib(20));

    }


    /*
    *  fib(20) = fib(19) + fib(18)
    *       fib(19) = fib(17) + fib(18)
    *       fib(18) = fib(17) + fib(16)
    *               fib(17) =
    *
    *
    *    1
    * 1  1
    * 1 2 1
    * i=0 , j=0, i==j  ==>1
    *
    *
    *
    *
    *
    *
    * */

}
