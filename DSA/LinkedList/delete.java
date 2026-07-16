class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteNode {

    static Node delete(Node head, int value) {

        if (head == null)
            return null;

        if (head.data == value)
            return head.next;

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = delete(head, 20);

        display(head);
    }
}