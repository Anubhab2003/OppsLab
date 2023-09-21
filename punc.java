import java.util.*;
public class punc
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int c=0;
		for(int i=0;i<str.length();i++){
		    if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == '\'' || str.charAt(i) == '?') {
                c++;
            }  
		}
		System.out.println("The total number of punctuation are : "+c);
	}
}
