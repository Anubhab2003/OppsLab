import java.util.*;
public class vowel{
    public static void main(String args[]){
        int c=0;
        String s="just be it";
        for(int i=0;i<s.length();i++){
            char j=s.charAt(i);
            
            if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u'){
                c++;
            }

        }
        System.out.println("Total number of vowel"+c);
        System.out.println("Toatal consonants"+(s.length()-1-c));
    }
}