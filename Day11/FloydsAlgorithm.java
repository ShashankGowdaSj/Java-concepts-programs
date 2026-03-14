package Day11;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    // insert at tail
    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Floyd's Cycle Detection Algorithm
    boolean detectCycle(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if(slow == fast){
                return true;           // cycle detected
            }
        }

        return false;                  // no cycle
    }
}

public class FloydsAlgorithm {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        // Creating a cycle manually
        list.head.next.next.next.next.next = list.head.next;

        if(list.detectCycle()){
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}