package packageFront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class JustPratice {
	
//	public int totalIslands(int[][] arr) {
//		int rows= arr.length;
//		int col=arr[0].length;
//	}

	public static void main(String[] args) {
		ArrayList<Integer[]> al = new ArrayList<>();
		Integer[] a1= {2,3,4};
		Integer[] a2= {6,3,4};
		Integer[] a3= {5,3,4};
		al.add(a1);
		al.add(a2);
		al.add(a3);
		
//		Iterator<Integer[]> it= al.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}
		for(int i = 0; i < al.size(); i++)
		{
			Integer[] currArr = al.get(i);
			//System.out.println("Array at index " + i + " is: " + Arrays.toString(currArr));
			System.out.print( Arrays.toString(currArr)+ " ");
		}
		
	
		
		
//		int[] arr= {1,1,1,1,2,2,4,3,4,2};
//		int k=3;
//		Map<Integer, Integer> mp = new HashMap<>(); 
//		for(int i: arr) {
//			mp.put(i, mp.getOrDefault(i, 0)+1);
//			
//		}
//		HashSet<Integer> hs= new HashSet<>(mp.keySet());
//
//		
//		PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
//		for(int i:hs) {
//			pq.add(i);
//			if(pq.size()>k) {
//				pq.poll();
//			}
//			
//		}
//		while(!pq.isEmpty()) {
//			int a=pq.poll();
//			System.out.println(a + " " + "has Frequency: "+ mp.get(a));
//		}

	}

}
