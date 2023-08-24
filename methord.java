public class methord{
    public  double circle(double r){
        return 3.14*r*r;
    }
    public  int rectangle(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        methord m=new methord();
        System.out.println(m.circle(5.3));
        System.out.println(m.rectangle(5,3));

    }
}