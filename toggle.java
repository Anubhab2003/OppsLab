import java.util.*;
public class toggle
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String g=" ";
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>=97&&str.charAt(i)<=122){
		        g=g+(char)(str.charAt(i)-32);
		    }else{
		        g=g+(char)(str.charAt(i)+32);
		    }
		    
		    
		}
		System.out.println(g);
	}
}
