package Day10;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL(){
        head = null;
    }
    //insertion at head
    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    //print
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Driver{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);
        sll.display();
    }
}