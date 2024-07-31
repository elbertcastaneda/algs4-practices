package algs4_practices.data_abstraction;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/******************************************************************************
 * Compilation: javac Rolls.java Execution: java Rolls n Dependencies:
 * Counter.java StdRandom.java StdOut.java
 *
 *  Simulate the rolling of n 6-sided dice.
 *
 *  % java Rolls 6 1000000
 *  167308 0s
 *  166540 1s
 *  166087 2s
 *  167051 3s
 *  166422 4s
 *  166592 5s
 *
 ******************************************************************************/

public class Rolls {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // create n counters
        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++) {
            hits[i] = new Counter(i + "s");
        }

        // increment trials counters at random
        for (int t = 0; t < trials; t++) {
            hits[StdRandom.uniformInt(n)].increment();
        }

        // print results
        for (int i = 0; i < n; i++) {
            StdOut.println(hits[i]);
        }
    }
}
