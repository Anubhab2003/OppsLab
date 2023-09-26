import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		String num=Integer.toString(n);
		String tar=Integer.toString(m);
		int count=0;
		for(int i=0;i<num.length();i++){
			if(num.charAt(i) == tar.charAt(0)){
				count++;
			}
		}
		System.out.println(count);

    }
}