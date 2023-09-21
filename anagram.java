import java.util.*;
public class anagram{
    public static boolean ana(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    return true;
                }
            }
        }
        return false;


    }
    public static void main(String args[]){
        System.out.println("Enter two string");
        Scanner s=new Scanner(System.in);
        //String str1=s.nextLine();
        String str1=s.nextLine().toLowerCase();
        //str1=str1.tolowerCase();
        String str2=s.nextLine().toLowerCase();
        //str2=str2.tolowerCase();
        System.out.println(ana(str1,str2));
    }
}