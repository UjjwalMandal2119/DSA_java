package Loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        do { 
            System.out.println(i);   //print atleast one 
            i++;
        } while (i<1);
    }
}


// Easy intuition

// Do first, decide later = do-while.

// Examples:

// ATM PIN
// Login retry
// Menu ordering
// Play again games
// OTP verification

// All follow:

// Do something first
// Check condition later
// Repeat if needed