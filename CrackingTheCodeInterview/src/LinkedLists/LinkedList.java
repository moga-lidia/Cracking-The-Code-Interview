package LinkedLists;

/* Linked list node */
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class LinkedList
{
	Node head; // head of linked list
	Node tail;

	/* This function prints contents of linked list
	starting from the given node */
	public void printList(LinkedList l)
	{
		Node tnode = l.head;
		while (tnode != null)
		{
			System.out.print(tnode.data+"->");
			tnode = tnode.next;
			tail=tnode;
		}
		System.out.println("NULL");
	}
	
	void appendToTail(int d) {
		Node end=new Node(d);
		Node n=head;
		if(n==null) {
			head=end;
			return;
		}
		while(n.next!=null)
			n=n.next;
		n.next=end;
	}
	
	public void insertAtFront(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

	public static void main(String [] args)
	{
		LinkedList llist = new LinkedList();
		LinkedList llist1 = new LinkedList();
		LinkedLists1 l=new LinkedLists1();
		llist.appendToTail(4);
		llist.appendToTail(3);
		llist.appendToTail(8);
		llist.appendToTail(6);
		llist.insertAtFront(9);
		llist.insertAtFront(9);
		llist.insertAtFront(11);
		llist.insertAtFront(1);
		llist.insertAtFront(12);
		llist.printList(llist);
		llist1=l.removeDups1(llist);
		llist.printList(llist);
	}
}

