package Day12;



class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}

public class QueueLL {

    Node1 front;
    Node1 back;

    QueueLL(){
        front = null;
        back = null;
    }

    void push(int val){
        Node1 n = new Node1(val);

        if(front == null){
            front = n;
            back = n;
            return;
        }

        back.next = n;
        back = n;
    }

    void pop(){
        if(front == null){
            System.out.println("Queue Underflow");
            return;
        }

        front = front.next;

        if(front == null){
            back = null;
        }
    }

    int peek(){
        if(front == null){
            System.out.println("Queue Underflow");
            return -1;
        }
        return front.data;
    }

    boolean isEmpty(){
        return front == null;
    }
}

class Drive{
    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        System.out.println(q.peek());

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        System.out.println(q.peek());

        q.pop();
        System.out.println(q.peek());

        q.pop();
        System.out.println(q.peek());

        q.pop();
        System.out.println(q.peek());

        q.pop();
        System.out.println(q.peek());

        q.pop();
        q.pop();
    }
}
