class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            // Case 1: Even prime number (2)
            if (x == 2) {
                ans[i] = -1;
            } 
            // Case 2: Odd prime numbers
            else {
                // Find the length of the trailing string of 1s.
                // ~x inverts the bits, so trailing 1s become trailing 0s.
                // Integer.numberOfTrailingZeros(~x) counts them efficiently.
                int trailingOnes = Integer.numberOfTrailingZeros(~x);
                
                // We minimize the result by unsetting the MOST significant bit 
                // of that trailing sequence of 1s.
                ans[i] = x - (1 << (trailingOnes - 1));
            }
        }
        return ans;
    }
}