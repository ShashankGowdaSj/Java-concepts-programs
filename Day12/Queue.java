package Day12;



public class Queue {
    int[] arr;
    int front;
    int back;
    int size;

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push(int val){
        if(back == size-1){
            System.out.println("Stack Overflow");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1){
            front++;
        }
    }

    void pop(){
        if(front==-1 || front>back){
            System.out.println("Stack underflow");
            return;
        }
        arr[front]=0;//optional(if this is not done , element not deleted , only pointer front moves)
        front++;
    }

    int peek(){
        if(front==-1 || front>back){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return(front==-1 || front >back);
    }
    void print(){

    }

}
class Driver{
    public static void main(String[] args) {
        Queue q = new Queue(5);
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