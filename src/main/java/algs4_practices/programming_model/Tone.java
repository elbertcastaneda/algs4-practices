package algs4_practices.programming_model;

import edu.princeton.cs.algs4.StdAudio;

// gradle :run --args="Tone 1000 2"
public class Tone {
    public static void main(String[] args) {
        double hz       = Double.parseDouble(args[0]);    // frequency in Hz
        double duration = Double.parseDouble(args[1]);    // duration in seconds

        int N = (int) (StdAudio.SAMPLE_RATE * duration);

        // build sine wave with desired frequency
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++) {
            a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
        }

        // play using standard audio
        StdAudio.play(a);
    }
}