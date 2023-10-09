import java.util.*;
public class experiment{
    
    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String args[]){
        System.out.println(add(3,2));
    }


   
    public class result extends experiment{
        public static void main(String args[]){
            System.out.println(add(3,2));
            //System.out.println(multi(3,2));
        }
    }

}


