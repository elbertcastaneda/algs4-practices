package algs4Practices;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RightTriangle
{
    public int sideA;
    public int sideB;
    public int sideC;

    public RightTriangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static void main(String[] args) {
        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        int sideC = Integer.parseInt(args[2]);

        while (StdIn.hasNextChar()) {
            char c = StdIn.readChar();
            StdOut.print("(" + c + ")");
        }

        System.out.println("---------- With static Method -----------");

        System.out.println(RightTriangle.IsRight(sideA, sideB, sideC));
        // System.out.println(RightTriangle.Draw(sideA, sideB, sideC));

        System.out.println("---------- With object oriented prommaing -----------");

        RightTriangle triangle = new RightTriangle(sideA, sideB, sideC);

        System.out.println(triangle.isRight());

        triangle.draw();
    };

    public static Boolean IsRight(int sideA, int sideB, int sideC) {

        if (sideA < 0 || sideB < 0 || sideC < 0) {
            return false;
        }

        int squareA = sideA * sideA;
        int squareB = sideB * sideB;
        int squareC = sideC * sideC; 

        Boolean sideAValid = (squareA == squareB + squareC);
        Boolean sideBValid = (squareB == squareA + squareC);
        Boolean sideCValid = (squareC == squareA + squareB);

        return (sideAValid || sideBValid || sideCValid);
    }

    public Boolean isRight() {
        if (this.sideA < 0 || this.sideB < 0 || this.sideC < 0) {
            return false;
        }

        int squareA = this.sideA * sideA;
        int squareB = this.sideB * sideB;
        int squareC = this.sideC * sideC; 

        Boolean sideAValid = (squareA == squareB + squareC);
        Boolean sideBValid = (squareB == squareA + squareC);
        Boolean sideCValid = (squareC == squareA + squareB);

        return (sideAValid || sideBValid || sideCValid);
    }

    public void draw() {
        if (!this.isRight()) {
            return;
        }

        System.out.println("Printing side a : " + this.sideA);
        System.out.println("Printing side b : " + this.sideB);
        System.out.println("Printing side c : " + this.sideC);
    }
}
