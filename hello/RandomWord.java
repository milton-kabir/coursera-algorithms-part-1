import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String ans = "";
        while (!StdIn.isEmpty()) {
            String ss = StdIn.readString();
            if (StdRandom.bernoulli((double) 1 / i)) {
                ans = ss;
            }
            i++;
        }
        StdOut.println(ans);
    }
}
