class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;
        
        // Step 1: Create a 2D Prefix Sum array
        // Using m+1 and n+1 to handle boundary cases easily (1-based indexing)
        int[][] prefix = new int[m + 1][n + 1];
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = mat[i-1][j-1] 
                             + prefix[i-1][j] 
                             + prefix[i][j-1] 
                             - prefix[i-1][j-1];
            }
        }
        
        // Step 2: Binary Search for the maximum side length
        int low = 0, high = Math.min(m, n);
        int maxSide = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (hasValidSquare(prefix, m, n, mid, threshold)) {
                maxSide = mid;
                low = mid + 1; // Try for a larger square
            } else {
                high = mid - 1; // Try smaller square
            }
        }
        
        return maxSide;
    }
    
    // Helper function to check if any square of size 'len' has sum <= threshold
    private boolean hasValidSquare(int[][] prefix, int m, int n, int len, int threshold) {
        if (len == 0) return true;
        
        // Iterate through all possible bottom-right corners (r, c)
        // for a square of size 'len'
        for (int r = len; r <= m; r++) {
            for (int c = len; c <= n; c++) {
                // Calculate sum using the prefix sum formula
                // Top-left corner is (r-len, c-len) in the prefix matrix terms
                int currentSum = prefix[r][c] 
                               - prefix[r-len][c] 
                               - prefix[r][c-len] 
                               + prefix[r-len][c-len];
                
                if (currentSum <= threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}