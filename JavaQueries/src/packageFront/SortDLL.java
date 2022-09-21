package packageFront;

public class SortDLL {
	int val;
	SortDLL next;
	SortDLL prev;

	static SortDLL insertAtHead(SortDLL head, int k) {
		SortDLL node= new SortDLL();

		node.val=k;
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;
		return head;

	}

	static void printDLL(SortDLL head) {
		SortDLL n=head;
		while(n!=null) {
			System.out.print(n.val + " ");
			n=n.next;
		}
	}

	static SortDLL reverseLL(SortDLL head) {
		SortDLL start=head;
		SortDLL end=head;
		while(end.next!=null) {
			end=end.next;
		}

		while(start!=end && start.prev!=end) {
			int temp = start.val;
			start.val=end.val;
			end.val=temp;
			start=start.next;
			end=end.prev;
		}
		return head;
	}

	//merging 2 Double Linked List
	static SortDLL merge(SortDLL first, SortDLL second) {
		if(first==null) {
			return second;
		}
		if(second == null) {
			return first;
		}
		if(first.val<second.val) {
			first.next=merge(first.next,second);
			first.next.prev=first;
			first.prev=null;
			return first;
		}

		else {
			second.next=merge(first,second.next);
			second.next.prev=second;
			second.prev=null;
			return second;

		}
	}

	//Main function for Sorting Biotonic function

	static SortDLL sort(SortDLL head) {
		//If only one node or nothing
		if(head==null || head.next==null) {
			return head;
		}
		//find the peak value
		if(head.val>head.next.val) {
			return reverseLL(head);
		}

		//check each one with the previous one to find the peak value
		SortDLL current= head.next;
		while(current!=null) {
			if(current.prev.val> current.val) {
				current.prev.next=null;
				current.prev=null;
				break;
			}
			current=current.next;
		}

		//if already sorted
		if(current==null) {
			return head;
		}
		// Log to test
		System.out.println('\n'+"Test"+current.val);
		current=reverseLL(current);
		//calling the merge function
		return merge(head,current);

	}

	//	static SortDLL reverseLL2(SortDLL head) {
	//		SortDLL temp=null;
	//		SortDLL n=head;
	//		while(n!=null) {
	//
	//			temp=n.prev;
	//			n.prev=n.next;
	//			n.next=temp;
	//			n=n.prev;
	//		}
	//
	//		if(temp!=null) {
	//			head=temp.prev;
	//			return head;
	//			
	//		}
	//		return head;
	//
	//	}
	public static void main(String[] args) {
		SortDLL node= new SortDLL();
		node= insertAtHead(node, 1);
		node= insertAtHead(node, 2);
		node= insertAtHead(node, 3);
		printDLL(node);
		SortDLL reverseN=reverseLL(node);
		System.out.println('\n'+"Reversed LinedList");
		printDLL(reverseN);

		//		SortDLL reverseN2=reverseLL2(node);
		//		System.out.println('\n'+"Reversed LinedList opt2");
		//		printDLL(reverseN2);

		System.out.println('\n'+"SORTING");
		SortDLL head= new SortDLL();
		head= insertAtHead(head, 1);
		head= insertAtHead(head, 2);
		head= insertAtHead(head, 5);
		head= insertAtHead(head, 3);
		//printDLL(head);
		// Reversed Sorted Array
		SortDLL rSort= new SortDLL();
		rSort= insertAtHead(rSort, 1);
		rSort= insertAtHead(rSort, 2);
		head= insertAtHead(rSort, 5);
		rSort= insertAtHead(rSort, 3);
		System.out.println('\n'+" Given Reversed sorted Array");
		printDLL(rSort);
		SortDLL soted=sort(rSort);
		System.out.println('\n'+" AFTER SORTING");
		printDLL(soted);

		//  Sorted Array
		SortDLL sort= new SortDLL();
		sort= insertAtHead(sort, 1);
		sort= insertAtHead(sort, 2);
		sort= insertAtHead(sort, 5);
		sort= insertAtHead(sort, 3);
		System.out.println('\n'+"Already Sorted SORTED Array");
		printDLL(sort);
		SortDLL sotedN=sort(sort);
		System.out.println('\n'+"For Sorted SORTED Array");
		printDLL(sotedN);


	}

}
