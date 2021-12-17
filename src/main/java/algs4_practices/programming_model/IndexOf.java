package algs4_practices.programming_model;

import edu.princeton.cs.algs4.StdOut;


public class IndexOf {

    public static int indexOf(int[] a, int key) {
        return indexOf(a, key, 0, a.length - 1);
    }

    public static int indexOf(int[] a, int key, int lo, int hi) {
        // Index of key in a[], if present, is notsmaller than lo
        //                                  and not a larger than hi
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (key < a[mid]) {
            return indexOf(a, key, lo, mid - 1);
        }
        else  if (key > a[mid]) {
            return indexOf(a, key, mid + 1, hi);
        }
        else {
            return mid;
        }
    }

    /**
     * example (Find 11 index in '1, 3, 5, 9, 10, 11, 19' int array):
     * gradle run --args "IndexOf '1, 3, 5, 9, 10, 11, 19' 11"
     * @param args
     */
    public static void main(String[] args) {
        String[] strArray = args[0].split("[, ] ?");
        int[] intArray = new int[strArray.length];

        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        int key = indexOf(intArray, Integer.parseInt(args[1]));


        StdOut.println("searching: " + args[1]);
        StdOut.println("in: " + args[0]);
        StdOut.println("indexOf: ");
        StdOut.println("  " + String.valueOf(key));
    }
}