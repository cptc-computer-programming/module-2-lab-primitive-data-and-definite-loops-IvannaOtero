package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: Call each method below in this order:
        // printEdge();
        // printDiamondTop();
        // printDiamondBottom();
        // printEdge();
    }

    // TODO: Print the edge line that fits the width for SIZE.
    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {

    }

    // TODO: Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {

        // loop through the total rows in the top half of  the diamond
        // we know that SIZE = 3, total row is 6

        for(int row = 0; row < SIZE * 2; row++) { 
            // beging hte row with a | 
            System.out.print("|")
            }
            // Print leading dots (hardcoded first row)
         for (int i = 0; i < 5; i ++) {
             System.out.print(".")
            }
            
            //  print triangles (hardcoded first row) 



            // print traling dots ( hardcoded first row)
            for (int i = 0; i < 5; i ++) {
                System.out.print(".")
            }

        

    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {

    }
    
}
