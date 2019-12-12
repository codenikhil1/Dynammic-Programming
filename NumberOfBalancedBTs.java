
public class Solution {

    static int MOD = (int)(1000000007);
	public static int balancedTreesOfHeightH(int h){
		 int[] dp = new int[h + 1]; 
          
        
        dp[0] = 1; 
        dp[1] = 1; 
          
        for(int i = 2; i <= h; i++)  {
                int x = dp[i-1];
                int y = dp[i-2];
                long res1 = (int) x * x;
                long res2 = (int)2*y+x;
                
        }
            dp[i] = ((dp[i - 1] %MOD)* ((2 * dp [i - 2])% MOD + dp[i - 1]) % MOD) % MOD; 
              
            return dp[h]; 

	}
}
