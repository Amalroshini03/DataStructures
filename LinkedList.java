package Tree;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;

    public LinkedList1() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
     while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class LinkedList {
    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();

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