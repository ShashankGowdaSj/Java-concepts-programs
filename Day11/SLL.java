package Day11;



class Node1{
    int data;
    Node next;

    Node1(int data){
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

    //insertAtTail
    void insertAtTail(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }

    //get size
    int getSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    //insert at random place
    void insertAtPos(int val,int pos){
        int size = getSize();
        Node n=new Node(val);
        if(pos < 0 || pos > size){
            System.out.println("Invalid Position Given");
        } else if (pos==0) {
            n.next=head;
            head=n;
        }else{
            Node temp=head;
            while(--pos>0){
                temp = temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }


    //print
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}

class Driver1{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        sll.insertAtTail(40);
        sll.insertAtTail(50);
        sll.insertAtTail(60);
        sll.insertAtPos(35,3);
        sll.insertAtPos(35,20);
        sll.insertAtPos(5,0);
        sll.insertAtPos(35,-3);
        sll.display();
    }
}