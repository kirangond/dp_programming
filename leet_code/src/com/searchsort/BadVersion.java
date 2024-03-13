package com.searchsort;




public class BadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                // If mid is bad, search in the left half
                right = mid;
            } else {
                // If mid is not bad, search in the right half
                left = mid + 1;
            }
        }

        // The loop breaks when left == right, indicating the first bad version
        return left;
    }

    // Assume this is the API provided
    private boolean isBadVersion(int version) {
        // Implementation of the isBadVersion API
        // (This method's logic depends on your specific implementation)
        // Return true if the version is bad, false otherwise
        return true; // Placeholder; replace with the actual implementation
    }

    public static void main(String[] args) {
    	BadVersion solution = new BadVersion();
        													
        // Example 1
        int n1 = 5;
        int bad1 = 4;
        int result1 = solution.firstBadVersion(n1);
        System.out.println("First bad version for n=" + n1 + ": " + result1);

        // Example 2
        int n2 = 1;
        int bad2 = 1;
        int result2 = solution.firstBadVersion(n2);
        System.out.println("First bad version for n=" + n2 + ": " + result2);
    }
}
