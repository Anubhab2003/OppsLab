import java.util.*;

public class ThisKeyword {
    class Train {
        int pnr;

        Train(int pnr) {
            this.pnr = pnr;
        }
    }

    public static void main(String args[]) {
        ThisKeyword tk = new ThisKeyword();
        ThisKeyword.Train rl = tk.new Train(123); // Create an instance of the Train class with the pnr argument.
        System.out.println(rl.pnr); // Access the pnr variable.
    }
}
