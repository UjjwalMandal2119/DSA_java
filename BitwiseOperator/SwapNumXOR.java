package BitwiseOperator;

public class SwapNumXOR {
    public static void main(String[] args) {
        int a = 5, b = 7;
             a = a ^ b;
             b = a ^ b;
             a = a ^ b;
             System.out.println(a +" " + b);
    }
}

// You can swap two variables without a temporary variable using the XOR bitwise operator (^) because XOR has the property that 
// a
// ⊕
// b
// ⊕
// a
// =
// b
// a⊕b⊕a=b and 
// a
// ⊕
// b
// ⊕
// b
// =
// a
// a⊕b⊕b=a.

// Step-by-Step Process
// Start with two integers: a = 5 (binary 0101) and b = 7 (binary 0111).

// a = a ^ b → a becomes 0101 ^ 0111 = 0010 (2); b is still 7.

// b = a ^ b → b becomes 0010 ^ 0111 = 0101 (5); a is still 2.

// a = a ^ b → a becomes 0010 ^ 0101 = 0111 (7); b is 5.

// Now a = 7 and b = 5—swapped!