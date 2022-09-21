package packageFront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;


public class heapDS {

	public static int kthLargestElement(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size()>k) {
				minHeap.poll();

			}	
		}
		return minHeap.peek();
	}

	public static void kLargestElement(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size()>k) {
				minHeap.poll();

			}	
		}
		while(minHeap.size()>0) {
			System.out.println(minHeap.peek());
			minHeap.poll();
		}
	}

	//SORT the k sorted array

	public static int[] sortArrayForkSorted(int[] arr, int k){
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int[] sortedArr= new int[arr.length];
		int saI=0;
		for(int i =0;i<arr.length ; i++){
			minHeap.add(arr[i]);
			if(minHeap.size()>k){
				sortedArr[saI]=minHeap.peek();
				minHeap.poll();
				saI++;


			}
		}
		System.out.println("saI: "+saI);
		while(!minHeap.isEmpty()) {
			sortedArr[saI]=minHeap.peek();
			minHeap.poll();
			saI++;
		}
		return sortedArr;

	}


	public static int kthSmallestElement(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
		for(int i=0;i<arr.length;i++) {
			maxHeap.offer(arr[i]);
			if(maxHeap.size()>k) {
				maxHeap.poll();

			}	
		}
		return maxHeap.peek();
	}



	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
		//Queue<Integer> pq = new PriorityQueue<>((a,b)->(Math.abs(a-x)<Math.abs(b-x))?1:-1); // Max Heap for the difference between 2 values, max diff above to pop early  
		Queue<Integer> pq = new PriorityQueue<>((a,b)->(Math.abs(b-x)-Math.abs(a-x)));
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i : arr) {
			pq.add(i);
			if(pq.size()>k)
				pq.remove();
		}
		while(!pq.isEmpty()) {
			result.add(pq.remove());
		}
		Collections.sort(result);
		return result;
	}

	//OPtion 1

	public static List<Integer> topKFrequent1(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int num: nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		//map.forEach((key,v)->System.out.println(key + "=" +v));

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1,o2) ->o1.getValue()- o2.getValue()); // Min Heap, smaller number above to pop early

		map.entrySet().forEach(e -> {
			pq.offer(e);
			if (pq.size() > k) {
				pq.poll();
			}
		});



		return pq.stream().map(o -> o.getKey()).collect(Collectors.toList());


	}

	//OPtion 2

	public static int[] topKFrequent2(int[] nums, int k) {

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num: nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		
		ArrayList<Integer> hs= new ArrayList<>(countMap.values());
		hs.stream().forEach(ele ->System.out.print(ele + " "));
		
		//map.forEach((key,v)->System.out.println(key + "=" +v));
		PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) ->countMap.get(a)- countMap.get(b));
		//PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) ->Integer.compare(countMap.get(a), countMap.get(b)));

		for(var key: countMap.keySet()) {
			pq.offer(key);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		int[]result = new int[k];
		int index =0;
		while(!pq.isEmpty()) {
			result[index]=pq.poll();
			index++;
		}
		Arrays.sort(result);
		return result;


	}

	//Print too
	public static int[] topKFrequentPrint(int[] nums, int k) {

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num: nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		//map.forEach((key,v)->System.out.println(key + "=" +v));
		PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) ->Integer.compare(countMap.get(a), countMap.get(b)));

		for(var key: countMap.keySet()) {
			pq.offer(key);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		int[]result = new int[k];
		int index =0;
		while(!pq.isEmpty()) {
			result[index]=pq.poll();
			index++;
		}
		Arrays.sort(result);



		return result;


	}




	public static void main(String[] args)  {
		int[] aaa= {1,1,1,2,2,3};
		int ks = 2;
		List<Integer> ls = new ArrayList<>();
		ls=topKFrequent1(aaa,ks);
		Collections.sort(ls);
		System.out.println("===============K FREQUENT NUMBERS===========");
		ls.stream().forEach(e ->System.out.print(e + " "));
		System.out.println('\n'+ "===============K FREQUENT NUMBERS -- OPTION2 ===========");
		int[] sol= new int[ks];
		sol= topKFrequent2(aaa,ks);
		Arrays.stream(sol).forEach(e ->System.out.print(e + " "));
		System.out.println('\n'+ "===============K FREQUENT NUMBERS -- OPTION2 COMPLETED ===========");

		//Largest Kth Element
		int[] arr= {7,10,4,3,20,15,13,16};
		int n = arr.length;
		int k=3;

		int kthLargest= kthLargestElement(arr, k);
		int kthSmallest= kthSmallestElement(arr,k);
		System.out.println('\n'+ k + " Largest element is " +kthLargest);
		System.out.println(k + " Smallest element is " +kthSmallest);
		System.out.println(k +"Largest elements in the Array ");
		kLargestElement(arr,k);

		//SORT the k sorted array
		int[] kSortedArray= {6,5,3,2,8,10,9};
		int[] SortedArrayOfkSortedArray = new int[kSortedArray.length];
		SortedArrayOfkSortedArray=sortArrayForkSorted(kSortedArray,k);
		System.out.println("===============SORTED ARRAY FOR K SORTED ARRAY:===========");
		Arrays.stream(SortedArrayOfkSortedArray).forEach(e ->System.out.print(e + " ") );

		System.out.println('\n'+"===============CLOSEST K Numbers of a sorted Array:===========");
		int[] arrClosestK= {5,6,7,8,9};
		List<Integer> al= new ArrayList<>();
		al=findClosestElements(arrClosestK,3,7);
		al.stream().forEach(e ->System.out.print(e + " "));

		Arrays.sort(arr);
		System.out.println('\n'+"===============SORTED ARRAY:===========");
		Arrays.stream(arr).forEach(e ->System.out.print(e + " "));


	}

}


