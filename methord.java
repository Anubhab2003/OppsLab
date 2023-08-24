public class methord{
    public static double circle(double r){
        return 3.14*r*r;
    }
    public  double rectangle(double a,int b){
        return circle(a)*b;
    }
    public static void main(String args[]){
        methord m=new methord();
        System.out.println(m.circle(5.3));
        System.out.println(m.rectangle(5,3));

    }
}