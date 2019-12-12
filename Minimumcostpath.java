public static int mincostDP(int input[][],int storage[][]) {
		int m=input.length;
		int n=input[0].length;
		
		for(int j = n-2;j>=0;j--) {
			storage[m-1][j]= storage[m-1][j+1]+input[m-1][j];
		}
		for(int i= m-2;i>=0;i--) {
			storage[i][n-1]= storage[i+1][n-1]+input[i][n-1];
		}
		for(int  i = m-2;i>=0;i--) {
			for(int j = n-2;j>=0;j--) {
				storage[i][j] = input[i][j]+ Math.min(storage[i+1][j], 
						Math.min(storage[i][j+1],storage[i+1][j+1]));
			}
		}
		return storage[0][0];
	}
	public static int mincostDP(int input[][]) {
		int m = input.length;
		int n = input[0].length;
		
		int storage[][] = new int[m][n];
		
		storage[m-1][n-1] = input[m-1][n-1];
		
		return mincostDP(input,storage);
	}
//call by main passing it by matrix
