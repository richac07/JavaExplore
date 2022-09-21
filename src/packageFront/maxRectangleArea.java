package packageFront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class maxRectangleArea {

	public static int max(int a, int b) {
		return (a>b?a:b);
	}
	public static int maxOfRectangleBinary(int[] arr) {
		int n = arr.length;
		int tempAns=0;
		int area = Integer.MIN_VALUE;
		int[] ls = new int[n];
		int[] rs = new int[n];

		Stack<Integer> stk = new Stack<>();
		
		// Left Smallest
		for(int i=0;i<n;i++) {
			if(stk.isEmpty()) {
				ls[i]=-1;
			}
			else if (stk.size()>0 && arr[stk.peek()]<arr[i]) {
				ls[i]=stk.peek();
			}
			else if(stk.size()>0 && arr[stk.peek()]>=arr[i]) {
				while(stk.size()>0 && arr[stk.peek()]>=arr[i]) {
					stk.pop();
				}

				if(stk.isEmpty()) {
					ls[i]=-1;		
				}

				else {
					ls[i]=stk.peek();
				}


			}
			stk.add(i);
		}

		// Right Smallest
		stk.clear();
		for(int i=n-1;i>=0;i--) {
			if(stk.isEmpty()) {
				rs[i]=n;
			}
			else if (stk.size()>0 && arr[stk.peek()]<arr[i]) {
				rs[i]=stk.peek();
			}
			else if(stk.size()>0 && arr[stk.peek()]>=arr[i]) {
				while(stk.size()>0 && arr[stk.peek()]>=arr[i]) {
					stk.pop();
				}

				if(stk.isEmpty()) {
					rs[i]=n;		
				}

				else {
					rs[i]=stk.peek();
				}


			}
			stk.add(i);
		}
		stk.clear();


		//		System.out.println('\n'+ "ls Data");
		//		Arrays.stream(ls).forEach(e ->System.out.print( e + " "));
		//		
		//		System.out.println('\n'+ "rs Data");
		//		Arrays.stream(rs).forEach(e ->System.out.print( e + " "));
		//Calculation of area

		//Final Calculation
		for(int i=0;i<n;i++) {
			tempAns= ((rs[i]-ls[i]-1)*arr[i]);
			area= max(tempAns,area);
		}

		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,1,1,0}, {1,1,1,1},{1,1,1,1},{1,1,0,0}};

		int n = arr[0].length;
		int[] h1= new int[n];
		int[] h2= new int[n];
		int[] h3= new int[n];
		int[] h4= new int[n];
		int ans= Integer.MIN_VALUE;

		for(int i =0;i<n;i++) {
			h1[i]=arr[0][i];
		}
		//h2
		for(int i =0;i<n;i++) {
			if(arr[1][i]!=0) {
				h2[i]=arr[1][i]+ h1[i];
			}
			else {
				h2[i]=arr[1][i];
			}
		}
		//			//h3
		for(int i =0;i<n;i++) {
			if(arr[2][i]!=0) {
				h3[i]=arr[2][i]+ h2[i];
			}
			else {
				h3[i]=arr[2][i];
			}
		}

		for(int i =0;i<n;i++) {
			if(arr[3][i]!=0) {
				h4[i]=arr[3][i]+ h3[i];
			}
			else {
				h4[i]=arr[3][i];
			}
		}




		System.out.println( "H1 Data");
		Arrays.stream(h1).forEach(e ->System.out.print( e + " "));
		System.out.println( '\n' +"H2 Data");
		Arrays.stream(h2).forEach(e ->System.out.print( e + " "));
		System.out.println( '\n' +"H3 Data");
		Arrays.stream(h3).forEach(e ->System.out.print( e + " "));
		System.out.println( '\n' +"H4 Data");
		Arrays.stream(h4).forEach(e ->System.out.print( e + " "));
		
		ArrayList<Integer> al= new ArrayList<>();
		

		int answ=maxOfRectangleBinary(h1);
		ans = max(answ,ans);
		answ=maxOfRectangleBinary(h2);
		ans = max(answ,ans);
		answ=maxOfRectangleBinary(h3);
		ans = max(answ,ans);
		answ=maxOfRectangleBinary(h4);
		ans = max(answ,ans);
		System.out.println('\n'+"Maximum Area is:= "+ans);



		//			for(int i =0;i<n;i++) {
		//			for(int j =0;i<n;i++) {
		//				String h= "h".concat(Integer.toString(j+1));
		//				h[j]=arr[i][j];
		//			}
		//			h1[i]=arr[0][i];
		//		}


	}

}
