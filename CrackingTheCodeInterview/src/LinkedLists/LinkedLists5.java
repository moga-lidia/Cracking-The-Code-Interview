package LinkedLists;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedLists5 {
	private Node n;

	public LinkedLists5() {}
	public LinkedLists5(Node n) {
		super();
		this.n = n;
	}
	
	public LinkedList<Integer> addToList(LinkedListMine l1, LinkedListMine l2,int carry) {
		if(l1==null && l2==null && carry==0)
			return null;
		
		LinkedList<Integer> result=new LinkedList<Integer>();
		Node n1=l1.head;
		Node n2=l2.head;
		int value=carry;
		if(l1!=null) {
			value +=n1.data;
			n1=n1.next;
		} 
		if(l2!=null) {
			value += n2.data;
			n2=n2.next;
		}
		
		result.add(value%10);
		
		if(l1!=null || l2!=null) {
			LinkedList m=addToList(
					l1==null ? null : l1,
					l2==null ? null : l2,
					value>10 ? 1 : 0);
			result.addAll(m);
		}
		return result;
	}
}
