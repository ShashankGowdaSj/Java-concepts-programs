package Day11;


class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {

    Node2 head;

    // Insert at head
    void insertAtHead(int data) {

        Node2 newNode = new Node2(data);

        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Delete at head
    void deleteAtHead(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if(head != null){
            head.prev = null;
        }
    }

    // Print the list
    void print(){

        Node2 temp = head;

        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

class Driver4 {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        System.out.println("List after inserting at head:");
        list.print();

        list.deleteAtHead();

        System.out.println("List after deleting head:");
        list.print();
    }
}