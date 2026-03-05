package Day7;



public class demo{
    public static void main(String[] args) {
        Thread t1=new Thread(() -> System.out.println("Mytask"));
        Thread t2=new Thread(() -> {
            System.out.println("thread 2 era start:");
            for(int i=0;i<10;i++){
                System.out.println("Mytask:"+i);
            }
        });
        t1.start();
        t2.start();
    }
}
