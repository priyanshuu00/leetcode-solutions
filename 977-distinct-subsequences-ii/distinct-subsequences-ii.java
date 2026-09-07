class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1_000_000_007;

        long dp = 1;  // empty subsequence

        long[] last = new long[26];

        for (char ch : s.toCharArray()) {
            int c = ch - 'a';

            long newDp = (2 * dp - last[c] + MOD) % MOD;

            last[c] = dp;
            dp = newDp;
        }

        // Remove empty subsequence
        return (int) ((dp - 1 + MOD) % MOD);
    }
}