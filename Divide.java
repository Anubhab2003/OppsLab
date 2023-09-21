import java.util.*;

public class Divide {
    public static void main(String args[]) {
        String str = "aaaabbbbcccc";
        int len = str.length();
        int n = 3;
        int temp = 0;
        int charLen = len / n;
        String[] eqlstr = new String[n]; // Initialize the array with the correct size

        if (len % n != 0) {
            System.out.println("Sorry, the string is not divisible");
        } else {
            for (int i = 0; i < len; i += charLen) {
                String part = str.substring(i, i + charLen);
                eqlstr[temp] = part;
                temp++;
            }
        }

        for (int j = 0; j < eqlstr.length; j++) {
            System.out.println(eqlstr[j]);
        }
    }
}
