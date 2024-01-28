package Tree;
class Node4 {
    int data;
    Node4 next;

    public Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked {
    Node4 head;

    public Linked() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void append(int data) {
        Node4 newNode = new Node4(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node4 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;  // Move this line outside of the while loop
    }

    // Method to reverse the linked list
    public void reverse() {
        Node4 prev = null;
        Node4 current = head;
        Node4 next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to display the linked list
    public void display() {
        Node4 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedList3 {

    public static void main(String[] args) {
        Linked lst = new Linked();
        lst.append(1);
        lst.append(2);
        lst.append(3);
        lst.append(4);
        lst.append(5);

        // Displaying the linked list
        System.out.println("Linked List Values: ");
        lst.display();
        
        // Reverse the linked list
        System.out.println("Reversed Linked List Values: ");
        lst.reverse();
        lst.display();
    }
}