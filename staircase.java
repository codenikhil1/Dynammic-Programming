
public class Solution {
	
	public static long staircase(int n,long[]  Storage){
        if(n==0){
            Storage[n+1] = 1;
            return Storage[n+1];
        }
        if(Storage[n] !=0){
            return Storage[n];
        }
      long  count = 0;
        count += staircase(n-1,Storage);
        if(n/2 >=0 && n>=2){
            count+=staircase(n-2,Storage);
        }
        if(n/3 >=0 && n>=3){
            count+=staircase(n-3,Storage);
        }
        Storage[n] = count;
        return Storage[n];
        
    }
public static long staircase(int n){
   long[] Storage = new long[n+1];
    Storage[1] = 1;
    return staircase(n,Storage);
	}
	
}
