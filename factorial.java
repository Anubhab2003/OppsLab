public class factorial{
    public static void main(String args[]){
        int fact=1;
        int a=5;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}