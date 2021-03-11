package LinkedLists;

public class LinkedLists3 {
	private Node n;
	private int index=0;

	public LinkedLists3() {}
	public LinkedLists3(Node n) {
		super();
		this.n = n;
	}
	
	public void removeNode(Node n) {
		if(n!=null || n.next!=null)
			return;
		n.data=n.next.data;
		n=n.next;
		return;
	}
}
