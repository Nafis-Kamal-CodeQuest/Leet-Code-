class Solution {
    public int[] countBits(int n) {
        
        int arr[] = new int[n+1];

         for (int i = 0; i <= n; i++) {
            arr[i] = Integer.bitCount(i); // ✅ Counts number of 1s in binary
        }
        
        return arr;
    }
}
