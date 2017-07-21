package Offer_09;

public class Fibonacci {
     public long fibonacci(int n){
    	 int[] result = {0,1};
    	 if(n<2)
    		 return result[n];
    	 long fibonacciOne = 0;
    	 long fibonacciTwo = 1;
    	 long fibN =0;
    	 for(int i = 2;i<= n;i++){
    		 fibN = fibonacciOne + fibonacciTwo;
    		 fibonacciOne = fibonacciTwo;
    		 fibonacciTwo = fibN;
    	 }
    	 return fibN;
     }
}
