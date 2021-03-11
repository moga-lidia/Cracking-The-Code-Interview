package LinkedLists;

public class LinkedLists2 {
	private Node n;
	private int index=0;

	public LinkedLists2() {}
	public LinkedLists2(Node n) {
		super();
		this.n = n;
	}
	
	public int kElement(Node head,int k) {
		if(head==null)
			return 0;
		index=kElement(head.next,k)+1;
		if(index==k) 
			System.out.println("k elemnt data is : "+head.data);
		return index;
	}
}
