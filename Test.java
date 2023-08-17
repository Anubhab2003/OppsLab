class Test{
    int a=15;
    static int b=10;
    void show(){//Instance Methord
        System.out.println(a);
        System.out.println(a+b);
    }
    public static void main(String args[]){
        Test t=new Test();//Creating a t object
        System.out.println(t.a);
        t.show();
        System.out.println((t.a)+b);
    }
}