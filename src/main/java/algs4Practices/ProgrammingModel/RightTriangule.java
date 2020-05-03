package algs4Practices.ProgrammingModel;

import edu.princeton.cs.algs4.StdDraw;

public class RightTriangule {
    public static void main() {
        StdDraw.square(.5, .5, .5);

        StdDraw.line(.45, 1, .45, .0);
        StdDraw.line(.0, .4, 1, .4);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(.9, .5, .5, .8);
        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.line(.5, .5, .9, .5);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(.5, .8, .5, .5);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(.9, .5, .5, .8);
        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.line(.5, .8, .9, .8);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.line(.9, .8, .9, .5);

        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.circle(.7, .65, .25);
    }
}