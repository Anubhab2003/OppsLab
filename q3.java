import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder num = new StringBuilder(Integer.toString(n));
        num.reverse();
        System.out.print(num);
    }
}
