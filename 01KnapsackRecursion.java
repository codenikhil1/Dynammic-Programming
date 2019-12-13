public class Solution {
	
	public static int knapsack(int[] weight,int value[],int maxWeight, int n){
            return Knapsack(weight,value,maxWeight,n,0);
	}
    public static int Knapsack(int[] weight,int value[],int maxWeight, int n,int i){
               if( i == weight.length || maxWeight == 0){
                   return 0;
               }
        if(maxWeight < weight[i]){
            return Knapsack(weight,value,maxWeight,n,i+1);
        }else{
            int op1 = value[i]+ Knapsack(weight,value,maxWeight-weight[i],n,i+1);
            int op2 =  Knapsack(weight,value,maxWeight,n,i+1);
            return Math.max(op1,op2);
        }
        
        
    }
}
