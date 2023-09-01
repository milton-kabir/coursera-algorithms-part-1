import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String ans = "";
        for (String st : args) {
            if (StdRandom.bernoulli((double) 1 / i)) {
                ans = st;
            }
            i++;
        }
        StdOut.println(ans);
    }
}

