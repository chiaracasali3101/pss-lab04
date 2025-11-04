package it.unibo.collections.comparators;
import java.util.Comparator;

public class DoubleStringComparator implements Comparator<String>{
    public int compare(String a, String b) {
        double x = Double.parseDouble(a);
        double y= Double.parseDouble(b);
        if (x > y){
            return 1;
        }
        if (x < y){
            return -1;
        }
        return 0;   
    } 
    
}
