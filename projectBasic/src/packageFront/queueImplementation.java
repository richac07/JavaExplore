package packageFront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q= new LinkedList<>();
		Deque<Integer> dq=  new LinkedList<Integer>();
		Deque<Character> dq1=  new LinkedList<Character>();
		dq1.addLast('a');
		System.out.println("DEQUE CHARATCER POLL: " +dq1.poll());
	
		
		q.add(-1);
		q.add(-2);
		
		int a = q.peek();
		System.out.println(a);
		
		// if empty throws exception
//		q.remove();
//		System.out.println(q.peek());
		
		// if empty gives null
		System.out.println("LAST VALUE popped : " + q.poll());
		System.out.println("AFTER POPPED, FIRST VALUE IS : " +q.peek());
		
		System.out.println("SIZE of QUEUE is : " + q.size());
		System.out.println("====================================");
		System.out.println("DEQUE Implementation");
		System.out.println("====================================");
		
		dq.addFirst(3);
		dq.addLast(-1);
		dq.poll();
		dq.stream().forEach(e -> System.out.println(e));
		
		System.out.println("====================================");
		
		System.out.println("MAP Implementation");
		System.out.println("====================================");
		
		String s= "abba";
		HashMap<String, Integer> mp = new HashMap<>();
		int len=s.length();
//		int j=0;
//		while(j< len) {
//			if(mp.get(j)==0) {
//				mp.put(s.charAt[j], 1);
//			}
//			else {
//				int val=mp.get(j);
//				mp.put(s.charAt(j),val+1);
//			}
//			
//		}
		mp.put("a", 3);
		mp.put("b", 1);
		System.out.println("Map Size: " + mp.size());
		
	  //PRIORITY QUEUE:
		int[] arr1= {7,10,4,3,20,15,13,16};
		int k=3;
		Queue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<arr1.length;i++) {
			if(pq.size()>k) {
				pq.poll();
				pq.add(arr1[i]);	
			}
			else {
				pq.add(arr1[i]);
			}
			
		}
		
//		pq.add(100);
//		pq.add(50);
//		pq.add(150);
//		pq.add(130);
		System.out.println(k + " minimum element is " +pq.peek());
		System.out.println("===============PRIORITY QUEUE:===========");
		pq.stream().forEach(e ->System.out.println(e + " "));
		Arrays.sort(arr1);
		System.out.println("===============SORTED ARRAY:===========");
		Arrays.stream(arr1).forEach(e ->System.out.println(e + " "));
		
		}
	
	
	
		
	}


