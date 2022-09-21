package packageFront;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;


public class stackImplemeted {

	static int[] largestElementRight(int[] arr){
		int n = arr.length;
		int[] op = new int[n];
		Stack<Integer> stk = new Stack<>();

		for(int i=n-1; i >= 0;i--){
			if(stk.isEmpty()){
				op[i] = -1;
			}
			else if (stk.size()>0 && stk.peek() > arr[i]){
				op[i]= stk.peek();
			}

			else if( stk.size()>0 && stk.peek() <= arr[i]){
				while(stk.size()>0 && stk.peek()<= arr[i]) {
				stk.pop();
				}
				if(stk.isEmpty()) {
					op[i] = -1;
				}
				else {
				op[i]= stk.peek();
				}
			}
			stk.add(arr[i]);
		}
		return op;
	}
	
	static int[] largestElementLeft(int[] arr) {
		int n = arr.length;
		int[] op= new int[n];
		Stack<Integer> stk= new Stack<>();
		
		for(int i = 0; i<n; i++) {
			if(stk.isEmpty()){
				op[i]=-1;
			}
			else if(stk.size()>0 && stk.peek()> arr[i]) {
				op[i]=stk.peek();
			}
			else if(stk.size()>0 && stk.peek() <= arr[i]) {
				while(stk.size()>0 && stk.peek() <= arr[i]) {
					stk.pop();
				}
				if(stk.isEmpty()){
					op[i]=-1;
				}
				else {
				op[i]=stk.peek();
				}
			}
			stk.add(arr[i]);
		}
		return op;
	}
	
	static int[] stockSpanProblem(int[] arr) {
		int n = arr.length;
		int[] op= new int[n];
		//Arrays.fill(op, 1);
		int temp=0;
		Stack<Integer> stk= new Stack<>();
		
		for(int i = 0; i<n; i++) {
			if(stk.isEmpty()){
				op[i]=1;
			}
			else if(stk.size()>0 && arr[stk.peek()]> arr[i]) {
				op[i]=i-stk.peek()+op[i];
			}
			else if(stk.size()>0 && arr[stk.peek()] <= arr[i]) {
				while(stk.size()>0 && arr[stk.peek()] <= arr[i]) {
					stk.pop();
					temp=temp+1;
					
				}
				if(stk.isEmpty()){
					op[i]=1 +temp;
				}
				else {
				op[i]=i-stk.peek()+op[i];
				}
			}
			stk.add(i);
		}
		return op;
	}
	
	
		

		public static void main(String[] args) {
			// Largest Next Element Right OR Nearest GReater to right

			int[] arr= {1,3,0,0,1,2,4,3,3,3};
			System.out.println( '\n'+"INPUT PROVIDED");
			Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
			
			// Largest Next Element Right 
			System.out.println( '\n'+"LARGEST FROM RIGHT");
			int[] output= largestElementRight(arr);			
			Arrays.stream(output).forEach(e -> System.out.print( +e + " "));
	
			// Largest Next Element Left 
			System.out.println('\n' +"LARGEST FROM LEFT");			
			int[] output2= largestElementLeft(arr);
			Arrays.stream(output2).forEach(e -> System.out.print(e + " "));
			
			//stock span problem
			System.out.println('\n' +"STOCK SPAN PROBLEM");			
			int[] output3= stockSpanProblem(arr);
			Arrays.stream(output3).forEach(e -> System.out.print(e + " "));
			
			//Random values
			
//			Stack<Integer> stk= new Stack<>();
//			stk.add(100);
//			stk.clear();
			
			int[][] arr2d= {{0,1,1,0}, {1,1,1,1}};
			System.out.println('\n'+"2d Length: " +arr2d.length);
			System.out.println('\n'+"2d Width: " +arr2d[0].length);
//			for (int[] a: arr2d){
//				//Arrays.stream(a).forEach(e -> System.out.println(e));
//				System.out.println(Arrays.stream(a).count());
			}
//			Random rand= new Random();
//			int[] arr= new int[10];
//			for(int i=0;i<arr.length;i++) {
//				arr[i]= rand.nextInt();
//			}
			
			// IGNORE BELOW: Stack Not able to implement Pair,But ArrayList can
			
			
//			ArrayList<Pair> al = new ArrayList<>();
//			Pair pair = new Pair();
//			pair.setKey(100);
//			pair.setValue(1);
//			al.add(pair);
//			System.out.println("===ARRAYLIST PAIR=======");
//			System.out.println(al.get(pair.getKey()));
			
			
			
			//Stack<Integer> stck = new Stack<Entry<Integer, Integer>>();

		}


	
