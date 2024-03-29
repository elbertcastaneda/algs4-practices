package algs4_practices.programming_model;

import java.awt.Color;

import edu.princeton.cs.algs4.Picture;

public class Scale {
    // gradle run --args="Scale /Users/elbertcastaneda/workspaces/coursera/algorithmsI/algs4-practices/src/main/resources/mandrill.jpg 200 300"
    public static void main(String[] args) {
        String filename = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        Picture source = new Picture(filename);
        Picture target = new Picture(w, h);

        for (int ti = 0; ti < w; ti++) {
            for (int tj = 0; tj < h; tj++) {
                int si = ti * source.width()  / w;
                int sj = tj * source.height() / h;
                Color color = source.get(si, sj);
                target.set(ti, tj, color);
            }
        }

        source.show();
        target.show();
    }
}