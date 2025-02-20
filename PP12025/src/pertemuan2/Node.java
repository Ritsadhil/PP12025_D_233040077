package pertemuan2;

public class Node {
	private int data;
	private Node next;
	
	// inisialisasi Node
	public Node(int data) {
		this.data = data;
	}
	
	// setter & getter
	public int getdata() {
		return data;
	}

	public void setNilai(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
