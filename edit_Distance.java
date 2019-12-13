
public class Solution {
	public static int editDistance(String s1, String s2){		
		int m = s1.length();
        int n = s2.length();
        
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        
        if(s1.charAt(0) == s2.charAt(0)){
                return editDistance(s1.substring(1),s2.substring(1));
        }else{
            
           int op1 = editDistance(s1,s1.charAt(0)+s2);   //insert
            int op2 = editDistance(s1,s2.substring(1));                  //delete
            int op3= editDistance(s1,s1.charAt(0)+s2.substring(1));  //update
            
            return 1+Math.min(op1,Math.min(op2,op3));
        }
        
	}
}
