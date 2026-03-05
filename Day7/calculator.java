package Day7;
interface calculator{
    int add(int a,int b);
}
class calulator{
    public static void main(String[] args) {
        calculator c=(a,b) -> a+b;
        System.out.println(c.add(1,2));
    }
}