class A
{
void get(){
    System.out.println("GLA");
}
}
class B extends A{
    void display(){
        System.out.println("Bye");
    }
}
class C extends B{
    public static void main(String[] args){
        A a= new A();
        B b= new B();
        b.get();
        b.display();
    }
}