/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 986090
 */
public class FibonacciMemoized {
    
    int counter =0;
    int fib(int n) {
        int[] fibs = new int[n+1];
        for(int i=0; i <= n; i++) {
            fibs[i] = -1;
        }
        return memoizedFib(n, fibs);
    }
    int memoizedFib(int n, int[] F) {
        counter++;
        if(F[n] < 0) {
            if(n ==0)
                F[n] = 0;
            else if(n ==1)
                F[n] = 1;
            else 
                F[n] = memoizedFib(n-1, F) + memoizedFib(n-2, F);
        }
        return F[n];
    }
    
    public static void main(String[] args) {
        FibonacciMemoized f = new FibonacciMemoized();
        
        System.out.println(f.fib(30)); //832040
        System.out.println(f.counter); //59

    }
}
