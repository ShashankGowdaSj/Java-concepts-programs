package Day7;


interface Greeting{
    void sayHello();
}

 class Demo {
    public static void main(String[] args){
        Greeting g = new Greeting(){
            @Override
            public void sayHello(){
                System.out.println("Hello World");
            }
        };
        g.sayHello();
    }
}