package Tree;
class Node1 {
	int data;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		this.next = null;
	}
}

class first {
	Node1 head;

	public first() {
		this.head = null;
	}

	// Method to insert a new node at the end of the linked list
	public void append(int data) {
		Node1 newNode = new Node1(data);

		newNode.next = head;
		head = newNode;
	}

	// Method to display the linked list
	public void display() {
		Node1 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class LinkedList2 {
	public static void main(String[] args) {
		first linkedList = new first();

		// adding elements to the linked list
		linkedList.append(1);
		linkedList.append(2);
		linkedList.append(3);
		linkedList.append(4);

		// Displaying the linked list
		System.out.println("Linked List Value: ");
		linkedList.display();
	}
}