package it.unibo.collections.comparators;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.lang.Math;

/**
 * 
 */
public final class UseSetWithOrder {

   /*
    public static void convertitore(Set<String> numeri){
        for (int i = 0; i <= numeri.size(); i++){
            Double.parseDouble(i);
        }
    }
         */ 

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
       // Comprarator<String> comparator = new DoubleStringComparator();
        Set<String> numeri = new TreeSet<>(new DoubleStringComparator());
        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */
        double n = Math.random();
        String m = String.valueOf(n);
        numeri.add(m);
        //numeri.add(String.valueOf(Math.random()));
        /*
         * 3) Prints the set, which must be ordered
         */
        System.out.println(numeri);
    }
}
