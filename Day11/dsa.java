package Day11;


class node{
    int data;
    Node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}

public class dsa{
    Node head;

    dsa(){
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

    //insert at random place
    void insertAtPos(int val,int pos){
        Node n=new Node(val);
        if(pos==1){
            n.next=head;
            head=n;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        n.next=temp.next;
        temp.next=n;
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

class Driver{
    public static void main(String[] args) {
        dsa sll = new dsa();
        sll.insertAtHead(10);
        sll.insertAtTail(20);
        sll.insertAtTail(30);
        sll.insertAtTail(40);
        sll.insertAtTail(50);
        sll.insertAtTail(60);
        sll.insertAtPos(35,4);
        sll.display();
    }
}