package packageFront;

import java.util.Stack;

public class NodeChar {
	char val;
	NodeChar next=null;

	NodeChar(char v){
		this.val=v;
	}

	void appendToLL(char d) {
		NodeChar end= new NodeChar(d);
		NodeChar n=this;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=end;

	}

	NodeChar deleteNode(NodeChar head, char d) {
		NodeChar n=head;
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
	static int sizeLL(NodeChar head) {
		NodeChar n=head;
		int count =1;
		while(n.next!=null) {
			count++;
			n=n.next;
		}
		return count;
	}

	//Kth from the last
	static void printKthFromLast(NodeChar head, int k) {
		NodeChar n= head;
		int count=sizeLL(n);
		int value= count-k;
		Stack<Character> stk = new Stack<>();
		stk.add(n.val);
		while(n.next!=null) {
			stk.add(n.next.val);
			if(stk.size()>value) {

				System.out.println('\n'+"Kth value from last of LL is :" +stk.pop());
				//stk.pop();
				return;

			}
			n=n.next;
		}
		System.out.println("No value");
	}

	static void deleteMiddleLL(NodeChar head) {
		NodeChar n= head;
		NodeChar n1=head.next;

		while(n1!=null && n1.next!=null ) {
			n=n.next;
			n1=n1.next.next;

		}
		n.next=n.next.next;
		printLL(head);

	}

	static void printLL(NodeChar h) {
		NodeChar n= h;
		System.out.print(n.val+ " ");
		while(h.next!=null) {
			System.out.print(h.next.val + " ");
			h=h.next;
		}
	}

	
	static boolean palinLL(NodeChar head){
		NodeChar slow= head;
		NodeChar fast = head.next;
		//NodeChar fast = head;
		Stack<Character> stk= new Stack<>();
		while(fast!=null && fast.next!=null){
			char sVal=Character.toLowerCase(slow.val);
			
			stk.push(sVal);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast==null){
			slow=slow.next;
		}

		while(slow!=null){
			char sVal=Character.toLowerCase(slow.val);
			if(sVal!=stk.pop()){
				return false;
			}
			
			slow=slow.next;
		}
		return true;
	}



		public static void main(String[] args) {
			NodeChar h= new NodeChar('A');
			h.appendToLL('b');
			h.appendToLL('c');
			h.appendToLL('b');
			h.appendToLL('a');

			System.out.println("Print before Delete");
			System.out.println('\n'+"Size of LL before delete is : " +sizeLL(h));
			printLL(h);
			printKthFromLast(h,3);
			//Palindrome
			
			boolean bool=palinLL(h);
			if (bool) {
				System.out.println("ITS A PALINDROME !!!!!!!!");
			}
			else {
				System.out.println("ITS  NOT A PALINDROME :( ");
			}
//			System.out.println('\n'+"After Deleting the middle LL");
//			deleteMiddleLL(h);
//
//			System.out.println('\n'+"Size of LL is : " +sizeLL(h));
//			h.deleteNode(h, 'a');
//			printLL(h);





		}


	}
