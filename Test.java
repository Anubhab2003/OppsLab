class Test{
    int a=15;
    void show(){//Instance Methord
        System.out.println(a);
    }
    public static void main(String args[]){
        Test t=new Test();//Creating a t object
        System.out.println(t.a);
        t.show();
    }
}