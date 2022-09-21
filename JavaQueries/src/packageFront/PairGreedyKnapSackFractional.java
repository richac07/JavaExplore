package packageFront;
import java.lang.*;
import java.util.*;
import java.io.*;

class PairGreedyKnapSackFractional {

	// Pair class
	static class Pair {

		int val;
		int index;

		Pair(int v, int i)
		{
			this.val = v;
			this.index = i;
		}
	}

	static int selectJobSeq(int vl[], int wt[], int W)
	{

		if(W==0) {
			return 0;
		}
		if(vl.length==0) {
			return 0;
		}
		// Maximum Priority Queue to sort weight and val in descending order
		PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.val - p1.val);

		for (int i = 0; i < vl.length; i++) {
			// Pushing elements in priority queue where the fraction is high
			int fVal=vl[i]/wt[i];
			pq.add(new Pair(fVal,i));
		}

		int tProfit=0;
		int remain=W;
		Pair ir= pq.poll();
		tProfit+=vl[ir.index];
		remain=remain-wt[ir.index];

		while(!pq.isEmpty()) {
			Pair itr=pq.poll();
			if(remain==0){
				break;
			}
			else if(remain>= wt[itr.index]) {
				tProfit+=vl[itr.index];
				remain-=wt[itr.index];
			}
			else{
				tProfit+=itr.val*remain;
				remain=0;
			}
		}
		
		return tProfit;

		}

		// Driver Code
		public static void main(String[] args)
		{

			int value[] = { 60, 100, 120};
			int weight[] = { 10,20,30};
			int W=50;

			// Function call
			System.out.println("The tOtal profit is :"+ selectJobSeq(value,weight,W));
			
			String st="abba";
			PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->a>b?1:-1);
			for(int i=0;i<st.length();i++) {
				pq.add(st.charAt(i));
			}
			System.out.println("Item : " +pq.poll());
//			while(!pq.isEmpty()) {
//				System.out.println("Item : " +pq.poll());
//			}
			
	
				
			
		}
	}