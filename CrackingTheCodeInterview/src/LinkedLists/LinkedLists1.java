package LinkedLists;

import java.util.HashSet;


public class LinkedLists1 {

	private Node n;

	public LinkedLists1() {}
	public LinkedLists1(Node n) {
		super();
		this.n = n;
	}
	
	//Varianta 1
	public LinkedList removeDups(LinkedList list) {
		HashSet<Integer> set=new HashSet<Integer>();
		Node previous=null;
		Node n=list.head;
		if(n.data!=n.next.data)
			list.head=n;
		while(n != null) {
			if(set.contains(n.data))
				previous.next=n.next;
			else {
				set.add(n.data);
				previous=n;
			}
			n=n.next;
		}
		list.tail=n;
		return list;
	}
	
	//Varianta 2
	public LinkedList removeDups1(LinkedList list) {
		Node current=list.head;
		while(current!=null) {
			Node runner=current;
			while(runner.next!=null) {
				if(runner.next.data==current.data)
					runner.next=runner.next.next;
				else
					runner=runner.next;
			}
			current=current.next;
		}
		
		list.tail=current;
		return list;
	}
}
