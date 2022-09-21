package packageFront;

public class TotalIslandProblem {

	static int totalIslands(int[][] arr){
		int rows=arr.length;
		int totalIsland=0;
		if(rows==0){
			return 0;
		}
		int col=arr[0].length;
		//		if(col==0){
		//			return 0;
		//		}

		for(int i = 0;i<rows; i++){
			for(int j = 0;j<col; j++){
				if(arr[i][j]==1){
					markcurrent(arr,i,j,rows,col);
					totalIsland++;
				}
			}
		}
		return totalIsland;
	}



	static void markcurrent(int[][] arr,int i,int j,int rows,int col){
		if(i<0||j<0||i>=rows||j>=col|| arr[i][j]!=1){
			return;
		}
		arr[i][j]=2;
		markcurrent(arr,i-1,j,rows,col);
		markcurrent(arr,i+1,j,rows,col);
		markcurrent(arr,i,j-1,rows,col);
		markcurrent(arr,i,j+1,rows,col);
	}


	public static void main(String[] args) {
		int[][] arr= {{0,1,1,0,0},
				{0,1,1,0,1},
				{0,0,0,0,1}};
		
		int t= totalIslands(arr);
		System.out.println("total: "+t);


	}


}
