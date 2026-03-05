package Day7;
class  counter{
    int count=0;

    synchronized void increment(){
        count++;
    }
}
class synchronized1{
    public static void main(String[] args) {
        counter a=new counter();

        Thread t1=new Thread(() ->{
            for(int i=0;i<10;i++){
                a.increment();
            }
        });
        Thread t2=new Thread(() ->{
            for(int i=0;i<10;i++){
                a.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch(Exception e){}
        System.out.println("count="+a.count);
    }
}