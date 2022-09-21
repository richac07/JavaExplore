package packageFront;

import java.util.Deque;
import java.util.LinkedList;

public class MaxOfAllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int n= arr.length;

				Deque<Integer> dq= new LinkedList<Integer>();
				
				dq.add(0);
				
				int i=0,j=0;
				
				while(j<n) {
					//Calculation
					
					while(dq.size()>0 && arr[dq.peekLast()]<=arr[j] ) {
						dq.pollLast();
					}
					dq.addLast(j);
					
					
					//Window Creation
					if(j-i<k) {
						j++;
					}
					
					//Output calculation
					
					if(j-i==k) {
						System.out.println(arr[dq.peek()]);
						if(dq.size()>0 && arr[dq.peekFirst()]==i) {
							dq.poll();
						}
						i++;
						j++;
					}
					
				}



//		Deque<Integer> Qi = new LinkedList<Integer>();
//
//		/* Process first k (or first window)
//        elements of array */
//		int i;
//		for (i = 0; i < k; ++i) 
//		{
//
//			// For every element, the previous 
//			// smaller elements are useless so
//			// remove them from Qi
//			while (!Qi.isEmpty() && arr[i] >=  arr[Qi.peekLast()])
//
//				// Remove from rear
//				Qi.removeLast(); 
//
//			// Add new element at rear of queue
//			Qi.addLast(i);
//		}
//
//		// Process rest of the elements, i.e., from arr[k] to arr[n-1]
//		for (; i < n; ++i) 
//		{
//
//			// The element at the front of the
//			// queue is the largest element of
//			// previous window, so print it
//			System.out.print(arr[Qi.peek()] + " ");
//
//			// Remove the elements which 
//			// are out of this window
//			while ((!Qi.isEmpty()) && Qi.peek() <= 
//					i - k)
//				Qi.removeFirst();
//
//			// Remove all elements smaller 
//			// than the currently
//			// being added element (remove 
//			// useless elements)
//			while ((!Qi.isEmpty()) && arr[i] >= 
//					arr[Qi.peekLast()])
//				Qi.removeLast();
//
//			// Add current element at the rear of Qi
//			Qi.addLast(i);
//		}
//
//		// Print the maximum element of last window
//		System.out.print(arr[Qi.peek()]);

	}

}
