package packageFront;

import java.util.Stack;

public class Node {
	int val;
	Node next=null;
	
	Node(int v){
		this.val=v;
	}
	
	void appendToLL(int d) {
		Node end= new Node(d);
		Node n=this;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=end;
		
	}
	
	 Node deleteNode(Node head, int d) {
		Node n=head;
		if(n.val==d) {
			return n.next;
		}
		while(n.next!=null) {
			if(n.next.val==d) {
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
	 
	 //find the size of LL
	static int sizeLL(Node head) {
		 Node n=head;
		 int count =1;
		 while(n.next!=null) {
			 count++;
			 n=n.next;
		 }
		 return count;
	 }
	
	//Kth from the last
	static int printKthFromLast(Node head, int k) {
		Node n= head;
		int count=sizeLL(n);
		int value= count-k;
		Stack<Integer> stk = new Stack<>();
		stk.add(n.val);
		while(n.next!=null) {
			stk.add(n.next.val);
			if(stk.size()>value) {
				return stk.pop();
				
			}
			n=n.next;
		}
		return -1;
	}
	
	static void deleteMiddleLL(Node head) {
		Node n= head;
		Node n1=head.next;
		
		while(n1!=null && n1.next!=null) {
			n=n.next;
			n1=n1.next.next;
				
			}
			n.next=n.next.next;
			printLL(head);
	
	}
	 
	 static void printLL(Node h) {
		 Node n= h;
		 //System.out.print(n.val+ " ");
		 while(h!=null) {
			 System.out.print(h.val + " ");
			 h=h.next;
		 }
	 }
	 
//	 static boolean isPalidrome(Node head) {
//		 if(head == null) {
//			 return true;
//		 }
//		 Node slow = head;
//		 Node fast = head;
//		 Stack<Integer> st = new Stack<>();
//		 
//		 
//		 while(fast!=null && fast.next!=null) {
//			 
//		 }
//	 }
//	 
	 
	 public static void main(String[] args) {
		 Node h= new Node(2);
		 h.appendToLL(3);
		 h.appendToLL(4);
		 h.appendToLL(5);
		 h.appendToLL(6);
		 h.appendToLL(7);
		 System.out.println("Print before Delete");
		 System.out.println('\n'+"Size of LL before delete is : " +sizeLL(h));
		 printLL(h);
		 System.out.println('\n'+"Kth value from last of LL is : "+printKthFromLast(h,3));
		 System.out.println('\n'+"After Deleting the middle LL");
		 deleteMiddleLL(h);
		 
		 System.out.println('\n'+"Size of LL is : " +sizeLL(h));
		 h.deleteNode(h, 4);
		 printLL(h);
		 
		 //CIRCULAR LINKEDLIST
		 Node ccLL= new Node(2);
		 ccLL.appendToLL(3);
		 ccLL.appendToLL(4);
		 ccLL.appendToLL(5);
		 ccLL.appendToLL(6);
		 ccLL.appendToLL(3);
		 System.out.println("CIRCULAR LINKEDLIST");
		 printLL(ccLL);
		 
		 String s1="aA";
	
	

		}
	

}
