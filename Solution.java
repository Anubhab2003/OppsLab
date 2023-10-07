import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
     
    if(str.charAt(0)==str.charAt(0).toUpperCase()){
      System.out.println(str);
    }else{
      str=str.charAt(0).toUpperCase();
    }
       
     
  }
}
