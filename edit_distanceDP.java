
public class Solution {

	
	public static int editDistance(String s1, String s2){
		int m = s1.length();
        int n = s2.length();
        int Storage[][] = new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
                Storage[i][0]=i;
        }
        
        for(int i=0;i<=n;i++){
                Storage[0][i]=i;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(m-i) == s2.charAt(n-j)){
                    Storage[i][j] = Storage[i-1][j-1];
                }else{
                    Storage[i][j] = 1+Math.min(Storage[i][j-1],Math.min(Storage[i-1][j],Storage[i-1][j-1]));
                }
            }
        }
        return Storage[m][n];

	}

	
}
