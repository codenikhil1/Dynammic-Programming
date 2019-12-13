package DP;

public class LongestCommonSubsequence {

	public static int LongestCommonSubsequence(String s,String t) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		if(s.charAt(0) == t.charAt(0)) {
			return 1 + LongestCommonSubsequence(s.substring(1),t.substring(1));
		}else {
			int op1 = LongestCommonSubsequence(s,t.substring(1));
			int op2 = LongestCommonSubsequence(s.substring(1),t);
			return Math.max(op1, op2);
		}
	}
	public static int lcsM(String s,String t,int[][] Storage,int i,int j) {
		if(s.length() == 0 || t.length() == 0) {
			Storage[s.length()][t.length()] = 0;
			return 0;
		}
		if(Storage[i][j]!=-1) {
			return Storage[i][j];
		}else {
			if(s.charAt(0) == t.charAt(0)) {
				Storage[i][j]=1 + lcsM(s.substring(1),t.substring(1),Storage,i+1,j+1);
				return Storage[i][j];
			}else {
				int op1 = lcsM(s,t.substring(1),Storage,i,j+1);
				int op2 = lcsM(s.substring(1),t,Storage,i+1,j);
				Storage[i][j]=Math.max(op1, op2);
				return Storage[i][j];
			}
		}
	}
	
	public static int lcsM(String s,String t) {
		int Storage[][]= new int[s.length()+1][t.length()+1];
		for(int i = 0 ;i<s.length()+1;i++) {
			for(int j=0;j<t.length()+1;j++){
				Storage[i][j]=-1;
			}
		}
		return lcsM(s,t,Storage,0,0);
	}
	public static int lcsDP(String s,String t) {
		int m = s.length();
		int n= t.length();
		int[][] Storage = new int[m+1][n+1];
		for(int i = 0 ; i<=m;i++) {
			Storage[i][0] = 0;
		}
		for(int i = 0 ; i<=n;i++) {
			Storage[0][i] = 0;
		}
		for(int i = 1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					Storage[i][j] = 1 + Storage[i-1][j-1];
				}else {
					Storage[i][j] = Math.max(Storage[i][j-1], Storage[i-1][j]);
				}
			}
		}
		return Storage[m][n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nikhilsjdkjsdjkasjkdhjsk";
		String t = "sakshikdfjklsdjkf";
		String u ="SAkshi";
		System.out.println(u.length());
		System.out.println(lcsDP(s,t)); //DynammicProgramming
		System.out.println(lcsM(s,t));  //Memoization
		System.out.println(LongestCommonSubsequence(s,t));  //Recursion
		
		
		
	}

}
