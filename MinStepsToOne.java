public class Solution {
	public static int countStepsTo1(int n,int[] Storage){
        Storage[1] = 0;
        
        for(int i=2;i<=n;i++){
            int min = Storage[i-1];
            if(i%2 == 0){
                min = Math.min(min,Storage[i/2]);
            }
            if(i%3 == 0){
                min = Math.min(min,Storage[i/3]);
            }
            Storage[i] = min+1;
        }
        return Storage[n];
    }
	public static int countStepsTo1(int n){
		int[] Storage = new int[n+1];
        return countStepsTo1(n,Storage);
	}
	
}
