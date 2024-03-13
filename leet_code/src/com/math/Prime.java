package com.math;

class Prime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int countPrimes = countPrimes(10);
		System.out.println("countPrimes: " + countPrimes);
	}
	
    public static int countPrimes(int n) {
        int count = 0;

        // Check for edge cases where n is less than or equal to 2
        if (n <= 2) {
            return 0;
        }

        // Initialize an array to track whether a number is prime
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Use Sieve of Eratosthenes to mark multiples of primes as not prime
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}

