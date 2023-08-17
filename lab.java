import java.util.*;
class lab{
    int  sum(int a,int b){
        return a+b;
    }
    static double area(double r){
        return 3.14*r*r;
    }
    public static void main(String args[]){
        int a=2;
        int b=7;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        double r=s.nextDouble();
        lab l=new lab();
        System.out.println(l.sum(a,b));
        System.out.println(area(r));




    }
}