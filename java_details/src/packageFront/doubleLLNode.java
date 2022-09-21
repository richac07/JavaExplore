package packageFront;

public class doubleLLNode {
	char val;
	doubleLLNode next;
	doubleLLNode prev;

	//	static doubleLLNode push(doubleLLNode head, char ch){
	//		doubleLLNode n= new doubleLLNode();
	//		n.val=ch;
	//		n.next=head;
	//		n.prev=null;
	//
	//		if(head!=null){
	//			head.prev=n;
	//		}
	//			head =n;
	//			return head;
	//		
	//
	//		
	//	}

	static doubleLLNode push(doubleLLNode head, char ch){
		doubleLLNode n= new doubleLLNode();
		n.val=ch;
		n.next=head;
		n.prev=null;

		if(head!=null){
			head.prev=n;

		}
		head =n;

		return head;



	}


	static boolean isValid(char c){
		return Character.isLetterOrDigit(c);
	}
	static doubleLLNode validLL(doubleLLNode head){
		doubleLLNode n=head;
		while(n.next!=null) {
		if(!isValid(n.next.val)){
			if(n.next.next==null) {
				n.next=null;
			}
			else {
			n.next.next.prev=n;
			n.next=n.next.next;
			
			}
		}
		else {
		n=n.next;
		}
		}
		return head;

	}

	static boolean isPalindromeSpecial(doubleLLNode head){
		System.out.println('\n'+"actual values nodes");
		printdLL(head);
		if(head ==null) {
			return true;
		}
		doubleLLNode newNode= validLL(head);
		System.out.println('\n'+"valid nodes");
		printdLL(newNode);
		
		//doubleLLNode start=newNode;
		doubleLLNode tail = newNode;

		while(tail.next!=null){
			tail=tail.next;
		}

		while(newNode!=tail){
			char hVal=Character.toLowerCase(newNode.val);
			char tVal=Character.toLowerCase(tail.val);

			if(hVal!= tVal){
				return false;
			}
			newNode = newNode.next;
			tail = tail.prev;
		}
		return true;
	}


	static boolean isPalindrome(doubleLLNode head){
		if(head ==null) {
			return true;
		}
		doubleLLNode tail = head;

		while(tail.next!=null){
			tail=tail.next;
		}

		while(head!=tail){
			char hVal=Character.toLowerCase(head.val);
			char tVal=Character.toLowerCase(tail.val);
			

			if(hVal!= tVal){
				return false;
			}
			head = head.next;
			tail = tail.prev;
		}
		return true;
	}

	static doubleLLNode reverseLL(doubleLLNode head) {
		doubleLLNode start=head;
		doubleLLNode end=head;

		while(end.next!=null){
			end = end.next;
		}
		while(start!= end && start.prev!=end){
			char temp =start.val;
			start.val=end.val;
			end.val= temp;
			start= start.next;
			end=end.prev;


		}
		return head;
	}

	static void printdLL(doubleLLNode head) {
		doubleLLNode n = head;

		//Playing with the node and next node -OPT1
		//		if(n!=null) {
		//			System.out.print(n.val +" ");
		//		}	
		//		while(n.next!=null) {
		//			System.out.print(n.next.val +" ");
		//			n=n.next;
		//		}

		//Playing with the node and next node -OPT2	
		while(n!=null) {
			System.out.print(n.val +" ");
			n=n.next;
		}
	}




	public static void main(String[] args) {
		doubleLLNode head = null;
		head = push(head, ' ');
		head = push(head, 'L');
		head = push(head, ',');
		head = push(head, 'e');
		head = push(head, 'v');
		head = push(head, 'e');
		head = push(head, '#');
		head = push(head, ' ');
		head = push(head, 'l');


		printdLL(head);

//		if (isPalindrome(head))
//			System.out.println('\n'+"It is Palindrome");
//		else
//			System.out.println("Not Palindrome");

		if (isPalindromeSpecial(head))
			System.out.println('\n'+" SPEical It is Palindrome");
		else
			System.out.println("SPEical Not Palindrome");

		
		doubleLLNode reverseN=reverseLL(head);
		printdLL(reverseN);
	}



}


