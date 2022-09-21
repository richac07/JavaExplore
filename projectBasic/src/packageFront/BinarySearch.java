package packageFront;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	//OPtion 1
	public static char nextChar(char[] str, int a, int b, char ele) {
		int mid =-1;
		char ans= '#';
		int val=-1;
		while(a<=b) {

			mid = a+(b-a)/2;
			if(str[mid]==ele && mid+1<=str.length-1) {
				//a=mid+1;
				return str[mid+1];

			}
			if(str[mid]==ele && mid==str.length-1) {
				//a=mid+1;
				//ans = str[mid+1];
				return'#';

			}

			else if (str[mid]>ele) {
				//ans=str[mid];
				b= mid-1;
			}

			else if (str[mid]<ele) {

				a= mid+1;
			}


		}


		return ans;
	}

	//OPtion2
	public static char nextChar2(char[] str, int a, int b, char ele) {
		int mid =-1;
		char ans= '#';
		int val=-1;
		while(a<=b) {

			mid = a+(b-a)/2;
			if(str[mid]==ele) {
				a=mid+1;	

			}


			else if (str[mid]>ele) {
				ans=str[mid];
				b= mid-1;
			}

			else if (str[mid]<ele) {

				a= mid+1;
			}


		}


		return ans;
	}

	//PEAK VALUE
	public static int peakValue(int[] arr) {
		int ans =-1;
		int start =0;
		int end = arr.length-1;
		int mid =-1;

		while(start<=end) {
			mid = start+(end-start)/2;
			if(mid>0 && mid<arr.length-1) {
				if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
					//ans= arr[mid];
					return arr[mid];

				}
				else if(arr[mid]<arr[mid-1]) {
					end=mid -1;
				}
				else if(arr[mid]<arr[mid+1]) {
					start=mid+1;

				}
			}
			else if(mid==0) {
				if(arr[mid]>arr[mid+1]) {
					return arr[mid];
				}
				else {
					return arr[mid+1];
				}
			}
			else {
				if(arr[mid]>arr[mid-1]) {
					return arr[mid];
				}
				else {
					return arr[mid-1];
				}
			}
		}
		return ans;		
	}

	static int minDiff(int a, int b, int k) {
		return ((k-a)<=(k-b)?a:b);
	}

	

	//Floor and celing of a key in a sorted array
	public static int flooeCeiling(int[] arr) {
		int ans =-1;
		int start =0;
		int end = arr.length-1;
		int mid =-1;
		int sum =0;

		for(int i =0; i<arr.length;i++) {
			sum=sum+arr[i];
		}

		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]==sum/2) {
				return arr[mid];
			}
			else if(arr[mid]<sum/2) {
				start=mid+1;
			}

			else if(arr[mid]>sum/2) {
				end=mid-1;

			}
		}
		System.out.println("Values: Start= " +start +" ,Mid= "+mid +" ,End= " +end);
		if(start<arr.length && end>=0) {
			return minDiff(arr[end],arr[start],sum/2);
		}
		else if(end<0) {
			return arr[start];
		}
		else {
			return arr[end];
		}	
	}

	static int indexDiff(int a, int b, int k,int[] arr) {
		return ((k-arr[a])<(k-arr[b])?a:b);
	}
	
	public static int min(int a, int b) {
		return (a<b?a:b);
	}
	public static int max(int a, int b) {
		return (a>b?a:b);
	}

	//Page allocation
	
	public static int allocation(int[] arr) {
		int ans =-1;
		int start =0;
		int end = arr.length-1;
		int mid =-1;
		int sum =0;

		for(int i =0; i<arr.length;i++) {
			sum=sum+arr[i];
		}

		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]==sum/2) {
				return mid;
			}
			else if(arr[mid]<sum/2) {
				start=mid+1;
			}

			else if(arr[mid]>sum/2) {
				end=mid-1;

			}
		}
		System.out.println("Values: Start= " +start +" ,Mid= "+mid +" ,End= " +end);
		if(start<arr.length && end>=0) {
			return indexDiff(end,start,sum/2,arr);
		}
		else if(end<0) {
			return start;
		}
		else {
			return end;
		}	
	}
	
	

	public static int minPage(int[] arr, int index) {
		int lSum=0;
		int rSum=0;
		int val=arr[index];
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<=index;i++) {
			lSum=lSum+arr[i];
		}
		if(index<arr.length-1) {
		for(int i=index+1;i<arr.length;i++) {
			rSum=rSum+arr[i];
		}}
		else {
			rSum=0;
		}
		int Probab1= max(lSum,rSum);
		lSum=lSum-val;
		rSum=rSum+val;
		int Probab2= max(lSum,rSum);
		return ans=min(Probab1,Probab2);
	}

//	public static char firstNonAlpha(char[] str, int a, int b, char ele) {
//		int mid =-1;
//		char ans= '#';
//		int val=-1;
//		while(a<=b) {
//
//			mid = a+(b-a)/2;
//			if(str[mid]>str[mid]+1) {
//				ans=str[mid+1]; 
//
//			}
//			if(str[mid]<str[mid]-1) {
//				ans=str[mid];
//
//			}
//			else if (str[mid]>ele) {
//				ans=str[mid];
//				b= mid-1;
//			}
//
//			else if (str[mid]<ele) {
//
//				a= mid+1;
//			}
//
//
//		}
//
//		return ans;
//	}


	public static void main(String[] args) {
		String str="acegiknqrtu";
		char[] ch = str.toCharArray();
		int n=ch.length -1;
		char ele='a';
		char ans=nextChar(ch,0,n,ele);
		if (ans=='#') {
			System.out.println("Element itself is the last number");
		}
		else {
			System.out.println("The next element after "+ele +" is: " +ans);
		}

		//PEAK VALUE
		System.out.println("PEAK VALUE");
		int arr[]= {10,20,15,40,30};
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {10,20,15,40,30,60,50};
		int arr3[]= {50,40,30,20,10};
		int peak=peakValue(arr);
		int peak1=peakValue(arr1);
		int peak2=peakValue(arr2);
		int peak3=peakValue(arr3);
		System.out.println("PEAK VALUE generic : " + peak);
		System.out.println("PEAK VALUE for sorted array: " + peak1);
		System.out.println("PEAK VALUE with 2 peaks : " + peak2);
		System.out.println("PEAK VALUE for reverse sorted : " + peak3);


		// Find a number with Binary Search

		int sortA[]= {20,30,50,60,90};
		int sortB[] = {10,20,30,40};
	
		int op= allocation(sortB);
		int minPage=minPage(sortB,op);
		System.out.println("Closest index of Half Value: " +op);
		System.out.println("Minimum Page Distributed: " +minPage);
		


		


	}

}
