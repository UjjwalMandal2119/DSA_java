string is a array of character

Java String Notes & Formulas
1. Basics
Definition:
String in Java is an immutable sequence of characters stored in the String pool.
Creation:
Java

Copy code
String s1 = "Hello";              // String literal (in String pool)
String s2 = new String("Hello");  // New object in heap
2. Common String Methods (Cheat Sheet)
Method	Description	Example	Output
length()	Returns length	"Java".length()	4
charAt(i)	Returns char at index	"Java".charAt(2)	'v'
substring(start)	From index to end	"Java".substring(2)	"va"
substring(start, end)	From start to end-1	"Java".substring(1,3)	"av"
concat(str)	Joins strings	"Hi".concat(" Java")	"Hi Java"
equals(str)	Compares content	"Hi".equals("hi")	false
equalsIgnoreCase(str)	Ignores case	"Hi".equalsIgnoreCase("hi")	true
compareTo(str)	Lexicographic compare	"a".compareTo("b")	-1
toUpperCase()	Uppercase	"java".toUpperCase()	"JAVA"
toLowerCase()	Lowercase	"JAVA".toLowerCase()	"java"
trim()	Removes leading/trailing spaces	" hi ".trim()	"hi"
replace(old, new)	Replace chars	"java".replace('a','o')	"jovo"
contains(str)	Checks substring	"hello".contains("ell")	true
startsWith(str)	Checks prefix	"hello".startsWith("he")	true
endsWith(str)	Checks suffix	"hello".endsWith("lo")	true
split(regex)	Splits string	"a,b,c".split(",")	["a","b","c"]
indexOf(ch)	First occurrence	"banana".indexOf('a')	1
lastIndexOf(ch)	Last occurrence	"banana".lastIndexOf('a')	5
3. String Formulas / Key Points
Reverse a String:
Java

Copy code
String rev = new StringBuilder(str).reverse().toString();
Check Palindrome:
Java

Copy code
boolean isPal = str.equals(new StringBuilder(str).reverse().toString());
Count Vowels:
Java

Copy code
long count = str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
Remove Spaces:
Java

Copy code
String noSpaces = str.replaceAll("\\s+", "");
String to Char Array:
Java

Copy code
char[] arr = str.toCharArray();
4. StringBuilder & StringBuffer
Mutable alternatives to String.
StringBuilder → Faster, not thread-safe.
StringBuffer → Thread-safe, slower.
Example:

Java

Copy code
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Hello World


String Methods

Description

int length()
Returns the number of characters in the String.

char charAt(int i)
Returns the character at ith index.

String substring (int i)
Return the substring from the ith  index character to end.

String substring (int i, int j)
Returns the substring from i to j-1 index.

String concat( String str)
Concatenates specified string to the end of this string.

int indexOf (String s)
Finds the position of the first occurrence of the given substring within the main string. If the specified string s is not found in the input string, the method returns -1 by default.

int indexOf (String s, int i)
Returns the index within the string of the first occurrence of the specified string, starting at the specified index.

int lastIndexOf( String s)
Returns the index within the string of the last occurrence of the specified string.
If the specified string s is not found in the input string, the method returns -1 by default.

boolean equals( Object otherObj)
Compares this string to the specified object.

boolean  equalsIgnoreCase (String anotherString)
Compares string to another string, ignoring case considerations.

int compareTo( String anotherString) 
Compares two string lexicographically.

int compareToIgnoreCase( String anotherString) 
Compares two string lexicographically, ignoring case considerations.

Note: In this case, it will not consider case of a letter (it will ignore whether it is uppercase or lowercase).

String toLowerCase()
Converts all the characters in the String to lower case.

String toUpperCase()
Converts all the characters in the String to upper case.

String trim()
Returns the copy of the String, by removing whitespaces at both ends. Whitespace characters between words remain unchanged.

String replace (char oldChar, char newChar)
Generates a new string where every instance of oldChar is substituted with newChar.

Note: s1 is still feeksforfeeks and s2 is geeksgorgeeks

boolean contains(CharSequence sequence)
Returns true if string contains the given string.

Char[] toCharArray()
Converts this String to a new character array.

boolean startsWith(String prefix)
Return true if string starts with this prefix.

equal() method to check if one string is equal to another.

Java Program to Differentiate String == operator and equals() method

class Main {

  public static void main(String[] args) {

    String name1 = new String("Programiz");
    String name2 = new String("Programiz");

    System.out.println("Check if two strings are equal");

    // check if two strings are equal
    // using == operator
    boolean result1 = (name1 == name2);
    System.out.println("Using == operator: " + result1);

    // using equals() method
    boolean result2 = name1.equals(name2);
    System.out.println("Using equals(): " + result2);
  }
}

Check if two strings are equal
Using == operator: false
Using equals(): true

== checks if the reference to string objects are equal or not. Here, name1 and name2 are two different references. Hence, it returns false.
equals() checks if the content of the string object are equal. Here, the content of both the objects name1 and name2 is the same Programiz. Hence, it returns true.

Example 2: Differentiate == and equals()
class Main {

  public static void main(String[] args) {

    String name1 = new String("Programiz");
    String name2 = name1;

    System.out.println("Check if two strings are equal");

    // check if two strings are equal
    // using == operator
    boolean result1 = (name1 == name2);
    System.out.println("Using == operator: " + result1);

    // using equals() method
    boolean result2 = name1.equals(name2);
    System.out.println("Using equals(): " + result2);
  }
}
Run Code
Output

Check if two strings are equal
Using == operator: true
Using equals(): true
Here, name1 and name2 both are refering to the same object. Hence, name1 == name2 returns true.

In java String is a CLASS
String is a non -primitive data type

declaration
hard and new keyword 
both have different type of memory location

