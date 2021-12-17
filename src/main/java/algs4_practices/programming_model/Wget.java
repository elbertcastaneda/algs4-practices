package algs4_practices.programming_model;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdOut;

/******************************************************************************
 * Compilation: javac Wget.java Execution: java Wget url Dependencies: In.java
 * Out.java
 *
 * Reads in a URL specified on the command line and saves its contents in a file
 * with the given name.
 *
 * % java Wget https://introcs.cs.princeton.edu/java/data/codes.csv
 * % gradle run --quiet --args="Wget https://algs4.cs.princeton.edu/11model/Wget.java.html --output-pipe" | w3m-html
 *
 ******************************************************************************/
public class Wget {

    public static void main(String[] args) {

        // read in data from URL
        String url = args[0];
        In in = new In(url);
        String data = in.readAll();

        if (args.length > 1 && args[1].trim().equals("--output-pipe")) {
            StdOut.println(data);
        } else {
            // write data to a file
            String filename = url.substring(url.lastIndexOf('/') + 1);
            Out out = new Out("/tmp/" + filename);
            out.println(data);
            out.close();
        }
    }

}
